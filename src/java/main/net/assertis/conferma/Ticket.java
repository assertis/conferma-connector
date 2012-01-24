package net.assertis.conferma;

import java.math.BigDecimal;

/**
 * @author Daniel Dyer
 */
public class Ticket
{
    private final Portion outwardPortion;
    private final Portion returnPortion;
    private final boolean firstClass;
    private final BigDecimal price;
    private final String description;

    public Ticket(Portion outwardPortion,
                  Portion returnPortion,
                  boolean firstClass,
                  BigDecimal price,
                  String description)
    {
        this.outwardPortion = outwardPortion;
        this.returnPortion = returnPortion;
        this.firstClass = firstClass;
        this.price = price;
        this.description = description;
    }


    public Portion getOutwardPortion()
    {
        return outwardPortion;
    }


    public Portion getReturnPortion()
    {
        return returnPortion;
    }


    public boolean isFirstClass()
    {
        return firstClass;
    }


    public BigDecimal getPrice()
    {
        return price;
    }


    public String getOrigin()
    {
        return outwardPortion.getOrigin();
    }


    public String getDestination()
    {
        return outwardPortion.getDestination();
    }


    public String getDescription()
    {
        return description;
    }
}
