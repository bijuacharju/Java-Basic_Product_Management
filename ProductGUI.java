/**
 * This is a class MicrosoftProduct.
 * This class manages the GUI for operation of program to the user.
 * The Swing, awt and util packages are imported in this class.
 * This class contains various method for performing tasks like adding product, activating license of product, terminating product and many more.
 * The input values provided in GUI are passed to respective variables of respective class.
 * This class has display method to show the values stored in arraylist as object.
 * The actionPerformed method is overrided with the object of the class ActionEvent as its parameter.
 * @author (Biju Acharju)
 * @ID Number (19033545)
 */

/**
 * These are components imported to make the operation of program possible.
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 * This is a class ProductGUI.
 * This class passes creates GUI and passes values to the object of EnterpriseEdition class.
 * This class implements ActionListener to perform some task when user interacts with GUI.
 */
public class ProductGUI implements ActionListener
{

    /**
     * These are attributes of class ProductGUI which cannot be directly accessed by other classes.
     */
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JPanel menuPanel;
    private JPanel productPanel;
    private JPanel activationPanel;
    private JPanel terminatePanel;
    private JPanel pricePanel;
    private JPanel displayPanel;
    private JLabel labelWelcome;
    private JLabel labelApWelcome;
    private JLabel labelAlWelcome;
    private JLabel labelTlWelcome;
    private JLabel labelPpWelcome;
    private JLabel labelDdWelcome;
    private JLabel labelApProductNumber;
    private JLabel labelApProductName;
    private JLabel labelApPricePerUser;
    private JLabel labelAlProductNumber;
    private JLabel labelAlClientCompanyName;
    private JLabel labelAlNumberOfUsers;
    private JLabel labelAlLicenseActivationDate;
    private JLabel labelAlLicenseExpireDate;
    private JLabel labelAlActivationKey;
    private JLabel labelAlTotalPrice;
    private JLabel labelTlProductNumber;
    private JLabel labelPpProductNumber;
    private JLabel labelPpPricePerUser;
    private JLabel labelDdProductNumber;
    private JTextField fieldApProductNumber;
    private JTextField fieldApProductName;
    private JTextField fieldApPricePerUser;
    private JTextField fieldAlProductNumber;
    private JTextField fieldAlClientCompanyName;
    private JTextField fieldAlNumberOfUsers;
    private JTextField fieldAlLicenseActivationDate;
    private JTextField fieldAlLicenseExpireDate;
    private JTextField fieldAlActivationKey;
    private JTextField fieldAlTotalPrice;
    private JTextField fieldTlProductNumber;
    private JTextField fieldPpProductNumber;
    private JTextField fieldPpPricePerUser;
    private JTextField fieldDdProductNumber;
    private JButton btnAddProduct;
    private JButton btnActivateLicense;
    private JButton btnTerminateLicense;
    private JButton btnPricePerUser;
    private JButton btnDisplay;
    private JButton btnApMenu;
    private JButton btnApClear;
    private JButton addApProductBtn;
    private JButton btnAlMenu;
    private JButton btnAlClear;
    private JButton btnAlActivateLicense;
    private JButton btnTlMenu;
    private JButton btnTlClear;
    private JButton btnTlTerminateLicense;
    private JButton btnPpMenu;
    private JButton btnPpClear;
    private JButton btnPpResetPrice;
    private JButton btnDdMenu;
    private JButton btnDdClear;
    private JButton btnDdDisplayDetails;
    private ArrayList<MicrosoftProduct> product = new ArrayList<MicrosoftProduct>();
    private int additionProductNumber;
    private int additionPricePerUser;
    private int activationProductNumber;
    private int activationNumberOfUsers;
    private int terminateProductNumber;
    private int resetProductNumber;
    private int resetPricePerUser;
    private int displayProductNumber;
    private String additionProductName;
    private String activationClientCompanyName;
    private String activationLicenseActivationDate;
    private String activationLicenseExpireDate;
    private String activationActivationKey;

    /**
     * This is the main method of this class and also the main class of this whole project.
     * This method class calls the constructor to create the required GUI.
     */
    public static void main(String[] args)
    {
        new ProductGUI().frame.setVisible(true);
    }

    /**
     * This is the constructor of same class i.e. ProductGUI.
     * This constructor does not have any parameter.
     * This constructor call a GUI method for creation of GUI.
     */
    public ProductGUI()
    {
        gui();
    }

    /**
     * This is the GUI method which creates the interface for interaction wiht user.
     * This method serves as home screen for graphical interface.
     * This method calls other panels as required when user interacts with interface.
     * This method creates frame, panel, labels and buttons at main panel.
     * The foreground color,background color and font-family and font-size are changed using setForeground, setBackground and setFont methods.
     * The addActionListener method is called by the buttons that are added in this method when clicked.
     * The size, position and resizablity are set in this method.
     */
    public void gui()
    {
        frame = new JFrame("Microsoft");

        mainPanel = new JPanel();
        menuPanel = new JPanel();
        productPanel = new JPanel();
        activationPanel = new JPanel();
        terminatePanel = new JPanel();
        pricePanel = new JPanel();
        displayPanel = new JPanel();

        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
        frame.add(mainPanel);

        menuPanel.setLayout(null);
        menuPanel.setBackground(new Color(77,77,225));

        productPanel.setLayout(null);
        productPanel.setBackground(new Color(77,77,225));

        activationPanel.setLayout(null);
        activationPanel.setBackground(new Color(77,77,225));

        terminatePanel.setLayout(null);
        terminatePanel.setBackground(new Color(77,77,225));

        pricePanel.setLayout(null);
        pricePanel.setBackground(new Color(77,77,225));

        displayPanel.setLayout(null);
        displayPanel.setBackground(new Color(77,77,225));

        labelWelcome = new JLabel("----------------- Welcome to Microsoft ---------------");
        labelWelcome.setBounds(0, 50, 400, 25);
        labelWelcome.setForeground(new Color(255,255,255));
        labelWelcome.setFont(new Font("Arial",Font.BOLD, 18));
        menuPanel.add(labelWelcome);

        btnAddProduct = new JButton("Add Product");
        btnAddProduct.setBounds(100, 100, 200,30);
        btnAddProduct.setBackground(new Color(255,255,255));
        btnAddProduct.setForeground(new Color(77,77,225));
        btnAddProduct.setFont(new Font("Arial",Font.BOLD, 14));
        btnAddProduct.setBorder(null);
        menuPanel.add(btnAddProduct);
        btnAddProduct.addActionListener(this);

        btnActivateLicense = new JButton("Activate License");
        btnActivateLicense.setBounds(100, 150, 200,30);
        btnActivateLicense.setBackground(new Color(255,255,255));
        btnActivateLicense.setForeground(new Color(77,77,225));
        btnActivateLicense.setFont(new Font("Arial",Font.BOLD, 14));
        btnActivateLicense.setBorder(null);
        menuPanel.add(btnActivateLicense);
        btnActivateLicense.addActionListener(this);

        btnTerminateLicense = new JButton("Terminate License");
        btnTerminateLicense.setBounds(100, 200, 200,30);
        btnTerminateLicense.setBackground(new Color(255,255,255));
        btnTerminateLicense.setForeground(new Color(77,77,225));
        btnTerminateLicense.setFont(new Font("Arial",Font.BOLD, 14));
        btnTerminateLicense.setBorder(null);
        menuPanel.add(btnTerminateLicense);
        btnTerminateLicense.addActionListener(this);

        btnPricePerUser = new JButton("Set Price Per User");
        btnPricePerUser.setBounds(100, 250, 200,30);
        btnPricePerUser.setBackground(new Color(255,255,255));
        btnPricePerUser.setForeground(new Color(77,77,225));
        btnPricePerUser.setFont(new Font("Arial",Font.BOLD, 14));
        btnPricePerUser.setBorder(null);
        menuPanel.add(btnPricePerUser);
        btnPricePerUser.addActionListener(this);

        btnDisplay= new JButton("Display Details");
        btnDisplay.setBounds(100, 300, 200,30);
        btnDisplay.setBackground(new Color(255,255,255));
        btnDisplay.setForeground(new Color(77,77,225));
        btnDisplay.setFont(new Font("Arial",Font.BOLD, 14));
        btnDisplay.setBorder(null);
        menuPanel.add(btnDisplay);
        btnDisplay.addActionListener(this);

        mainPanel.add(menuPanel,"Welcome");
        mainPanel.add(productPanel,"Add Product");
        mainPanel.add(activationPanel, "Activate Product");
        mainPanel.add(terminatePanel, "Terminate License");
        mainPanel.add(pricePanel, "Price Per User");
        mainPanel.add(displayPanel, "Display Details");
        cardLayout.show(mainPanel,"First");

        addProductPanel();
        addActivationPanel();
        addTerminateLicensePanel();
        addPricePerUserPanel();
        addDisplayDetailsPanel();

        frame.setBounds(400, 150, 400, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This is addProductPanel method which is shown when user clicks the button for adding the product.
     * This method is used to create labels, text fields and buttons for product panel and are managed using setBounds method.
     * The inputs provided at text fields present in this method are passed to array list creating an object.
     * The foreground color,background color and font-family and font-size are changed using setForeground, setBackground and setFont methods.
     * The addActionListener method is called by the buttons that are added in this method when clicked.
     */
    public void addProductPanel()
    {
        labelApWelcome = new JLabel("-------------------------- Product Addition Section --------------------------");
        labelApWelcome.setBounds(0,10,450,25);
        labelApWelcome.setForeground(new Color(255,255,255));
        labelApWelcome.setFont(new Font("Arial",Font.BOLD, 14));
        productPanel.add(labelApWelcome);

        labelApProductNumber = new JLabel("Product Number");
        labelApProductNumber.setBounds(50, 50, 150, 25);
        labelApProductNumber.setBackground(new Color(77,77,225));
        labelApProductNumber.setForeground(new Color(255,255,255));
        productPanel.add(labelApProductNumber);

        fieldApProductNumber = new JTextField();
        fieldApProductNumber.setBounds(170, 50, 230, 25);
        productPanel.add(fieldApProductNumber);

        labelApProductName = new JLabel("Product Name");
        labelApProductName.setBounds(50, 100, 150, 25);
        labelApProductName.setBackground(new Color(77,77,225));
        labelApProductName.setForeground(new Color(255,255,255));
        productPanel.add(labelApProductName);

        fieldApProductName = new JTextField();
        fieldApProductName.setBounds(170, 100, 230, 25);
        productPanel.add(fieldApProductName);

        labelApPricePerUser = new JLabel("Price Per User");
        labelApPricePerUser.setBounds(50, 150, 150, 25);
        labelApPricePerUser.setBackground(new Color(77,77,225));
        labelApPricePerUser.setForeground(new Color(255,255,255));
        productPanel.add(labelApPricePerUser);

        fieldApPricePerUser = new JTextField();
        fieldApPricePerUser.setBounds(170, 150, 230, 25);
        productPanel.add(fieldApPricePerUser);

        btnApMenu = new JButton("Main Menu");
        btnApMenu.setBounds(50, 200, 100, 25);
        btnApMenu.setForeground(new Color(77,77,225));
        btnApMenu.setBackground(new Color(255,255,255));
        productPanel.add(btnApMenu);
        btnApMenu.addActionListener(this);

        btnApClear = new JButton("Clear");
        btnApClear.setBounds(170, 200, 80, 25);
        btnApClear.setForeground(new Color(77,77,225));
        btnApClear.setBackground(new Color(255,255,255));
        productPanel.add(btnApClear);
        btnApClear.addActionListener(this);

        addApProductBtn = new JButton("Add Product");
        addApProductBtn.setBounds(270, 200, 130, 25);
        addApProductBtn.setForeground(new Color(77,77,225));
        addApProductBtn.setBackground(new Color(255,255,255));
        productPanel.add(addApProductBtn);
        addApProductBtn.addActionListener(this);

    }

    /**
     * This is addActivationPanel method which is shown when user clicks the button for adding the product.
     * This method is used to create labels, text fields and buttons for product panel and are managed using setBounds method.
     * The inputs provided at text fields present in this method are passed to array list creating an object.
     * The foreground color,background color and font-family and font-size are changed using setForeground, setBackground and setFont methods.
     * The addActionListener method is called by the buttons that are added in this method when clicked.
     */
    public void addActivationPanel()
    {
        labelAlWelcome = new JLabel("------------------------------ Product Activation Section ------------------------------");
        labelAlWelcome.setBounds(0,10,500,25);
        labelAlWelcome.setForeground(new Color(255,255,255));
        labelAlWelcome.setFont(new Font("Arial",Font.BOLD, 14));
        activationPanel.add(labelAlWelcome);

        labelAlProductNumber = new JLabel("Product Number");
        labelAlProductNumber.setBounds(50,50,150,25);
        labelAlProductNumber.setForeground(new Color(255,255,255));
        activationPanel.add(labelAlProductNumber);

        fieldAlProductNumber = new JTextField();
        fieldAlProductNumber.setBounds( 200, 50, 250, 25);
        activationPanel.add(fieldAlProductNumber);

        labelAlClientCompanyName = new JLabel("Client Company Name");
        labelAlClientCompanyName.setBounds(50,100,150, 25);
        labelAlClientCompanyName.setForeground(new Color(255,255,255));
        activationPanel.add(labelAlClientCompanyName);

        fieldAlClientCompanyName = new JTextField();
        fieldAlClientCompanyName.setBounds(200,100,250,25);
        activationPanel.add(fieldAlClientCompanyName);

        labelAlNumberOfUsers = new JLabel("Number of Users");
        labelAlNumberOfUsers.setBounds(50, 150, 150, 25);
        labelAlNumberOfUsers.setForeground(new Color(255,255,255));
        activationPanel.add(labelAlNumberOfUsers);

        fieldAlNumberOfUsers = new JTextField();
        fieldAlNumberOfUsers.setBounds(200,150, 250, 25);
        activationPanel.add(fieldAlNumberOfUsers);

        labelAlLicenseActivationDate = new JLabel("License Activation Date");
        labelAlLicenseActivationDate.setBounds(50, 200, 150, 25);
        labelAlLicenseActivationDate.setForeground(new Color(255,255,255));
        activationPanel.add(labelAlLicenseActivationDate);

        fieldAlLicenseActivationDate = new JTextField();
        fieldAlLicenseActivationDate.setBounds(200, 200, 250, 25);
        activationPanel.add(fieldAlLicenseActivationDate);

        labelAlLicenseExpireDate = new JLabel("Licence Expire Date");
        labelAlLicenseExpireDate.setBounds(50, 250, 150, 25);
        labelAlLicenseExpireDate.setForeground(new Color(255,255,255));
        activationPanel.add(labelAlLicenseExpireDate);

        fieldAlLicenseExpireDate = new JTextField();
        fieldAlLicenseExpireDate.setBounds(200,250, 250, 25);
        activationPanel.add(fieldAlLicenseExpireDate);

        labelAlActivationKey = new JLabel("Activation Key");
        labelAlActivationKey.setBounds(50, 300, 150, 25);
        labelAlActivationKey.setForeground(new Color(255,255,255));
        activationPanel.add(labelAlActivationKey);

        fieldAlActivationKey = new JTextField();
        fieldAlActivationKey.setBounds(200,300, 250, 25);
        activationPanel.add(fieldAlActivationKey);

        labelAlTotalPrice = new JLabel("Total Price");
        labelAlTotalPrice.setBounds(50, 350, 150, 25);
        labelAlTotalPrice.setForeground(new Color(255,255,255));
        activationPanel.add(labelAlTotalPrice);

        fieldAlTotalPrice = new JTextField();
        fieldAlTotalPrice.setEditable(false);
        fieldAlTotalPrice.setText("");
        fieldAlTotalPrice.setBounds(200,350, 250, 25);
        activationPanel.add(fieldAlTotalPrice);

        btnAlMenu = new JButton("Main Menu");
        btnAlMenu.setBounds(50, 400, 130, 25);
        btnAlMenu.setBackground(new Color(255,255,255));
        btnAlMenu.setForeground(new Color(77,77,225));
        activationPanel.add(btnAlMenu);
        btnAlMenu.addActionListener(this);

        btnAlClear = new JButton("Clear");
        btnAlClear.setBounds(200, 400, 80, 25);
        btnAlClear.setBackground(new Color(255,255,255));
        btnAlClear.setForeground(new Color(77,77,225));
        activationPanel.add(btnAlClear);
        btnAlClear.addActionListener(this);

        btnAlActivateLicense = new JButton("Activate Licence");
        btnAlActivateLicense.setBounds(300, 400, 150, 25);
        btnAlActivateLicense.setBackground(new Color(255,255,255));
        btnAlActivateLicense.setForeground(new Color(77,77,225));
        activationPanel.add(btnAlActivateLicense);
        btnAlActivateLicense.addActionListener(this);

    }

    /**
     * This is addTerminateLicensePanel method which is shown when user clicks the button for adding the product.
     * This method is used to create labels, text fields and buttons for product panel and are managed using setBounds method.
     * The inputs provided at text fields present in this method are passed to array list creating an object.
     * The foreground color,background color and font-family and font-size are changed using setForeground, setBackground and setFont methods.
     * The addActionListener method is called by the buttons that are added in this method when clicked.
     */
    public void addTerminateLicensePanel()
    {
        labelTlWelcome = new JLabel("------------------------ License Termination Section -----------------------");
        labelTlWelcome.setBounds(0,10,450,25);
        labelTlWelcome.setForeground(new Color(255,255,255));
        labelTlWelcome.setFont(new Font("Arial",Font.BOLD, 14));
        terminatePanel.add(labelTlWelcome);

        labelTlProductNumber = new JLabel("Product Number");
        labelTlProductNumber.setBounds(50,50,150,25);
        labelTlProductNumber.setForeground(new Color(255,255,255));
        terminatePanel.add(labelTlProductNumber);

        fieldTlProductNumber = new JTextField();
        fieldTlProductNumber.setBounds(170,50, 230, 25);
        terminatePanel.add(fieldTlProductNumber);

        btnTlMenu = new JButton("Main Menu");
        btnTlMenu.setBounds(50, 100, 100, 25);
        btnTlMenu.setBackground(new Color(255,255,255));
        btnTlMenu.setForeground(new Color(77,77,225));
        terminatePanel.add(btnTlMenu);
        btnTlMenu.addActionListener(this);

        btnTlClear = new JButton("Clear");
        btnTlClear.setBounds(170, 100, 70, 25);
        btnTlClear.setBackground(new Color(255,255,255));
        btnTlClear.setForeground(new Color(77,77,225));
        terminatePanel.add(btnTlClear);
        btnTlClear.addActionListener(this);

        btnTlTerminateLicense = new JButton("Terminate License");
        btnTlTerminateLicense.setBounds(260, 100, 140, 25);
        btnTlTerminateLicense.setBackground(new Color(255,255,255));
        btnTlTerminateLicense.setForeground(new Color(77,77,225));
        terminatePanel.add(btnTlTerminateLicense);
        btnTlTerminateLicense.addActionListener(this);

    }

    /**
     * This is addPricePerUserPanel method which is shown when user clicks the button for adding the product.
     * This method is used to create labels, text fields and buttons for product panel and are managed using setBounds method.
     * The inputs provided at text fields present in this method are passed to array list creating an object.
     * The foreground color,background color and font-family and font-size are changed using setForeground, setBackground and setFont methods.
     * The addActionListener method is called by the buttons that are added in this method when clicked.
     */
    public void addPricePerUserPanel()
    {
        labelPpWelcome = new JLabel("------------------------------ Price Reset Section -----------------------------");
        labelPpWelcome.setBounds(0,10,450,25);
        labelPpWelcome.setForeground(new Color(255,255,255));
        labelPpWelcome.setFont(new Font("Arial",Font.BOLD, 14));
        pricePanel.add(labelPpWelcome);

        labelPpProductNumber = new JLabel("Product Number");
        labelPpProductNumber.setBounds(50,50,150,25);
        labelPpProductNumber.setForeground(new Color(255,255,255));
        pricePanel.add(labelPpProductNumber);

        fieldPpProductNumber = new JTextField();
        fieldPpProductNumber.setBounds(170, 50, 230, 25);
        pricePanel.add(fieldPpProductNumber);

        labelPpPricePerUser = new JLabel("Price Per User");
        labelPpPricePerUser.setBounds(50,100,150, 25);
        labelPpPricePerUser.setForeground(new Color(255,255,255));
        pricePanel.add(labelPpPricePerUser);

        fieldPpPricePerUser = new JTextField();
        fieldPpPricePerUser.setBounds(170,100,230,25);
        pricePanel.add(fieldPpPricePerUser);

        btnPpMenu = new JButton("Main Menu");
        btnPpMenu.setBounds(50, 150, 100, 25);
        btnPpMenu.setBackground(new Color(255,255,255));
        btnPpMenu.setForeground(new Color(77,77,225));
        pricePanel.add(btnPpMenu);
        btnPpMenu.addActionListener(this);

        btnPpClear = new JButton("Clear");
        btnPpClear.setBounds(170, 150, 80, 25);
        btnPpClear.setBackground(new Color(255,255,255));
        btnPpClear.setForeground(new Color(77,77,225));
        pricePanel.add(btnPpClear);
        btnPpClear.addActionListener(this);

        btnPpResetPrice = new JButton("Reset Price");
        btnPpResetPrice.setBounds(270, 150, 130, 25);
        btnPpResetPrice.setBackground(new Color(255,255,255));
        btnPpResetPrice.setForeground(new Color(77,77,225));
        pricePanel.add(btnPpResetPrice);
        btnPpResetPrice.addActionListener(this);

    }
    
    /**
     * This is addDisplayDetailsPanel method which is shown when user clicks the button for adding the product.
     * This method is used to create labels, text fields and buttons for product panel and are managed using setBounds method.
     * The inputs provided at text fields present in this method are passed to array list creating an object.
     * The foreground color,background color and font-family and font-size are changed using setForeground, setBackground and setFont methods.
     * The addActionListener method is called by the buttons that are added in this method when clicked.
     */
    public void addDisplayDetailsPanel()
    {
        labelDdWelcome = new JLabel("--------------------- Product's Details Display Section --------------------");
        labelDdWelcome.setBounds(0,10,450,25);
        labelDdWelcome.setForeground(new Color(255,255,255));
        labelDdWelcome.setFont(new Font("Arial",Font.BOLD, 14));
        displayPanel.add(labelDdWelcome);

        labelDdProductNumber = new JLabel("Product Number");
        labelDdProductNumber.setBounds(50,50,150,25);
        labelDdProductNumber.setForeground(new Color(255,255,255));
        displayPanel.add(labelDdProductNumber);

        fieldDdProductNumber = new JTextField();
        fieldDdProductNumber.setBounds(170,50, 230, 25);
        displayPanel.add(fieldDdProductNumber);

        btnDdMenu = new JButton("Main Menu");
        btnDdMenu.setBounds(50, 100, 100, 25);
        btnDdMenu.setBackground(new Color(255,255,255));
        btnDdMenu.setForeground(new Color(77,77,225));
        displayPanel.add(btnDdMenu);
        btnDdMenu.addActionListener(this);

        btnDdClear = new JButton("Clear");
        btnDdClear.setBounds(170, 100, 70, 25);
        btnDdClear.setBackground(new Color(255,255,255));
        btnDdClear.setForeground(new Color(77,77,225));
        displayPanel.add(btnDdClear);
        btnDdClear.addActionListener(this);

        btnDdDisplayDetails = new JButton("Display Details");
        btnDdDisplayDetails.setBounds(260, 100, 140, 25);
        btnDdDisplayDetails.setBackground(new Color(255,255,255));
        btnDdDisplayDetails.setForeground(new Color(77,77,225));
        displayPanel.add(btnDdDisplayDetails);
        btnDdDisplayDetails.addActionListener(this);

    }

    /**
     * This is a actionPerformed method which overrided the method of ActionListener class.
     * This method accepts the ActionEvent class as its parameter.
     * A new object source is created by calling and initializing the getSource method.
     * When the source is same as any of the button object, then respective method is called and required task is peformed.
     */
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Object source = ae.getSource();
        if (source == btnAddProduct){
            cardLayout.show(mainPanel,"Add Product");
            frame.setSize(450,300);
        }

        if (source == btnApMenu){
            cardLayout.show(mainPanel, "Welcome");
            frame.setSize(400, 400);
        }

        if (source == btnApClear){
            clearProductPanel();
        }

        if (source == addApProductBtn){
            addProduct();
        }

        if (source == btnActivateLicense){
            cardLayout.show(mainPanel, "Activate Product");
            frame.setSize(500, 500);
        }

        if (source == btnAlMenu) {
            cardLayout.show(mainPanel, "Welcome");
            frame.setSize(400, 400);
        }

        if (source == btnAlClear) {
            clearActivationPanel();
        }

        if (source == btnAlActivateLicense){
            activateLicense();
        }

        if (source == btnTerminateLicense){
            cardLayout.show(mainPanel, "Terminate License");
            frame.setSize(450, 200);
        }

        if (source == btnTlMenu){
            cardLayout.show(mainPanel, "Welcome");
            frame.setSize(400,400);
        }

        if (source == btnTlTerminateLicense) {
            terminateLicense();
        }

        if (source == btnTlClear){
            clearTerminateLicensePanel();
        }

        if (source == btnPricePerUser){
            cardLayout.show(mainPanel, "Price Per User");
            frame.setSize(450,250);
        }

        if (source == btnPpMenu){
            cardLayout.show(mainPanel, "Welcome");
            frame.setSize(400,400);
        }

        if (source == btnPpClear){
            clearPricePerUserPanel();
        }

        if (source == btnPpResetPrice){
            resetPricePerUser();
        }

        if (source == btnDisplay){
            cardLayout.show(mainPanel, "Display Details");
            frame.setSize(450, 200);
        }

        if (source == btnDdMenu){
            cardLayout.show(mainPanel, "Welcome");
            frame.setSize(400,400);
        }

        if (source == btnDdClear){
            clearDisplayDetailsPanel();
        }

        if (source == btnDdDisplayDetails) {
            displayDetails();
        }
    }

    /**
     * This is clearProductPanel.
     * When this method is called all the the text fields present in respective are set to empty.
     */
    public void clearProductPanel()
    {
        fieldApProductNumber.setText("");
        fieldApProductName.setText("");
        fieldApPricePerUser.setText("");
    }

    /**
     * This is clearActivationPanel.
     * When this method is called all the the text fields present in respective are set to empty.
     */
    public void clearActivationPanel()
    {
        fieldAlProductNumber.setText("");
        fieldAlClientCompanyName.setText("");
        fieldAlNumberOfUsers.setText("");
        fieldAlLicenseActivationDate.setText("");
        fieldAlLicenseExpireDate.setText("");
        fieldAlActivationKey.setText("");
        fieldAlTotalPrice.setText("");
    }

    /**
     * This is clearTerminateLicensePanel.
     * When this method is called the the text field present in respective is set to empty.
     */
    public void clearTerminateLicensePanel()
    {
        fieldTlProductNumber.setText("");
    }

    /**
     * This is clearPricePerUserPanel.
     * When this method is called all the the text fields present in respective are set to empty.
     */
    public void clearPricePerUserPanel()
    {
        fieldPpProductNumber.setText("");
        fieldPpPricePerUser.setText("");
    }
    
    /**
     * This is clearDisplayDetailsPanel.
     * When this method is called the the text field present in respective is set to empty.
     */
    public void clearDisplayDetailsPanel()
    {
        fieldDdProductNumber.setText("");
    }
    
    /**
     * This is addProduct method.
     * This method takes input from textfield from addProductPanel.
     * This panel has try catch block to handle Number Format Exception.
     * Object of EnterpriseEdition class is created and is added to arraylist.
     * This method also validates the data taken as input from text fields.
     */
    public void addProduct()
    {
        additionProductName = fieldApProductName.getText().trim();
        
        try{
            additionProductNumber = Integer.parseInt(fieldApProductNumber.getText());
            additionPricePerUser = Integer.parseInt(fieldApPricePerUser.getText());
            if (additionProductName.equals("") || additionProductNumber <= 0 || additionPricePerUser <= 0){
                JOptionPane.showMessageDialog(frame,"Please fill values in all the text fields. And 0 or negative integer are not valid value for Product Number and Price.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if (product.size() == 0) {
                    product.add(new EnterpriseEdition(additionProductNumber, additionProductName, additionPricePerUser));
                    JOptionPane.showMessageDialog(frame, "Product is added successfully.");
                }
                else{
                    boolean nonDuplicate = true;
                    for (MicrosoftProduct microsoftProduct : product) {
                        EnterpriseEdition ee = (EnterpriseEdition) microsoftProduct;
                        if (ee.getProductNumber() == additionProductNumber) {
                            nonDuplicate = false;
                            break;
                        }
                    }

                    if (nonDuplicate){
                        product.add(new EnterpriseEdition(additionProductNumber, additionProductName, additionPricePerUser));
                        JOptionPane.showMessageDialog(frame, "Product is added successfully.");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Product already exists.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Please enter integer value at Product Number and Price Per User.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This is activateLicense method.
     * This method takes input from textfield from addActivationPanel.
     * This panel has try catch block to handle Number Format Exception.
     * This method activates the license of the requested product.
     * This method also validates the data taken as input from text fields.
     */
    public void activateLicense()
    {
        activationClientCompanyName = fieldAlClientCompanyName.getText().trim();
        activationLicenseActivationDate = fieldAlLicenseActivationDate.getText().trim();
        activationLicenseExpireDate = fieldAlLicenseExpireDate.getText().trim();
        activationActivationKey = fieldAlActivationKey.getText().trim();

        try{
            activationProductNumber = Integer.parseInt(fieldAlProductNumber.getText());
            activationNumberOfUsers = Integer.parseInt(fieldAlNumberOfUsers.getText());
            if (activationClientCompanyName.equals("") || activationLicenseActivationDate.equals("") || activationLicenseExpireDate.equals("") || activationActivationKey.equals("") || activationProductNumber <= 0  || activationNumberOfUsers <= 0 ){
                JOptionPane.showMessageDialog(frame,"Please fill values in all the text fields. And 0 or negative integer are not a valid value for Product Number and Number Of Users.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if (product.size() == 0){
                    JOptionPane.showMessageDialog(frame, "There is no available product.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    boolean state = false;
                    for (MicrosoftProduct microsoftProduct : product) {
                        EnterpriseEdition ee = (EnterpriseEdition) microsoftProduct;

                        if (ee.getProductNumber() == activationProductNumber) {
                            if (!ee.isActivated()) {
                                ee.activateLicense(activationClientCompanyName, activationNumberOfUsers, activationLicenseActivationDate, activationLicenseExpireDate, activationActivationKey);
                                JOptionPane.showMessageDialog(frame, "Product is activated successfully.");
                                fieldAlTotalPrice.setText(Integer.toString(ee.getPrice()));
                            }
                            else {
                                JOptionPane.showMessageDialog(frame, "Product is already activated", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                            state = true;
                            break;
                        }
                    }
                    
                    if (!state) {
                        JOptionPane.showMessageDialog(frame,"Requested product for activation is not available.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Please enter integer value at Product Number and Number of Users.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * This is terminateLicense method.
     * This method takes input from textfield from addTerminateLicensePanel.
     * This panel has try catch block to handle Number Format Exception.
     * This method terminates license of the reqested product.
     * This method also validates the data taken as input from text fields.
     */
    public void terminateLicense()
    {
        try{
            terminateProductNumber = Integer.parseInt(fieldTlProductNumber.getText().trim());
            if (terminateProductNumber <= 0){
                JOptionPane.showMessageDialog(frame,"0 or negative integer are a not valid value for Product Number.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else {
                if (product.size() == 0) {
                    JOptionPane.showMessageDialog(frame, "There is no available product.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    boolean state = false;
                    for (MicrosoftProduct microsoftProduct : product) {
                        EnterpriseEdition ee = (EnterpriseEdition) microsoftProduct;

                        if (ee.getProductNumber() == terminateProductNumber) {
                            if (ee.isActivated()) {
                                ee.terminateLicense();
                                JOptionPane.showMessageDialog(frame, "Product is terminated successfully.");
                            }
                            else {
                                JOptionPane.showMessageDialog(frame, "Product is already terminated.", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                            state = true;
                            break;
                        }
                    }
                    
                    if (!state){
                        JOptionPane.showMessageDialog(frame, "Requested product for termination is not available.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Please enter integer value at Product Number.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This is resetPricePerUser method.
     * This method takes input from textfield from addPricePerUserPanel.
     * This panel has try catch block to handle Number Format Exception.
     * This method changes the price per user rate of requested product.
     * This method also validates the data taken as input from text fields.
     */
    public void resetPricePerUser()
    {
        try{
            resetProductNumber = Integer.parseInt(fieldPpProductNumber.getText().trim());
            resetPricePerUser = Integer.parseInt(fieldPpPricePerUser.getText().trim());
            if (resetProductNumber <= 0 || resetPricePerUser <= 0) {
                JOptionPane.showMessageDialog(frame,"0 or negative integer are not a valid values of Product Number and Price Per User.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                boolean state = false;
                for (MicrosoftProduct microsoftProduct: product){
                    EnterpriseEdition ee = (EnterpriseEdition) microsoftProduct;

                    if (ee.getProductNumber() == resetProductNumber){
                        if (!ee.isActivated()) {
                            ee.pricePerUser(resetPricePerUser);
                            JOptionPane.showMessageDialog(frame, "Price has been changed successfully.");
                        } else {
                            JOptionPane.showMessageDialog(frame, "The license of product has already been granted so; price cannot be changed.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        state = true;
                        break;
                    }
                }
                
                if (!state){
                    JOptionPane.showMessageDialog(frame, "The requested product for changing the rate price per user is not available.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Please enter integer value at Product Number and Price Per User.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This is displayDetails method.
     * This method takes input from textfield from addDisplayDetailsPanel.
     * This panel has try catch block to handle Number Format Exception.
     * This method display the details of requested product.
     * This method also validates the data taken as input from text fields.
     */
    public void displayDetails()
    {
        try{
            displayProductNumber = Integer.parseInt(fieldDdProductNumber.getText().trim());
            if (displayProductNumber <= 0) {
                JOptionPane.showMessageDialog(frame,"0 or negative integer are not a valid value for Product Number.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if (product.size() == 0){
                    JOptionPane.showMessageDialog(frame, "You must have at least one product.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    boolean inputState = true;
                    for (MicrosoftProduct microsoftProduct : product) {
                        EnterpriseEdition ee = (EnterpriseEdition) microsoftProduct;
                        
                        if (ee.getProductNumber() == displayProductNumber) {
                            ee.display();
                            JOptionPane.showMessageDialog(frame, "The details has been displayed at terminal.");
                            inputState = true;
                            break;
                        } 
                        else {
                            inputState = false;
                        }

                    }
                    if (!inputState){
                        JOptionPane.showMessageDialog(frame,"Please enter valid product Number.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (IndexOutOfBoundsException ee){
                    JOptionPane.showMessageDialog(frame, "Please enter valid Product Number.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (NumberFormatException ae){
            JOptionPane.showMessageDialog(frame,"Please enter integer value at Product Number.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}