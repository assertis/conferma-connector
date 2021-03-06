package net.assertis.conferma;

import java.math.BigDecimal;

/**
 * @author Daniel Dyer
 */
public class Order
{
    private final long id;
    private final Trip trip;
    private final BigDecimal total;
    private final BigDecimal bookingFee;
    private final BigDecimal deliveryFee;
    private final BigDecimal plusBus;
    private final Customer customer;
    private final Business business;

    /**
     * @param id The order id.
     * @param trip The trip details for the order (for Conferma bookings, the Assertis WebTIS only allows one
     * trip per order because of Conferma limitations).
     * @param total The total value of the order including all tickets, booking/delivery fees and add-ons
     * (PlusBus etc.).
     * @param bookingFee The booking fee associated with the order (could be zero).
     * @param deliveryFee The delivery fee (e.g. postage costs) for the order (may be zero for some fulfilment
     * types).
     * @param plusBus The cost of any PlusBus tickets.
     * @param customer The customer who placed the order.
     * @param business The business that this order belongs to (may be null).
     */
    public Order(long id,
                 Trip trip,
                 BigDecimal total,
                 BigDecimal bookingFee,
                 BigDecimal deliveryFee,
                 BigDecimal plusBus,
                 Customer customer,
                 Business business)
    {
        this.id = id;
        this.trip = trip;
        this.total = total;
        this.bookingFee = bookingFee;
        this.deliveryFee = deliveryFee;
        this.plusBus = plusBus;
        this.customer = customer;
        this.business = business;
    }


    public long getId()
    {
        return id;
    }

    public Trip getTrip()
    {
        return trip;
    }

    public BigDecimal getTotal()
    {
        return total;
    }

    public BigDecimal getBookingFee()
    {
        return bookingFee;
    }

    public BigDecimal getDeliveryFee()
    {
        return deliveryFee;
    }

    public BigDecimal getPlusBus()
    {
        return plusBus;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public Business getBusiness()
    {
        return business;
    }
}
