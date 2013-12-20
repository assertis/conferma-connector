package net.assertis.conferma;

import com.conferma.cpapi.Address;
import com.conferma.cpapi.AdvancedJourney;
import com.conferma.cpapi.Amount;
import com.conferma.cpapi.ArrayOfIdentifier;
import com.conferma.cpapi.ArrayOfTraveller;
import com.conferma.cpapi.Card;
import com.conferma.cpapi.ConfermaUserStateHeader;
import com.conferma.cpapi.ConfermaUserStateHeaderDocument;
import com.conferma.cpapi.DateRange;
import com.conferma.cpapi.DeploymentStatus;
import com.conferma.cpapi.GeneralPayee;
import com.conferma.cpapi.GetCardDocument;
import com.conferma.cpapi.GetCardRequest;
import com.conferma.cpapi.GetCardResponse;
import com.conferma.cpapi.GetCardResponseDocument;
import com.conferma.cpapi.Identifier;
import com.conferma.cpapi.Operator;
import com.conferma.cpapi.PayeeType;
import com.conferma.cpapi.PingDocument;
import com.conferma.cpapi.PingResponseDocument;
import com.conferma.cpapi.Rail;
import com.conferma.cpapi.Supplier;
import com.conferma.cpapi.TicketClass;
import com.conferma.cpapi.Traveller;
import com.conferma.cpapi.UpdateDeploymentDocument;
import com.conferma.cpapi.UpdateDeploymentRequest;
import com.conferma.cpapi.UpdateDeploymentResponseDocument;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.AddressingConstants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;
import org.apache.rampart.RampartMessageData;

/**
 * Class for communicating with the Conferma web service from Java.  Uses stubs generated by Axis 2 with
 * XML Beans (tried to use the simpler ADB stub generator but it generated code that didn't compile).
 * @author Daniel Dyer
 */
public class ConfermaClient
{
    private final int agentId;
    private final int bookerId;
    private final int clientId;
    private final Conferma_x0020_Payment_x0020_APIStub stub;


    /**
     * @param endpoint The web service to connect to (different for test and live installations).
     * @param user Conferma-supplied user name.
     * @param password Conferma-supplied password.
     * @param agentId Conferma-supplied agent ID.
     * @param bookerId Conferma-supplied booker ID.
     * @param clientId Conferma-supplied client ID.
     * @throws XMLStreamException If there is a problem processing data from the web service.
     * @throws AxisFault If there is a problem communicating with the web service.
     */
    public ConfermaClient(String endpoint,
                          String user,
                          String password,
                          int agentId,
                          int bookerId,
                          int clientId) throws XMLStreamException, AxisFault
    {
        this.agentId = agentId;
        this.bookerId = bookerId;
        this.clientId = clientId;
        this.stub = createStub(createOptions(endpoint, user, password));
    }


    private Options createOptions(String endpoint, String user, String password) throws XMLStreamException
    {
        Options options = new Options();
        EndpointReference endpointReference = new EndpointReference(endpoint);
        options.setTo(endpointReference);
        // Conferma requires the submission version of WS-Addressing, rather than the later, final version.
        options.setProperty(AddressingConstants.WS_ADDRESSING_VERSION, AddressingConstants.Submission.WSA_NAMESPACE);

        // The version of getPolicy that takes an InputStream seems to be buggy, so we have to be slightly more indirect.
        StAXOMBuilder builder = new StAXOMBuilder(ConfermaClient.class.getClassLoader().getResourceAsStream("soap_policy.xml"));
        Policy policy = PolicyEngine.getPolicy(builder.getDocumentElement());
        options.setProperty(RampartMessageData.KEY_RAMPART_POLICY, policy);

        options.setUserName(user);
        options.setPassword(password);
        return options;
    }


    private Conferma_x0020_Payment_x0020_APIStub createStub(Options options) throws org.apache.axis2.AxisFault
    {
        Conferma_x0020_Payment_x0020_APIStub stub = new Conferma_x0020_Payment_x0020_APIStub();
        stub._getServiceClient().setOptions(options);
        stub._getServiceClient().engageModule("addressing");
        stub._getServiceClient().engageModule("rampart");
        return stub;
    }


    /**
     * @param message The message text to send to the Conferma web service.  If everything is working
     * correctly, this will be returned reversed.
     * @return The response from the web service.
     * @throws RemoteException If there is a communication problem.
     */
    public String ping(String message) throws RemoteException
    {
        PingDocument request = PingDocument.Factory.newInstance();
        PingDocument.Ping ping = request.addNewPing();
        ping.setMessage(message);

        PingResponseDocument response = stub.ping(request, createUserStateHeaderDocument(agentId, bookerId, clientId));
        return response.getPingResponse().getPingResult();
    }


    /**
     * Update a previous deployment for a card.  Typically used to notify Conferma that the card wasn't charged
     * because something went wrong.
     * @param deploymentID The ID of the deployment.  This ID would have been acquired when the original deployment
     * was made.
     * @param status The new status for the deployment.
     * @return True if the update succeeded, false otherwise.
     * @throws RemoteException If there is a communication problem.
     */
    public boolean updateDeployment(int deploymentID, DeploymentStatus.Enum status) throws RemoteException
    {
        UpdateDeploymentDocument requestDocument = UpdateDeploymentDocument.Factory.newInstance();
        UpdateDeploymentDocument.UpdateDeployment updateDeployment = requestDocument.addNewUpdateDeployment();
        UpdateDeploymentRequest updateRequest = updateDeployment.addNewUpdateDeploymentRequest();
        updateRequest.setDeploymentID(deploymentID);
        updateRequest.setStatus(status);

        ConfermaUserStateHeaderDocument headerDocument = createUserStateHeaderDocument(agentId, bookerId, clientId);
        UpdateDeploymentResponseDocument responseDocument = stub.updateDeployment(requestDocument, headerDocument);
        return responseDocument.getUpdateDeploymentResponse().getUpdateDeploymentResult().getUpdated();
    }


    public CardDeployment getCardForPayment(Order order) throws RemoteException
    {
        return getCard(order.getTrip().getDescription(),
                       String.valueOf(order.getId()),
                       order.getTrip(),
                       order.getTotal(),
                       order.getBookingFee(),
                       order.getDeliveryFee(),
                       order.getPlusBus(),
                       order.getCustomer(),
                       order.getBusiness());
    }


    private CardDeployment getCard(String orderDescription,
                                   String consumerReference,
                                   Trip trip,
                                   BigDecimal orderValue,
                                   BigDecimal bookingFee,
                                   BigDecimal deliveryFee,
                                   BigDecimal plusBus,
                                   Customer customer,
                                   Business business) throws RemoteException
    {
        GetCardDocument requestDocument = GetCardDocument.Factory.newInstance();
        GetCardDocument.GetCard getCard = requestDocument.addNewGetCard();
        GetCardRequest cardRequest = getCard.addNewGetCardRequest();
        cardRequest.setType(PayeeType.Enum.forString("Rail"));
        cardRequest.setReturnCVV(true);
        cardRequest.setUseEmergencyCard(false);

        GeneralPayee general = cardRequest.addNewGeneral();
        setGeneralDetails(general, orderDescription, consumerReference, orderValue, business);

        Supplier supplier = cardRequest.addNewSupplier();
        addSupplierDetails(supplier, consumerReference);

        ArrayOfTraveller travellers = cardRequest.addNewTravellers();
        addCustomerDetails(travellers, customer);

        Rail rail = cardRequest.addNewRail();
        addOutwardJourneyDetails(rail, trip);
        addReturnJourneyDetails(rail, trip);

        ArrayOfIdentifier identifiers = cardRequest.addNewIdentifiers();
        setIdentifierDetails(identifiers,
                             bookingFee,
                             deliveryFee,
                             plusBus,
                             trip.getPassengers());

        GetCardResponseDocument responseDocument = stub.getCard(requestDocument,
                                                                createUserStateHeaderDocument(agentId, bookerId, clientId));
        GetCardResponse response = responseDocument.getGetCardResponse().getGetCardResult();
        Card card = response.getCard();
        return new CardDeployment(response.getDeploymentID(),
                                  card.getName(),
                                  card.getType(),
                                  card.getNumber(),
                                  card.getExpiryDate().getMonth(),
                                  card.getExpiryDate().getYear(),
                                  card.getCVV());
    }

    private CardDeployment getDeployment(String deploymentID) throws RemoteException
    {
        GetDeploymentDocument requestDocument = GetDeploymentDocument.Factory.newInstance();
        GetDeploymentDocument.GetDeployment getDeployment = requestDocument.addNewGetDeploymentRequest();
        GetDeploymentRequest deploymentRequest = getDeployment.getGetDeployment();
        deploymentRequest.setType(PayeeType.Enum.forString("Rail"));
        deploymentRequest.setDeploymentID(deploymentID);
        deploymentRequest.setReturnCVV(true);

        GetCardResponseDocument responseDocument = stub.getDeployment(requestDocument,
                                                                createUserStateHeaderDocument(agentId, bookerId, clientId));
        GetDeploymentResponse response = responseDocument.getGetDeploymentResponse().getGetDeploymentResult();
        Card card = response.getCard();
        return new CardDeployment(response.getDeploymentID(),
                                  card.getName(),
                                  card.getType(),
                                  card.getNumber(),
                                  card.getExpiryDate().getMonth(),
                                  card.getExpiryDate().getYear(),
                                  card.getCVV());
    }


    private void setGeneralDetails(GeneralPayee general,
                                   String orderDescription,
                                   String consumerReference,
                                   BigDecimal orderValue,
                                   Business business)
    {
        general.setName(orderDescription);
        general.setConsumerReference(consumerReference);
        Amount amount = general.addNewAmount();
        amount.setValue(orderValue);
        amount.setCurrency("GBP");
        DateRange paymentRange = general.addNewPaymentRange();
        paymentRange.setStartDate(Calendar.getInstance());
        Calendar threeDaysTime = Calendar.getInstance();
        threeDaysTime.add(Calendar.DAY_OF_YEAR, 3);
        paymentRange.setEndDate(threeDaysTime);
        if (business != null)
        {
            com.conferma.cpapi.Customer customer = general.addNewCustomer();
            customer.setID(String.valueOf(business.getId()));
            customer.setName(business.getName());
        }
    }


    private void addSupplierDetails(Supplier supplier, String supplierReference)
    {
        supplier.setID("mytrainticket.co.uk");
        supplier.setName("MyTrainTicket");
        supplier.setReference(supplierReference);
        Address address = supplier.addNewAddress();
        address.setAddressLine1("Assertis House");
        address.setAddressLine2("3 Calverley Street");
        address.setCity("Tunbridge Wells");
        address.setPostalOrZipCode("TN1 2BZ");
        address.setCountryCode("GB");
        address.setTelephone("01892 709647");
        address.setEmail("customerservice@mytrainticket.co.uk");
    }


    private void addCustomerDetails(ArrayOfTraveller travellers, Customer customer)
    {
        // If there isn't any passenger info captured for the order, the best we can do is send
        // the user's name to Conferma instead.
        Traveller traveller = travellers.addNewTraveller();
        traveller.setSalutation(customer.getTitle());
        traveller.setForename(customer.getForenames());
        traveller.setSurname(customer.getSurname());
    }


    private void addOutwardJourneyDetails(Rail rail, Trip trip)
    {
        AdvancedJourney outboundJourney = rail.addNewOutboundJourney();
        Ticket ticket = trip.getTickets().get(0);
        Portion portion = ticket.getOutwardPortion();
        BigDecimal price = ticket.getPrice();
        if (trip.getType().equals(TripType.TWO_PART_RETURN))
        {
            // For a two part return, divide the price of the ticket between the two directions so that it adds up
            // properly for Conferma.
            price = ticket.getPrice().divide(BigDecimal.valueOf(2));
        }
        setJourneyDetails(outboundJourney, ticket, portion, price);
    }


    private void addReturnJourneyDetails(Rail rail, Trip trip)
    {
        // There are no return journey details for a single.
        if (!trip.getType().equals(TripType.SINGLE))
        {
            AdvancedJourney returnJourney = rail.addNewReturnJourney();
            if (trip.getType().equals(TripType.TWO_SINGLES))
            {
                Ticket ticket = trip.getTickets().get(1);
                setJourneyDetails(returnJourney, ticket, ticket.getOutwardPortion(), ticket.getPrice());
            }
            else // Two-part return.
            {
                Ticket ticket = trip.getTickets().get(0);
                // For a two part return, divide the price of the ticket between the two directions so that it adds up
                // properly for Conferma.
                BigDecimal price = ticket.getPrice().divide(BigDecimal.valueOf(2));
                setJourneyDetails(returnJourney, ticket, ticket.getReturnPortion(), price);
            }
        }
    }


    private void setJourneyDetails(AdvancedJourney journey,
                                   Ticket ticket,
                                   Portion portion,
                                   BigDecimal price)
    {
        journey.setStartLocation(portion.getOrigin());
        Calendar validFrom = Calendar.getInstance();
        validFrom.setTime(portion.getValidFrom());
        journey.setStartDateTime(validFrom);
        journey.setEndLocation(portion.getDestination());
        Calendar validUntil = Calendar.getInstance();
        validUntil.setTime(portion.getValidUntil());
        journey.setEndDateTime(validUntil);

        Operator operator = journey.addNewOperator();
        operator.setName(portion.getOperator());
        com.conferma.cpapi.Ticket apiTicket = journey.addNewTicket();
        apiTicket.setCost(price.toPlainString());
        apiTicket.setClass1(TicketClass.Enum.forString(ticket.isFirstClass() ? "First" : "Economy"));
        apiTicket.setDescription(ticket.getDescription());
    }


    private void setIdentifierDetails(ArrayOfIdentifier identifiers,
                                      BigDecimal bookingFee,
                                      BigDecimal deliveryFee,
                                      BigDecimal plusBus,
                                      List<Passenger> passengers)
    {
        // Slightly hacky way of sending extra info to Conferma, but it's what they asked for.
        if (bookingFee.compareTo(BigDecimal.ZERO) > 0)
        {
            Identifier bookingFeeIdentifier = identifiers.addNewIdentifier();
            bookingFeeIdentifier.setKey("Booking Fee");
            bookingFeeIdentifier.setValue(bookingFee.toPlainString());
        }
        if (deliveryFee.compareTo(BigDecimal.ZERO) > 0)
        {
            Identifier deliveryFeeIdentifier = identifiers.addNewIdentifier();
            deliveryFeeIdentifier.setKey("Delivery Fee");
            deliveryFeeIdentifier.setValue(deliveryFee.toPlainString());
        }
        if (plusBus.compareTo(BigDecimal.ZERO) > 0)
        {
            Identifier plusBusIdentifier = identifiers.addNewIdentifier();
            plusBusIdentifier.setKey("PlusBus");
            plusBusIdentifier.setValue(plusBus.toPlainString());
        }
        int index = 0;
        for (Passenger passenger : passengers)
        {
            Identifier passengerIdentifier = identifiers.addNewIdentifier();
            passengerIdentifier.setKey("Passenger " + (++index));
            passengerIdentifier.setValue(passengerToIdentifierValue(passenger));
        }
    }

    private String passengerToIdentifierValue(Passenger passenger)
    {
        StringBuilder builder = new StringBuilder(passenger.getName());
        List<String> costCentres = passenger.getCostCentres();
        for (String costCentre : costCentres)
        {
            builder.append("//");
            // Double forward slash is used as a separator so it mustn't occur in the string.
            builder.append(costCentre.replaceAll("//+", "/"));
        }
        return builder.toString();
    }


    private ConfermaUserStateHeaderDocument createUserStateHeaderDocument(int agentId, int bookerId, int clientId)
    {
        ConfermaUserStateHeaderDocument headerDoc = ConfermaUserStateHeaderDocument.Factory.newInstance();
        ConfermaUserStateHeader header = headerDoc.addNewConfermaUserStateHeader();
        header.setAgentID(String.valueOf(agentId));
        header.setBookerID(String.valueOf(bookerId));
        header.setClientID(String.valueOf(clientId));
        return headerDoc;
    }
}
