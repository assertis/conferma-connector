package net.assertis.conferma;

/**
 * @author Daniel Dyer
 */
public enum TripType
{
    SINGLE("Single"),
    TWO_SINGLES("Two Singles"),
    TWO_PART_RETURN("Two-Part Return");

    private final String description;

    TripType(String description)
    {
        this.description = description;
    }


    @Override
    public String toString()
    {
        return description;
    }


    public static TripType fromXMLValue(String value)
    {
        if (value.equals("Single"))
        {
            return SINGLE;
        }
        else if (value.equals("2 Singles"))
        {
            return TWO_SINGLES;
        }
        else if (value.equals("2-Part Return"))
        {
            return TWO_PART_RETURN;
        }
        else
        {
            throw new IllegalArgumentException("Invalid trip type: " + value);
        }
    }
}
