package net.assertis.conferma;

import java.util.List;

/**
 * @author Daniel Dyer
 */
public class Trip
{
    private final TripType type;
    private final List<Ticket> tickets;
    private final List<Person> passengers;

    public Trip(TripType type,
                List<Ticket> tickets,
                List<Person> passengers)
    {
        this.type = type;
        this.tickets = tickets;
        this.passengers = passengers;
    }


    public TripType getType()
    {
        return type;
    }


    public String getOrigin()
    {
        return getTickets().get(0).getOrigin();
    }


    public String getDestination()
    {
        return getTickets().get(0).getDestination();
    }


    public List<Ticket> getTickets()
    {
        return tickets;
    }


    public String getDescription()
    {
        return type + " " + getOrigin() + " to " + getDestination();
    }


    public boolean hasPassengerInfo()
    {
        return !passengers.isEmpty();
    }


    public List<Person> getPassengers()
    {
        return passengers;
    }
}
