package net.assertis.conferma;

import java.util.Date;

/**
 * @author Daniel Dyer
 */
public class Portion
{
    private final String origin;
    private final String destination;
    private final Date validFrom;
    private final Date validUntil;
    private final String operator;

    public Portion(String origin,
                   String destination,
                   Date validFrom,
                   Date validUntil,
                   String operator)
    {
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.origin = origin;
        this.destination = destination;
        this.operator = operator;
    }


    public String getOrigin()
    {
        return origin;
    }

    public String getDestination()
    {
        return destination;
    }

    public Date getValidFrom()
    {
        return validFrom;
    }

    public Date getValidUntil()
    {
        return validUntil;
    }

    public String getOperator()
    {
        return operator;
    }
}
