package net.assertis.conferma;

import java.util.List;

/**
 * @author Daniel Dyer
 */
public class Trip
{
    private final TripType type;
    private final List<Ticket> tickets;
    private final int passengerCount;
    private final List<Person> passengers;

    /**
     * @param type The type of trip (single, return, two singles).
     * @param tickets The tickets for the trip.
     * @param passengerCount The number of passengers for this trip.  We may not have their details so
     * the subsequent list of passengers may be empty,
     * @param passengers Passenger details (if known).
     */
    public Trip(TripType type,
                List<Ticket> tickets,
                int passengerCount,
                List<Person> passengers)
    {
        this.type = type;
        this.tickets = tickets;
        this.passengerCount = passengerCount;
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


    public int getPassengerCount()
    {
        return passengerCount;
    }


    public List<Person> getPassengers()
    {
        return passengers;
    }
}
