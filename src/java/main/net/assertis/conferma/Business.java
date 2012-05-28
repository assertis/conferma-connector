package net.assertis.conferma;

/**
 * @author Daniel Dyer
 */
public class Business
{
    private final int id;
    private final String name;

    public Business(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


    public int getId()
    {
        return id;
    }


    public String getName()
    {
        return name;
    }
}
