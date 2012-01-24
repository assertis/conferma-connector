package net.assertis.conferma;

/**
 * The card details returned by the GetCard method of the Conferma web service.
 * @author Daniel Dyer
 */
public class CardDeployment
{
    private int deploymentId;
    private String name;
    private String cardType;
    private String cardNumber;
    private String expiryMonth;
    private String expiryYear;
    private String cvv;

    public CardDeployment(int deploymentId,
                          String name,
                          String cardType,
                          String cardNumber,
                          String expiryMonth,
                          String expiryYear,
                          String cvv)
    {
        this.deploymentId = deploymentId;
        this.name = name;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
    }


    public int getDeploymentId()
    {
        return deploymentId;
    }


    public String getName()
    {
        return name;
    }


    public String getCardType()
    {
        return cardType;
    }


    public String getCardNumber()
    {
        return cardNumber;
    }


    public String getExpiryMonth()
    {
        return expiryMonth;
    }


    public String getExpiryYear()
    {
        return expiryYear;
    }


    public String getCVV()
    {
        return cvv;
    }


    @Override
    public String toString()
    {
        return "DeploymentID=" + deploymentId +
               "\nName=" + name +
               "\nNumber=" + cardNumber +
               "\nType=" + cardType +
               "\nExpiryMonth=" + expiryMonth +
               "\nExpiryYear=" + expiryYear +
               "\nCVV=" + cvv;
    }
}
