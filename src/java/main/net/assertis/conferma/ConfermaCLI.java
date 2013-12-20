package net.assertis.conferma;

import com.conferma.cpapi.DeploymentStatus;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import org.apache.axis2.AxisFault;
import org.apache.log4j.PropertyConfigurator;
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

    private static String confermaEndpoint;
    private static String confermaUser;
    private static String confermaPassword;
    private static int confermaAgentId;
    private static int confermaBookerId;
    private static int confermaClientId;

    private static RequestType requestType;
    private static String retryCount; // Uniquifier for requests.

    private static Order order;
    private static int deploymentId;
    private static DeploymentStatus.Enum deploymentStatus;
    private static String message;

    public static void main(String[] args) throws XMLStreamException,
                                                  IOException,
                                                  SAXException,
                                                  ParserConfigurationException,
                                                  ParseException
    {
        boolean logXML = args.length > 0 && args[0].equals("--log-xml");
        configureLogging(logXML);

        readXML();

        ConfermaClient client = new ConfermaClient(confermaEndpoint,
                                                   confermaUser,
                                                   confermaPassword,
                                                   confermaAgentId,
                                                   confermaBookerId,
                                                   confermaClientId);
        try
        {
            switch (requestType)
            {
                case PURCHASE:
                    System.out.println(client.getCardForPayment(order));
                    break;
                case REFUND:
                    System.out.println(client.getCardForRefund(order));
                    break;
                case UPDATE_DEPLOYMENT:
                    System.out.println(client.updateDeployment(deploymentId, deploymentStatus));
                    break;
                case PING:
                    System.out.println(client.ping(message));
                    break;
            }
        }
        catch (AxisFault axisFault)
        {
            // Don't dump the whole stack trace on the user.
            System.err.println(axisFault.getMessage());
        }
    }


    private static void configureLogging(boolean logXML)
    {
        Properties loggingProperties = new Properties();
        loggingProperties.setProperty("log4j.rootLogger", "WARN, stdout");
        loggingProperties.setProperty("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
        loggingProperties.setProperty("log4j.appender.stdout.layout", "org.apache.log4j.PatternLayout");
        loggingProperties.setProperty("log4j.appender.stdout.layout.ConversionPattern", "%d [%t] %-5p %c - %m%n");

        if (logXML)
        {
            loggingProperties.setProperty("log4j.logger.httpclient.wire", "DEBUG, R");
            loggingProperties.setProperty("log4j.additivity.httpclient.wire", "false");

            loggingProperties.setProperty("log4j.appender.R", "org.apache.log4j.RollingFileAppender");
            loggingProperties.setProperty("log4j.appender.R.File", "axis.log");

            loggingProperties.setProperty("log4j.appender.R.MaxFileSize", "100MB");
            loggingProperties.setProperty("log4j.appender.R.MaxBackupIndex", "5");

            loggingProperties.setProperty("log4j.appender.R.layout", "org.apache.log4j.PatternLayout");
            loggingProperties.setProperty("log4j.appender.R.layout.ConversionPattern", "%d [%t] %-5p %c - %m%n");
        }
        PropertyConfigurator.configure(loggingProperties);
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
        confermaEndpoint = root.getAttribute("endpoint");
        confermaUser = root.getAttribute("user");
        confermaPassword = root.getAttribute("password");
        confermaAgentId = Integer.parseInt(root.getAttribute("agent"));
        confermaBookerId = Integer.parseInt(root.getAttribute("booker"));
        confermaClientId = Integer.parseInt(root.getAttribute("client"));
        retryCount = root.getAttribute("retrycount");
        if (root.getTagName().equals("Ping"))
        {
            requestType = RequestType.PING;
            message = root.getAttribute("message");
        }
        else if (root.getTagName().equals("UpdateDeployment"))
        {
            requestType = RequestType.UPDATE_DEPLOYMENT;
            deploymentId = Integer.parseInt(root.getAttribute("id"));
            String status = root.getAttribute("status");
            if (status.equals("FailedWithSupplier"))
            {
                deploymentStatus = DeploymentStatus.FAILED_WITH_SUPPLIER;
            }
            else
            {
                throw new IllegalArgumentException("Unknown status: " + status);
            }
        }
        else
        {
            requestType = root.getAttribute("refund").equalsIgnoreCase("YES")
                        ? RequestType.REFUND
                        : RequestType.PURCHASE;
            order = readOrder((Element) root.getElementsByTagName("Order").item(0));
        }
    }


    private static Order readOrder(Element item) throws ParseException
    {
        Trip trip = readTrip((Element) item.getElementsByTagName("Trip").item(0));
        Customer customer = readCustomer((Element) item.getElementsByTagName("Customer").item(0));
        NodeList businessTags = item.getElementsByTagName("Business");
        Business business = businessTags.getLength() > 0 ? readBusiness((Element) businessTags.item(0)) : null;
        return new Order(Long.parseLong(item.getAttribute("id")),
                         trip,
                         new BigDecimal(item.getAttribute("total")),
                         new BigDecimal(item.getAttribute("bookingfee")),
                         new BigDecimal(item.getAttribute("deliveryfee")),
                         new BigDecimal(item.getAttribute("plusbus")),
                         customer,
                         business);
    }


    private static Customer readCustomer(Element item)
    {
        return new Customer(item.getAttribute("title"),
                            item.getAttribute("forenames"),
                            item.getAttribute("surname"));
    }


    private static Passenger readPassenger(Element item)
    {
        return new Passenger(item.getAttribute("name"),
                             Arrays.asList(item.getAttribute("costcentres").split(",")));
    }

    private static Trip readTrip(Element item) throws ParseException
    {
        TripType type = TripType.fromXMLValue(item.getAttribute("type"));
        int passengerCount = Integer.parseInt(item.getAttribute("passengercount"));
        List<Ticket> tickets = new ArrayList<Ticket>();
        List<Passenger> passengers = new ArrayList<Passenger>();
        NodeList ticketElements = item.getElementsByTagName("Ticket");
        for (int i = 0; i < ticketElements.getLength(); i++)
        {
            tickets.add(readTicket((Element) ticketElements.item(i)));
        }
        NodeList passengerElements = item.getElementsByTagName("Passenger");
        for (int i = 0; i < passengerElements.getLength(); i++)
        {
            passengers.add(readPassenger((Element) passengerElements.item(i)));
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
                          item.getAttribute("firstclass").equalsIgnoreCase("YES"),
                          new BigDecimal(item.getAttribute("price")),
                          item.getAttribute("description"));
    }


    private static Portion readPortion(Element item) throws ParseException
    {
        return new Portion(item.getAttribute("origin"),
                           item.getAttribute("destination"),
                           DATE_FORMAT.parse(item.getAttribute("validfrom")),
                           DATE_FORMAT.parse(item.getAttribute("validuntil")),
                           item.getAttribute("operator"));
    }


    private static Business readBusiness(Element item)
    {
        return new Business(Integer.parseInt(item.getAttribute("id")),
                            item.getAttribute("name"));
    }


    private static enum RequestType
    {
        PURCHASE,
        REFUND,
        UPDATE_DEPLOYMENT,
        PING
    }
}
