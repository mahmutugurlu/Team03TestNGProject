package allovercommerce.pages;

import allovercommerce.utilities.Driver;
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


















































    //Mahmut Ugurlu 235-285


















































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
    @FindBy(xpath = "//button[normalize-space()='Select']")
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
    @FindBy(id = "wcfm_products_manage_form_shipping_head")
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
    @FindBy(xpath = "((//li[@class='attachment details selected save-ready'])[3]")
    public WebElement galerydenSecilenResimSY;
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
    @FindBy(css = "#wcfm_products_simple_submit_button")
    public WebElement submitButtonSY;
    @FindBy(xpath = "//*[text()='Product Successfully Published.']")
    public WebElement kayitMesajiSY;
    @FindBy(xpath = "//h2[.='Edit Product']")
    public WebElement editProductYazisiSY;
    @FindBy(id = "#weight")    //TC03 locate'leri
    public WebElement weightBoxSY;
    @FindBy(css ="#shipping_class")
    public WebElement shippingClassKutusuDDM_SY;
    @FindBy(css ="#_wcfmmp_processing_time")
    public WebElement processing_timeDDM_SY;
    @FindBy(id ="attributes_is_active_1")   //TC04 locate'leri
    public WebElement attributesColorClickButtonSY;
    @FindBy(id ="attributes_is_active_2")
    public WebElement attributesSizeClickButtonSY;
    @FindBy(id = "#attributes_value_1")
    public WebElement colorDDM_SY;
    @FindBy(xpath = "//input[@id='#attributes_value_1']")
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
    @FindBy(xpath = "(//*[text()='Add New'])[3]")
    public WebElement sizeAddNewButtonSY;
    @FindBy(css = "#attributes_is_visible_2")
    public WebElement sizeVisibleOnProductPageCheckboxSY;
    @FindBy(css = "#__wp-uploader-id-1")
    public WebElement selectFilesButonuSY;

























    //Beytullah Cakir 451-550




















































}
