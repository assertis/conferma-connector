package net.assertis.conferma;

import java.util.List;

/**
 * @author Daniel Dyer
 */
public final class Passenger
{
    private final String name;
    private final List<String> costCentres;

    public Passenger(String name, List<String> costCentres)
    {
        this.name = name;
        this.costCentres = costCentres;
    }


    public String getName()
    {
        return name;
    }


    public List<String> getCostCentres()
    {
        return costCentres;
    }
}
