/**
 * This is the parent class MicrosoftProduct. 
 * Many different variables are declared within it.
 * Constructor is made and different paramteres are passed with getter and setter method.
 * This class has display method to show the values stored.
 * @author (Biju Acharju)
 * @ID Number (19033545)
 */

/**
 * Main class is created with name MicrosoftProduct.
 */
public class MicrosoftProduct
{
    /**
     * These are attributes of main class MicrosoftProduct which cannot be directly accessed by other classes.
     */
    private int productNumber;
    private String productName;
    private String activationKey;
    private int price;

    /**
     * This is the constructor of the same class i.e. MicrosoftProduct.
     * It is has two parameters. They are productNumber and productName.
     * This constructor passes the values received to set the value of respective variables.
     * This constructor assigns the value of productNumber  and productName as per the value received in parameters.
     * It also sets the empty stringis assigned to activationKey and 0 to price.
     */
    public MicrosoftProduct(int productNumber, String productName)
    {
        this.productNumber = productNumber;
        this.productName = productName;
        this.activationKey = "";
        this.price = 0;
    }

    /**
     * This is a get method of the private integer variable productNumber.
     * It returns the value of productNumber if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. integer.
     */
    public int getProductNumber()
    {
        return productNumber;
    }

    /**
     * This is a set method of private integer variable productNumber.
     * It assigns the value of productNumber if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. integer.
     */
    public void setProductNumber(int productNumber)
    {
        this.productNumber = productNumber;
    }

    /**
     * This is a get method of private String variable productName.
     * It returns the value of productName if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. String.
     */
    public String getProductName()
    {
        return productName;
    }

    /**
     * This is a set method of private String variable productName.
     * It sets the value of productName if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. String.
     */
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    /**
     * This is a get method of private String variable activationKey.
     * It returns the value of activationKey if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. String.
     */
    public String getActivationKey()
    {
        return activationKey;
    }

    /**
     * This is a set method of private String variable activationKey.
     * It sets the value of activationKey if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. String.
     */
    public void setActivationKey(String activationKey)
    {
        this.activationKey = activationKey;
    }

    /**
     * This is a get method of private integer variable price.
     * It returns the value of price if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. integer.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * This is a set method of private int variable price.
     * It sets the value of price if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. integer.
     */
    public void setPrice(int price)
    {
        this.price = price;
    }

    /**
     * This is a method to display the details of MicrosoftProduct.
     * This will display the details like name of product and product number as default.
     * But it will only display values of activation key and price of product if their values are not empty string and 0 respectively.
     */
    public void display()
    {
        System.out.println("The product number of this Microsoft product is " + productNumber + ".");
        System.out.println("The name of this product is " + productName + ".");
        
        if (!activationKey.equals("")) {
            System.out.println("The activation key of this product is " + activationKey + ".");
        }
        else {
            System.out.println("The activation key has not been assigned yet.");
        }

        if (price != 0) {
            System.out.println("The total price of this product is " + price + ".");
        }
        else{
            System.out.println("The price has not been assigned yet.");
        }
    }

}