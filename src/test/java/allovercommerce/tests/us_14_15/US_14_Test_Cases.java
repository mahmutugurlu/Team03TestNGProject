package allovercommerce.tests.us_14_15;

import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class US_14_Test_Cases {

    VendorPages vendorPages=new VendorPages();
    Faker faker=new Faker();


    @Test
    public void tc01() {

//    Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlSy"));

//    Sign in butonuna tiklanir

        vendorPages.signinButtonSY.click();
//    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        vendorPages.emailSY.sendKeys(ConfigReader.getProperty("allovercommerceEmailSy"), Keys.TAB);
        vendorPages.passwordSY.sendKeys(ConfigReader.getProperty("allovercommercePasswordSy"),Keys.ENTER);
        vendorPages.enterButtonSY.click();

//    My Account yazisina tiklanir
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorPages.myAccountButtonSY.click();

//    Acilan sayfada Store Manager butonuna tiklanir
        ReusableMethods.bekle(4);

        vendorPages.storeManagerButtonSY.click();
//    Acilan sayfada products button tiklanir
        ReusableMethods.bekle(4);
        vendorPages.productsButtonSY.click();

//    Acilan sayfada Add New butonuna tiklanir
        ReusableMethods.bekle(4);
        vendorPages.addNewButtonSY.click();

//    Acilan sayfada Simple Product yazan kutucuga tiklanir
        ReusableMethods.bekle(4);
        vendorPages.productTypeDDMSY.click();

//    Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçeneklerinin oldugu dogrulanir
        WebElement secenek= vendorPages.productTypeDDMSY;
        Select select=new Select(secenek);
        vendorPages.productTypeDDMSY.click();
        List<WebElement> list=select.getOptions();
        list.forEach(t-> System.out.println(t.getText()));
        Driver.closeDriver();


    }

    @Test
    public void tc02() {


        //    Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlSy"));

//    Sign in butonuna tiklanir

        vendorPages.signinButtonSY.click();
//    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        vendorPages.emailSY.sendKeys(ConfigReader.getProperty("allovercommerceEmailSy"),Keys.TAB);
        vendorPages.passwordSY.sendKeys(ConfigReader.getProperty("allovercommercePasswordSy"),Keys.ENTER);
        vendorPages.enterButtonSY.click();

//    My Account yazisina tiklanir
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        vendorPages.myAccountButtonSY.click();

//    Acilan sayfada Store Manager butonuna tiklanir
        ReusableMethods.bekle(2);

        vendorPages.storeManagerButtonSY.click();
//    Acilan sayfada products button tiklanir
        ReusableMethods.bekle(2);
        vendorPages.productsButtonSY.click();

//    Acilan sayfada Add New butonuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.addNewButtonSY.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement((WebElement) vendorPages.addNewButtonSY).click().perform();

//        Acilan sayfada Fotograf ekleme kutusuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.imageButtonSY.click();
//        Acilan sayfada SELECT FILES butonuna tiklanir
        ReusableMethods.bekle(4);
        vendorPages.selectFilesButtonSY.click();
//        Acilan pencereden yuklenmek istenen fotograf secilir ve ac butonu tiklanir
        String dosyaYolu="C:\\Users\\derya\\Desktop\\kus.jpg";
        ReusableMethods.uploadFile(dosyaYolu);

//        Acilan sayfadan SELECT butonuna tiklanir
        ReusableMethods.bekle(3);
       vendorPages.selectButtonSY.click();

//        Fotografin yuklendigi dogrulanir
        Assert.assertTrue(vendorPages.xButtonSY.isEnabled());
        Driver.closeDriver();
    }

    @Test
    public void tc03() {

//    Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlSy"));

//    Sign in butonuna tiklanir

        vendorPages.signinButtonSY.click();
//    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        vendorPages.emailSY.sendKeys(ConfigReader.getProperty("allovercommerceEmailSy"),Keys.TAB);
        vendorPages.passwordSY.sendKeys(ConfigReader.getProperty("allovercommercePasswordSy"),Keys.ENTER);
        vendorPages.enterButtonSY.click();

//    My Account yazisina tiklanir
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        vendorPages.myAccountButtonSY.click();

//    Acilan sayfada Store Manager butonuna tiklanir
        ReusableMethods.bekle(2);

        vendorPages.storeManagerButtonSY.click();
//    Acilan sayfada products button tiklanir
        ReusableMethods.bekle(2);
        vendorPages.productsButtonSY.click();

//    Acilan sayfada Add New butonuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.addNewButtonSY.click();

//        Acilan sayfada Product Title, Short Description ve Description alanlarina gecerli datalar girilir
//        Product Title alanina veri girilir
        ReusableMethods.scroll(vendorPages.productTitleMetinAlaniSY);
        vendorPages.productTitleMetinAlaniSY.sendKeys(ConfigReader.getProperty("productTitleSy"));


//        Short description alanina veri girilir  ve veri girildigini doğrulanir
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().frame(0);
        vendorPages.shortDescriptionMetinAlaniSY.sendKeys(ConfigReader.getProperty("shortDescriptionSy"));
        Assert.assertTrue(vendorPages.shortDescriptionMetinAlaniSY.getText().contains("aciklama"));
        Driver.getDriver().switchTo().defaultContent();
//        Description alanina veri girilir  ve veri girildigini doğrulanir
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().frame(1);
        vendorPages.descriptionMetinAlaniSY.sendKeys(ConfigReader.getProperty("descriptionSy"));
        Assert.assertTrue(vendorPages.descriptionMetinAlaniSY.getText().contains("notlar"));
//        Product Title, Short Description ve Description alanlarina gecerli datalarin girilebildigi dogrulanir
        Driver.closeDriver();
    }

    @Test
    public void tc04() {

//    Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlSy"));

//    Sign in butonuna tiklanir

        vendorPages.signinButtonSY.click();
//    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        vendorPages.emailSY.sendKeys(ConfigReader.getProperty("allovercommerceEmailSy"),Keys.TAB);
        vendorPages.passwordSY.sendKeys(ConfigReader.getProperty("allovercommercePasswordSy"),Keys.ENTER);
        vendorPages.enterButtonSY.click();

//    My Account yazisina tiklanir
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        vendorPages.myAccountButtonSY.click();

//    Acilan sayfada Store Manager butonuna tiklanir
        ReusableMethods.bekle(2);

        vendorPages.storeManagerButtonSY.click();
//    Acilan sayfada products button tiklanir
        ReusableMethods.bekle(2);
        vendorPages.productsButtonSY.click();

//    Acilan sayfada Add New butonuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.addNewButtonSY.click();

//        Catagories yazisinin goruntulendigini dogrulanir
        ReusableMethods.scroll(vendorPages.catagoriesToplamClikButtonSY);
        Assert.assertTrue(vendorPages.categoriesButtonSY.isDisplayed());

//        Categories webelementinden istedigin bir urunu secilir
        ReusableMethods.click(vendorPages.catagoriesToplamClikButtonSY);
        ReusableMethods.bekle(3);

//        Categories secilebildigi dogrulanir
        List<WebElement> clickButonlari = Driver.getDriver().findElements((By.xpath("//input[@name='product_cats[]']")));

        for (int i = 0; i < clickButonlari.size(); i++) {
            if (clickButonlari.get(i).isDisplayed()){
                ReusableMethods.click(clickButonlari.get(i));
            }
        }

        Driver.closeDriver();
    }

    @Test
    public void tc05() {


//    Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlSy"));

//    Sign in butonuna tiklanir

        vendorPages.signinButtonSY.click();
//    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        vendorPages.emailSY.sendKeys(ConfigReader.getProperty("allovercommerceEmailSy"),Keys.TAB);
        vendorPages.passwordSY.sendKeys(ConfigReader.getProperty("allovercommercePasswordSy"),Keys.ENTER);
        vendorPages.enterButtonSY.click();

//    My Account yazisina tiklanir
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        vendorPages.myAccountButtonSY.click();

//    Acilan sayfada Store Manager butonuna tiklanir
        ReusableMethods.bekle(2);

        vendorPages.storeManagerButtonSY.click();
//    Acilan sayfada products button tiklanir
        ReusableMethods.bekle(2);
        vendorPages.productsButtonSY.click();

//    Acilan sayfada Add New butonuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.addNewButtonSY.click();
        ReusableMethods.bekle(2);

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();

//        Acilan sayfada Categories alaninda Add new category yazisina tiklanir
        ReusableMethods.scroll(vendorPages.addNewCategoryButtonSY);
        ReusableMethods.click(vendorPages.addNewCategoryButtonSY);
        ReusableMethods.bekle(2);
//        Category Name alanina gecerli bir data girilir

        vendorPages.categoryNameBoxSY.sendKeys(faker.color().name());
        ReusableMethods.bekle(2);

        ReusableMethods.scroll(vendorPages.productsButtonSY);

        //Parent categoryden bir category sec
        ReusableMethods.ddmIndex(vendorPages.parentCategoryDDMSY,0);
        ReusableMethods.bekle(2);

//        ADD butonuna tiklanir
        vendorPages.ADDButtonSY.click();

//        Yeni Categories eklenebildigi dogrulanir
        Assert.assertTrue(vendorPages.yeniEklenenSY.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void tc06() {

//    Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlSy"));

//    Sign in butonuna tiklanir
        vendorPages.signinButtonSY.click();

//    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        vendorPages.emailSY.sendKeys(ConfigReader.getProperty("allovercommerceEmailSy"),Keys.TAB);
        vendorPages.passwordSY.sendKeys(ConfigReader.getProperty("allovercommercePasswordSy"),Keys.ENTER);
        vendorPages.enterButtonSY.click();

//    My Account yazisina tiklanir
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        vendorPages.myAccountButtonSY.click();

//    Acilan sayfada Store Manager butonuna tiklanir
        ReusableMethods.bekle(2);

        vendorPages.storeManagerButtonSY.click();
//    Acilan sayfada products button tiklanir
        ReusableMethods.bekle(2);
        vendorPages.productsButtonSY.click();

//    Acilan sayfada Add New butonuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.addNewButtonSY.click();
        ReusableMethods.bekle(2);

//        Acilan sayfada Product brands alanindan ilgili kutucuk tiklanrak isaretlenir
        ReusableMethods.click(vendorPages.productBrandsClickButtonSY);

//        Product brands secilebildigi dogrulanir
        List<WebElement> list= Driver.getDriver().findElements(By.xpath("//input[@name='product_custom_taxonomies[product_brand][]']"));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isDisplayed()){
                ReusableMethods.click(list.get(i));
            }

        }
        Driver.closeDriver();

    }

    @Test
    public void tc07() {

//    Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlSy"));

//    Sign in butonuna tiklanir
        vendorPages.signinButtonSY.click();

//    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        vendorPages.emailSY.sendKeys(ConfigReader.getProperty("allovercommerceEmailSy"),Keys.TAB);
        vendorPages.passwordSY.sendKeys(ConfigReader.getProperty("allovercommercePasswordSy"),Keys.ENTER);
        vendorPages.enterButtonSY.click();

//    My Account yazisina tiklanir
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        vendorPages.myAccountButtonSY.click();

//    Acilan sayfada Store Manager butonuna tiklanir
        ReusableMethods.bekle(2);

        vendorPages.storeManagerButtonSY.click();
//    Acilan sayfada products button tiklanir
        ReusableMethods.bekle(2);
        vendorPages.productsButtonSY.click();

//    Acilan sayfada Add New butonuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.addNewButtonSY.click();

//     Acilan sayfada Product brands alaninda Add new Product brands yazisina tiklanir
        ReusableMethods.scroll(vendorPages.addNewProductBrandsButtonSY);
        ReusableMethods.click(vendorPages.addNewProductBrandsButtonSY);
        ReusableMethods.bekle(2);

//        Product brands Name alanina gecerli bir data girilir
        vendorPages.productBrandsNameBoxSY.sendKeys(faker.country().name());
        ReusableMethods.bekle(2);

//        Parent taxonomiy'den birini secilebilmeli
        ReusableMethods.ddmIndex(vendorPages.parentTaxonomyDDMSY,4);
        ReusableMethods.bekle(2);

//        ADD butonuna tiklanir
        ReusableMethods.click(vendorPages.productBrandAddButtonSY);
        ReusableMethods.bekle(2);

//        Yeni Product brands eklenebildigi dogrulanir
        Assert.assertTrue(vendorPages.productBrandsEklenenUrunSY.isDisplayed());

        Driver.closeDriver();
    }



}
