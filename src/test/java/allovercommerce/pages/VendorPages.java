package allovercommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorPages {



























    // Burhanettin Aydin 31-81


















































    //Ali Iz 82-132


















































    //Mehmet Okay 133-183















































    //Sevin Acar 184-234

    @FindBy(id = "menu-item-1079")
    public WebElement myAccountButonuSA;
    @FindBy(xpath = "(//li//a)[7]")
    public WebElement adressesButonuSA;
    @FindBy(xpath = "//*[@href='https://allovercommerce.com/my-account-2/edit-address/billing/']")
    public WebElement billingAddressAddButonuSA;
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement billingAddressFirstNameSA;
    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement billingAddressLastNameSA;
    @FindBy(xpath = "//*[@id='billing_company']")
    public WebElement billingAddressCompanyNameSA;
    @FindBy(xpath = "//*[@id='billing_country']")
    public WebElement billingAddressCountryRegionDdmSA;
    @FindBy(xpath = "//*[@value='mathew.adit@farmoaks.com']")
    public WebElement billingAddressEmailSA;
    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement billingAddressStreetAddressKutusuSA;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement billingAddressTownCitySA;
    @FindBy(xpath = "//*[@id='billing_state']")
    public WebElement billingAddressStateSA;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement billingAddressZipCodeSA;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement billingAddressPhoneSA;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement billingSaveAddressSA;
    @FindBy(xpath = "//*[text()='Address changed successfully.']")
    public WebElement billingAddressChangedSuccessfullyMesajiSA;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement billingEditYourBillingAddressButonuSA;
    @FindBy(xpath = "//*[@data-id='billing_first_name']")
    public WebElement billingFirstNameNegatifMesajiSA;
    @FindBy(xpath = "//*[@data-id='billing_last_name']")
    public WebElement billingLastnameNegatifMesajiSA;
    @FindBy(xpath = "//*[@data-id='billing_country']")
    public WebElement billingCountryNegatifMesajiSA;
    @FindBy(xpath = "//*[@data-id='billing_address_1']")
    public WebElement billingStreetAddressNegatifMesajiSA;
    @FindBy(xpath = "//*[@data-id='billing_city']")
    public WebElement billingAddressTownCityRequiredFieldSA;
    @FindBy(xpath = "//*[@data-id='billing_postcode']")
    public WebElement billingAddressZipCodeRequiredFieldSA;
    @FindBy(xpath = "//*[@data-id='billing_phone']")
    public WebElement billingAddressPhoneRequiredFieldSA;
    @FindBy(xpath = "(//*[.='Register'])[2]")
    public WebElement registerLinkiSA;
    @FindBy(xpath = "(//*[.='Become a Vendor'])[2]")
    public WebElement becomeAVendorLinkiSA;
    @FindBy(xpath = "//*[@id=\"user_email\"]")
    public WebElement registrationEmailSA;






    //Mahmut Ugurlu 235-285


















































    //Sule Yüksel 286-336


















































    //Beytullah Cakir 337-387




















































}
