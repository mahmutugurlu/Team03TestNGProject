package allovercommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorPages {



























    // Burhanettin Aydin 31-81


















































    //Ali Iz 82-132


















































    //Mehmet Okay 133-183


















































    //Sevin Acar 184-234















































    //Mahmut Ugurlu 235-285

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement siginButton;
    @FindBy(xpath = " //*[@id='username']")
    public WebElement userName;
    @FindBy(xpath = " //*[@id='password']")
    public WebElement password;
    @FindBy(xpath = " //*[@id='login']")
    public WebElement loginButton;

    @FindBy(xpath = " //*[@id='menu-item-1079']")
    public WebElement myAccountButton;
    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement addressesButton;
    @FindBy(xpath = "//*[text()='Edit Your Shipping Address']")
    public WebElement shippingAddressButton;

    @FindBy(css = "#shipping_first_name")
    public WebElement firstName;
    @FindBy(css = "#shipping_last_name")
    public WebElement lastName;

    @FindBy(css = "#select2-shipping_country-container")
    public WebElement countryAddress;

    @FindBy(xpath = "//*[@id='shipping_address_1']")
    public WebElement streetAddress;

    @FindBy(xpath = "//*[@id='shipping_address_2']")
    public WebElement streetAddress2;

    @FindBy(xpath = "//*[@name='shipping_city']")
    public WebElement townAddress;

    @FindBy(css = "#select2-shipping_state-container")
    public WebElement stateAddress;

    @FindBy(xpath = "//*[@name='shipping_postcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement SaveAddressButton;
    @FindBy(xpath = "//*[text()='Address changed successfully.']")
    public WebElement successfullyMessage;






    //Sule Yüksel 286-336


















































    //Beytullah Cakir 337-387




















































}
