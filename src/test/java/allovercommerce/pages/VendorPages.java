package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPages {
    public VendorPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



















    // Burhanettin Aydin 31-81


















































    //Ali Iz 82-132


















































    //Mehmet Okay 133-183















































    //Sevin Acar 184-234

    @FindBy(xpath = "//*[@id='user_email']")
    public WebElement emailBoxVendor;
    @FindBy(id = "menu-item-1079")
    public WebElement myAccountButonuSA;
    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement Myaccountyazisi;
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOutButonu;
    @FindBy(xpath = "(//*[@id='username'])[1]")
    public WebElement userNameOrEmail;
    @FindBy(xpath = "//a[@href='https://allovercommerce.com/my-account-2/edit-address/billing/']")//Is
    public WebElement Addbutonu;
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
    @FindBy(xpath = "//span[@id='select2-billing_country-container']")
    public WebElement billingAddressCountryRegionDdmSA;
    @FindBy(xpath = "//*[@id=\"billing_email\"]")
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
    @FindBy(xpath = "(//li)[6]")
    public WebElement storManager;
    @FindBy(xpath = "(//li)[7]")
    public WebElement orders;
    @FindBy(xpath = "(//li)[8]")
    public WebElement downloads;
    @FindBy(xpath = "(//li)[9]")
    public WebElement address;
    @FindBy(xpath = "(//li)[10]")
    public WebElement accountDetails;
    @FindBy(xpath = "(//li)[11]")
    public WebElement wishList;
    @FindBy(xpath = "(//li)[12]")
    public WebElement support;
    @FindBy(xpath = "(//li)[13]")
    public WebElement followings;
    @FindBy(xpath = "(//li)[14]")
    public WebElement logOut;
    @FindBy(xpath = "(//a)[15]")
    public WebElement Dashboard;


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

    @FindBy(css = "#shipping_company")
    public WebElement companyName;

    @FindBy(css = "#select2-shipping_country-container")
    public WebElement countryAddress;

    @FindBy(css = "#shipping_company")
    public WebElement countryName;

    @FindBy(xpath = "//*[@id='shipping_address_1']")
    public WebElement streetAddress;

    @FindBy(xpath = "//*[@id='shipping_address_2']")
    public WebElement streetAddress2;

    @FindBy(xpath = "//*[@name='shipping_city']")
    public WebElement townAddress;

    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
    WebElement stateAddress = (WebElement) jse.executeScript("document.querySelector(\"#shipping_state\")");

    @FindBy(xpath = "//*[@name='shipping_postcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement saveAddressButton;

    @FindBy(xpath = "//*[text()='Address changed successfully.']")
    public WebElement successfullyMessage;

    @FindBy(xpath = "//*[@value='13206']")
    public WebElement mensClothing;

    @FindBy(xpath = "//*[@class='cart-name']")
    public WebElement wiewCart;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement wiewCartSubmit;

    @FindBy(xpath = "//*[@name='coupon_code']")
    public WebElement kuponText;

    @FindBy(xpath = "//*[@class='btn btn-rounded btn-border-thin btn-outline btn-dark button']")
    public WebElement kuponApply;

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchBox;

    @FindBy(xpath = " //*[@srcset='https://allovercommerce.com/wp-content/uploads/2024/03/kus-123-300x300.jpg 300w, https://allovercommerce.com/wp-content/uploads/2024/03/kus-123-150x150.jpg 150w, https://allovercommerce.com/wp-content/uploads/2024/03/kus-123-86x86.jpg 86w']")
    public WebElement tablo;

    @FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[text()='Coupon code already applied!']")
    public WebElement couponKullanimMesaji;






    //Sule Yüksel 286-336
    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signinButtonSY;
    @FindBy(css = "#username")
    public WebElement emailSY;
    @FindBy(css = "#password")
    public WebElement passwordSY;
    @FindBy(xpath = "//button[@value='Sign In']")
    public WebElement enterButtonSY;
    @FindBy(css = "#menu-item-1079")
    public WebElement myAccountButtonSY;
    @FindBy(xpath = "//*[.='Store Manager']")
    public WebElement storeManagerButtonSY;
    @FindBy(xpath = "//a[@href='https://allovercommerce.com/store-manager/products/']")
    public WebElement productsButtonSY;
    @FindBy(id = "add_new_product_dashboard")
    public WebElement addNewButtonSY;
    @FindBy(css = "#product_type")
    public WebElement productTypeDDMSY;
    @FindBy(id = "featured_img_display")
    public WebElement imageButtonSY;
    @FindBy(id = "__wp-uploader-id-1")
    public WebElement selectFilesButtonSY;
    @FindBy(xpath = "(//button[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement selectButtonSY;
    @FindBy(xpath = "//input[@id='variations_image_0_remove_button']")
    public WebElement xButtonSY;
    @FindBy(id = "pro_title") //TC03 locate'leri#username
    public WebElement productTitleMetinAlaniSY;
    @FindBy(xpath = "//*[@data-id='excerpt']")
    public WebElement shortDescriptionMetinAlaniSY;
    @FindBy(xpath = "//*[@data-id='description']")
    public WebElement descriptionMetinAlaniSY;
    @FindBy(xpath = "(//p[@class='wcfm_title wcfm_full_ele'])[1]") //TC04 locate'leri
    public WebElement categoriesButtonSY;
    @FindBy(xpath = "//input[@name='product_cats[]']")
    public WebElement  catagoriesToplamClikButtonSY;
    @FindBy(xpath = "//p[.='+Add new category']") //TC05 locate'leri
    public WebElement addNewCategoryButtonSY;
    @FindBy(id = "wcfm_new_cat")
    public WebElement categoryNameBoxSY;
    @FindBy(id = "wcfm_new_parent_cat")
    public WebElement parentCategoryDDMSY;
    @FindBy(xpath = "//button[@data-taxonomy='product_cat']")
    public WebElement ADDButtonSY;
    @FindBy(xpath = "//input[@name='product_cats[]']")
    public WebElement yeniEklenenSY;
    @FindBy(xpath = "//input[@class='wcfm-checkbox checklist_type_product_brand ']") //TC06 locate'leri
    public WebElement productBrandsClickButtonSY;
    @FindBy(xpath = "//input[@name='product_custom_taxonomies[product_brand][]']")
    public WebElement productBrandsListSY;
    @FindBy(xpath = "//p[.='+Add new Product brands']") //TC07 locate'leri
    public WebElement addNewProductBrandsButtonSY;
    @FindBy(id = "wcfm_new_product_brand")
    public WebElement productBrandsNameBoxSY;
    @FindBy(id = "wcfm_new_parent_product_brand")
    public WebElement parentTaxonomyDDMSY;
    @FindBy(xpath = "(//input[@name='product_custom_taxonomies[product_brand][]'])[1]")
    public WebElement productBrandsEklenenUrunSY;
    @FindBy(xpath = "//button[@data-taxonomy='product_brand']")
    public WebElement productBrandAddButtonSY;
    //US_15 LOCATELERI
    @FindBy(css = "#wcfm_products_manage_form_inventory_head" ) //TC01 locate'leri
    public WebElement inventoryButtonSY;
    @FindBy(xpath = "//div[contains(text(),'Shipping')]")
    public WebElement shippingButtonSY;
    @FindBy(id = "wcfm_products_manage_form_attribute_head")
    public WebElement attributesButtonSY;
    @FindBy(id = "wcfm_products_manage_form_linked_head")
    public WebElement linkedButtonSY;
    @FindBy(id = "wcfm_products_manage_form_yoast_head")
    public WebElement seoButtonSY;
    @FindBy(id = "wcfm_products_manage_form_advanced_head")
    public WebElement advancedButtonSY;
    @FindBy(css = "#gallery_img_gimage_0_display") //TC02 locate'leri #
    public WebElement kucukFotoSY;
    @FindBy(css = "#menu-item-browse")
    public WebElement mediaLibrarySY;
    @FindBy(xpath = "(//button[@id='menu-item-upload'])[2]")
    public WebElement uploadFilesButtonSY;
    @FindBy(css = "#__wp-uploader-id-4") //(//li[@class='attachment details selected save-ready'])[3]  (//li[@role='checkbox'])[3]
    public WebElement selectFilesButton2SY;
    @FindBy(xpath = "(//div[@class='media-toolbar-primary search-form'])[2]")
    public WebElement addToGalleryButtonSY;
    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement catagoriesClikButonuSY;
    @FindBy(css = "#sku")
    public WebElement skuBoxSY;
    @FindBy(css = "#manage_stock")
    public WebElement manageStockClickButtonSY;
    @FindBy(css = "#stock_qty")
    public WebElement stockqtyBoxSY;
    @FindBy(css = "#stock_status")
    public WebElement stokStatussDDMSY;
    @FindBy(css = "#backorders")
    public WebElement allowBackordersDDM_SY;
    @FindBy(css = "#sold_individually")
    public WebElement soldIndividuallyClickButtonSY;
    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submitButtonSY;
    @FindBy(xpath = "//*[text()='Product Successfully Published.']")
    public WebElement kayitMesajiSY;
    @FindBy(xpath = "//h2[.='Edit Product']")
    public WebElement editProductYazisiSY;
    @FindBy(xpath = "//input[@id='weight']")    //TC03 locate'leri
    public WebElement weightBoxSY;
    @FindBy(css ="#shipping_class")
    public WebElement shippingClassKutusuDDM_SY;
    @FindBy(css ="#_wcfmmp_processing_time")
    public WebElement processing_timeDDM_SY;
    @FindBy(id ="attributes_is_active_1")   //TC04 locate'leri
    public WebElement attributesColorClickButtonSY;
    @FindBy(id ="attributes_is_active_2")
    public WebElement attributesSizeClickButtonSY;
    @FindBy(xpath = "(//ul[@aria-relevant='additions removals'])[2]")
    public WebElement colorDDM_SY;
    @FindBy(css = "#attributes_is_visible_1")
    public WebElement colorYeni;
    @FindBy(xpath = "//input[@id='attributes_is_visible_1']")
    public WebElement visibleOnProductPageCheckboxSY;
    @FindBy(xpath = "(//*[text()='Select all'])[1]")
    public WebElement colorSelectAllButtonSY;
    @FindBy(xpath = "(//*[text()='Select none'])[1]")
    public WebElement colorSelectNoneButtonSY;
    @FindBy(xpath = "(//*[text()='Add New'])[2]")
    public WebElement colorAddNewButtonSY;
    @FindBy(css ="#attributes_is_active_2")
    public WebElement sizeButtonSY;
    @FindBy(css ="#attributes_value_2")
    public WebElement sizeButtonDDM_SY;
    @FindBy(xpath = "(//*[text()='Select all'])[2]")
    public WebElement sizeSelectAllButtonSY;
    @FindBy(xpath = "(//*[text()='Select none'])[2]")
    public WebElement sizeSelectNoneButtonSY;
    @FindBy(xpath = "//button[@class='button wcfm_add_attribute']")
    public WebElement sizeAddNewButtonSY;
    @FindBy(xpath = "//button[@class='button wcfm_add_attribute']")
    public WebElement sizeNameButtonSY;
    @FindBy(css = "#attributes_is_visible_2")   //input[@id='attributes_name_5']
    public WebElement sizeVisibleOnProductPageCheckboxSY;
    @FindBy(css = "#__wp-uploader-id-1")
    public WebElement selectFilesButonuSY;




    //Beytullah Cakir 451-550




















































}
