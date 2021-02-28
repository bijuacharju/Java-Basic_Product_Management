/**
 * This is a subclass EnterpriseEdition of main class MicrosoftProduct.
 * This class inherits the properties and behaviour of class MicrosoftProduct using extends keyword.
 * This class has display method to show the values stored.
 * @author (Biju Acharju)
 * @ID Number (19033545)
 */

/**
 * This is a subclass EnterpriseEdition.
 * Its main class is MicrosoftProduct.
 * It inherits the feature and properties of MicrosoftProduct using extends keyword.
 */
public class EnterpriseEdition extends MicrosoftProduct
{

    /**
     * These are attributes of subclass EnterpriseEdition which cannot be directly accessed by other classes.
     */
    private String clientCompanyName;
    private int pricePerUser;
    private int numberOfUsers;
    private String activationDate;
    private String licenseExpireDate;
    private boolean isActivated;
    private boolean isExpired;
    private boolean isTerminated;
    
    /**
     * This is the constructor of same class i.e. EnterpriseEdition.
     * It has three parameters. They are productNumber, productName and pricePerUser.
     * This constructor passes the value received in parameter to main class.
     * This constructor also assigns the value to attributes of its own class.
     */
    public EnterpriseEdition(int productNumber, String productName, int pricePerUser)
    {
        super(productNumber, productName);
        this.pricePerUser = pricePerUser;
        this.numberOfUsers = 0;
        this.activationDate = "";
        this.licenseExpireDate = "";
        this.isActivated = false;
        this.isExpired = false;
        this.isTerminated = false;
    }

    /**
     * This is a get method of private String variable getClientCompanyName.
     * It returns the value of clientCompanyName if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. String.
     */
    public String getClientCompanyName()
    {
        return clientCompanyName;
    }

    /**
     * This is a set method of private String variable clientCompanyName.
     * It sets the value of clientCompanyName if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. String.
     */
    public void setClientCompanyName(String clientCompanyName)
    {
        this.clientCompanyName = clientCompanyName;
    }

    /**
     * This is a get method of private integer variable pricePerUser.
     * It returns the value of pricePerUser if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. integer.
     */
    public int getPricePerUser()
    {
        return pricePerUser;
    }
    
    /**
     * This is a get method of private integer variable numberOfUser.
     * It returns the value of numberOfUser if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. integer.
     */
    public int getNumberOfUsers()
    {
        return numberOfUsers;
    }

    /**
     * This is a set method of private int variable numberOfUser.
     * It sets the value of numberOfUser if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. integer.
     */
    public void setNumberOfUsers(int numberOfUsers)
    {
        this.numberOfUsers = numberOfUsers;
    }

    /**
     * This is a get method of private String variable activationDate.
     * It returns the value of activationDate if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. String.
     */
    public String getActivationDate()
    {
        return activationDate;
    }


    /**
     * This is a set method of private String variable activationDate.
     * It sets the value of activationDate if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. String.
     */
    public void setActivationDate(String activationDate)
    {
        this.activationDate = activationDate;
    }

    /**
     * This is a get method of private String variable licenseExpireDate.
     * It returns the value of licenseExpireDate if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. String.
     */
    public String getLicenseExpireDate()
    {
        return licenseExpireDate;
    }

    /**
     * This is a set method of private String variable licenseExpireDate.
     * It sets the value of licenseExpireDate if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. String.
     */
    public void setLicenseExpireDate(String licenseExpireDate)
    {
        licenseExpireDate = licenseExpireDate;
    }

    /**
     * This is a get method of the private boolean variable isActivated.
     * It returns the value of isActivated if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. boolean.
     */
    public boolean isActivated()
    {
        return isActivated;
    }

    /**
     * This is a set method of private boolean variable isActivated.
     * It sets the value of isActivated if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. boolean.
     */
    public void setActivated(boolean activated)
    {
        isActivated = activated;
    }

    /**
     * This is a get method of the private boolean variable isExpired.
     * It returns the value of isExpired if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. boolean.
     */
    public boolean isExpired()
    {
        return isExpired;
    }

    /**
     * This is a set method of private boolean variable isExpired.
     * It sets the value of isExpired if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. boolean.
     */
    public void setExpired(boolean expired)
    {
        isExpired = expired;
    }

    /**
     * This is a get method of the private boolean variable isTerminated.
     * It returns the value of isTerminated if the get method is called in other classes or subclasses.
     * Value of same data type is returned i.e. boolean.
     */
    public boolean isTerminated()
    {
        return isTerminated;
    }

    /**
     * This is a set method of private boolean variable isTerminated.
     * It sets the value of isTerminated if values are passed using set method in other classes or subclasses.
     * Value of same data type is stored i.e. boolean.
     */
    public void setTerminated(boolean terminated)
    {
        isTerminated = terminated;
    }

    /**
     * This is a method to change the pricePerUser of the product.
     * It has pricePerUser as parameter.
     * It changes the value of pricePerUser if the license is not granted.
     */
    public void pricePerUser(int pricePerUser)
    {
        if (!isActivated) {
            this.pricePerUser = pricePerUser;
            System.out.println("The price per user of product has been changed successfully to " + pricePerUser + ".\n");
        } else {
            System.out.println("The product license has already been granted. So, the license price for per user of product cannot be changed.\n");
        }
    }

    /**
     * This is a method to activate the license of product.
     * It has five parameters i.e. companyName, numberOfUser, activationDate, licenseExpireDate and activationKey.
     * It only activates the license of product if the product is not activated.
     * It also sets the activation status of product to activated after activation.
     */
    public void activateLicense(String clientCompanyName, int numberOfUsers, String activationDate, String licenseExpireDate, String activationKey)
    {
        if (!isActivated) {
            this.clientCompanyName = clientCompanyName;
            this.numberOfUsers = numberOfUsers;
            this.activationDate = activationDate;
            this.licenseExpireDate = licenseExpireDate;
            isActivated = true;
            isExpired = false;
            isTerminated = false;
            super.setActivationKey(activationKey);
            super.setPrice(this.numberOfUsers * this.pricePerUser);
            System.out.println("The product is successfully activated.\n");
        } else {
            System.out.println("This product is already activated for the company named " + this.clientCompanyName + " with " + this.numberOfUsers + "users.\n");
        }
    }

    /**
     * This is a method to terminate the license of product.
     * It terminates the license if the license is not terminated.
     * If the license is already terminated then the suitable message is displayed.
     */
    public void terminateLicense()
    {
        if (isTerminated) {
            System.out.println("The product is already terminated.\n");
        } else {
            clientCompanyName = "";
            activationDate = "";
            licenseExpireDate = "";
            numberOfUsers = 0;
            isActivated = false;
            isExpired = true;
            isTerminated = true;
            System.out.println("The product is terminated successfully.\n");
        }
    }

    /**
     * This method displays the details of the product.
     * It also calls the display method of main class using super keyword.
     * It doesn't display the details if the product is not activated.
     */
    @Override
    public void display()
    {
        super.display();

        if (isActivated) {
            System.out.println("The name of the company who owns this product is " + clientCompanyName + ".");
            System.out.println("The number of users of this product at this company are " + numberOfUsers + ".");
            System.out.println("The price per user of product is " + pricePerUser + ".");
            System.out.println("The date of activation of product is " + activationDate + ".");
            System.out.println("The expiry date of product is " + licenseExpireDate + ".");
            System.out.println("The product is activated.\n");
        } 
        else {
            System.out.println("The product is not activated.\n");
        }
    }

}
