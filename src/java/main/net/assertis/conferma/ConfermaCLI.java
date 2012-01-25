package net.assertis.conferma;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import org.apache.axis2.AxisFault;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * This class reads a request from standard input, passes it onto the Conferma web service and writes the result to
 * standard output (if an error occurs it is written to standard error).
 * @author Daniel Dyer
 */
public class ConfermaCLI
{
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm");

    private static String confermaUser;
    private static String confermaPassword;
    private static int confermaAgentId;
    private static int confermaBookerId;
    private static int confermaClientId;
    private static boolean refund;

    private static Order order;

    public static void main(String[] args) throws XMLStreamException,
                                                  IOException,
                                                  SAXException,
                                                  ParserConfigurationException,
                                                  ParseException
    {
        configureLogging();

        readXML();

        ConfermaClient client = new ConfermaClient(confermaUser,
                                                   confermaPassword,
                                                   confermaAgentId,
                                                   confermaBookerId,
                                                   confermaClientId);
        try
        {
            CardDeployment card = refund ? client.getCardForRefund(order) :  client.getCardForPayment(order);
            System.out.println(card);
        }
        catch (AxisFault axisFault)
        {
            // Don't dump the whole stack trace on the user.
            System.err.println(axisFault.getMessage());
        }
    }

    private static void configureLogging()
    {
        // Suppress INFO messages.
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.axis2", "error");
    }


    /**
     * Read the data passed into Standard input.  This is an ad-hoc XML format containing the minimal order
     * data required by Conferma.
     */
    private static void readXML() throws IOException, ParserConfigurationException, SAXException, ParseException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(System.in);
        Element root = document.getDocumentElement();
        confermaUser = root.getAttributes().getNamedItem("user").getNodeValue();
        confermaPassword = root.getAttributes().getNamedItem("password").getNodeValue();
        confermaAgentId = Integer.parseInt(root.getAttributes().getNamedItem("agent").getNodeValue());
        confermaBookerId = Integer.parseInt(root.getAttributes().getNamedItem("booker").getNodeValue());
        confermaClientId = Integer.parseInt(root.getAttributes().getNamedItem("client").getNodeValue());
        refund = root.getAttributes().getNamedItem("refund").getNodeValue().equalsIgnoreCase("YES");
        order = readOrder((Element) root.getElementsByTagName("Order").item(0));
    }

    private static Order readOrder(Element item) throws ParseException
    {
        Trip trip = readTrip((Element) item.getElementsByTagName("Trip").item(0));
        Person customer = readPerson((Element) item.getElementsByTagName("Customer").item(0));
        return new Order(Long.parseLong(item.getAttributes().getNamedItem("id").getNodeValue()),
                         trip,
                         new BigDecimal(item.getAttributes().getNamedItem("total").getNodeValue()),
                         new BigDecimal(item.getAttributes().getNamedItem("bookingfee").getNodeValue()),
                         new BigDecimal(item.getAttributes().getNamedItem("deliveryfee").getNodeValue()),
                         new BigDecimal(item.getAttributes().getNamedItem("plusbus").getNodeValue()),
                         customer,
                         item.getAttributes().getNamedItem("costcentre").getNodeValue(),
                         item.getAttributes().getNamedItem("purchaseorder").getNodeValue());
    }


    private static Person readPerson(Element item)
    {
        return new Person(item.getAttributes().getNamedItem("title").getNodeValue(),
                          item.getAttributes().getNamedItem("forenames").getNodeValue(),
                          item.getAttributes().getNamedItem("surname").getNodeValue());
    }


    private static Trip readTrip(Element item) throws ParseException
    {
        TripType type = TripType.fromXMLValue(item.getAttributes().getNamedItem("type").getNodeValue());
        int passengerCount = Integer.parseInt(item.getAttributes().getNamedItem("passengercount").getNodeValue());
        List<Ticket> tickets = new ArrayList<Ticket>();
        List<Person> passengers = new ArrayList<Person>();
        NodeList ticketElements = item.getElementsByTagName("Ticket");
        for (int i = 0; i < ticketElements.getLength(); i++)
        {
            tickets.add(readTicket((Element) ticketElements.item(i)));
        }
        NodeList passengerElements = item.getElementsByTagName("Passenger");
        for (int i = 0; i < passengerElements.getLength(); i++)
        {
            passengers.add(readPerson((Element) passengerElements.item(i)));
        }
        return new Trip(type, tickets, passengerCount, passengers);
    }


    private static Ticket readTicket(Element item) throws ParseException
    {
        Portion outwardPortion = readPortion((Element) item.getElementsByTagName("OutwardPortion").item(0));
        NodeList returnPortionElementList = item.getElementsByTagName("ReturnPortion");
        Portion returnPortion = returnPortionElementList.getLength() > 0
                              ? readPortion((Element) returnPortionElementList.item(0))
                              : null;
        return new Ticket(outwardPortion,
                          returnPortion,
                          item.getAttributes().getNamedItem("firstclass").getNodeValue().equalsIgnoreCase("YES"),
                          new BigDecimal(item.getAttributes().getNamedItem("price").getNodeValue()),
                          item.getAttributes().getNamedItem("description").getNodeValue());
    }


    private static Portion readPortion(Element item) throws ParseException
    {
        return new Portion(item.getAttributes().getNamedItem("origin").getNodeValue(),
                           item.getAttributes().getNamedItem("destination").getNodeValue(),
                           DATE_FORMAT.parse(item.getAttributes().getNamedItem("validfrom").getNodeValue()),
                           DATE_FORMAT.parse(item.getAttributes().getNamedItem("validuntil").getNodeValue()),
                           item.getAttributes().getNamedItem("operator").getNodeValue());
    }
}
