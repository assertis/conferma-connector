package net.assertis.conferma;

/**
 * @author Daniel Dyer
 */
public final class Person
{
    private final String title;
    private final String forenames;
    private final String surname;

    public Person(String title, String forenames, String surname)
    {
        this.title = title;
        this.forenames = forenames;
        this.surname = surname;
    }


    public String getTitle()
    {
        return title;
    }

    public String getForenames()
    {
        return forenames;
    }

    public String getSurname()
    {
        return surname;
    }
}
