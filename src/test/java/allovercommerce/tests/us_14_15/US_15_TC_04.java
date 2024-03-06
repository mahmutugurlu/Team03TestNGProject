package allovercommerce.tests.us_14_15;

import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.Extent_Reports;
import allovercommerce.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static allovercommerce.utilities.Extent_Reports.extentReport;

public class US_15_TC_04 {

    VendorPages vendorPages=new VendorPages();
    Faker faker=new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void tc04() {
        Extent_Reports.rapor(ConfigReader.getProperty("browser"),"My Extent Report","Sule");
        ExtentTest extentTest = extentReport.createTest("15-TC04", "Test Raporu");
//        Kullanici anasayfaya girer
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlSy"));
        extentTest.info("Kullanici Allover Commerce sayfasina gider");

//    Sign in butonuna tiklanir
        vendorPages.signinButtonSY.click();
        extentTest.info("Kullanici sign in butonuna tiklar");

//    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        vendorPages.emailSY.sendKeys(ConfigReader.getProperty("allovercommerceEmailSy"), Keys.TAB);
        vendorPages.passwordSY.sendKeys(ConfigReader.getProperty("allovercommercePasswordSy"),Keys.ENTER);
        vendorPages.enterButtonSY.click();
        extentTest.info("Kullanici kayitli bir email ve password girer ve sign in butonuna tiklar");

//    My Account yazisina tiklanir
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        vendorPages.myAccountButtonSY.click();
        extentTest.info("Kullanici  My Account butonuna tiklar");

//    Acilan sayfada Store Manager butonuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.storeManagerButtonSY.click();
        extentTest.info("Kullanici  Store Manager butonuna tiklar");

//    Acilan sayfada products button tiklanir
        ReusableMethods.bekle(2);
        vendorPages.productsButtonSY.click();
        extentTest.info("Kullanici My Store webelementi altindaki Products butonuna tiklar");

//    Acilan sayfada Add New butonuna tiklanir
        ReusableMethods.bekle(2);
        vendorPages.addNewButtonSY.click();
        extentTest.info("Kullanici  Add New butonuna tiklar");

//        Acilan ekranda Inventory, Shipping, Attributes, Linked, SEO, Advance Menuleri gorulur

//        Attributes yazisina tiklanir
        ReusableMethods.click(vendorPages.attributesButtonSY);
        Assert.assertTrue(vendorPages.attributesButtonSY.isDisplayed());
        extentTest.info("Kullanici Attributes menuye verify yap ve tiklar");

//        Add Product altinda yer alan seceneklerden biri tercih edilir
        ReusableMethods.ddmIndex(vendorPages.productTypeDDMSY,0);
        extentTest.info("Add Product altinda yer alan seceneklerden biri tercih edilir");

//        Product Title bolumune valid bir deger girilir
        Us_15_Methodlari.productTitleEkle();
        extentTest.info("Kullanici Inventory butonuna tiklar");

        Us_15_Methodlari.kucukResimEkle();
        extentTest.info("Kullanici kucuk img alnina bir resim ekler");

//        Featured Images ve Gallery Images e fotolar yuklenir
        Us_15_Methodlari.buyukResimEkle();
        extentTest.info("Kullanici img alnina bir resim ekler");
        ReusableMethods.bekle(2);

//        Categories kisminda uygun br deger girilir
        Us_15_Methodlari.categoriesSec();
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici Categories kismina uygun bir deger girer");
        ReusableMethods.bekle(3);

//        Attributes bolumunde Color sekmesine tiklanip bir deger secilir
        ReusableMethods.scroll(vendorPages.attributesButtonSY);
        ReusableMethods.click(vendorPages.attributesColorClickButtonSY);
        ReusableMethods.scroll(vendorPages.inventoryButtonSY);
        ReusableMethods.click(vendorPages.colorDDM_SY);
        ReusableMethods.click(vendorPages.colorYeni);
        Assert.assertTrue(vendorPages.colorDDM_SY.isEnabled());
        extentTest.info("Kullanici Color secenegini tiklar");
        extentTest.info("Kullanici Color DDM''dan bir deger sec ve verify yapar");
        ReusableMethods.bekle(3);

        Assert.assertTrue(vendorPages.visibleOnProductPageCheckboxSY.isDisplayed());
        ReusableMethods.bekle(3);
        extentTest.info("Kullanici Visible on the product page kutunu secilebildigini dogrular");


//        Size kismina tiklanip bir deger secilir
        ReusableMethods.click(vendorPages.sizeButtonSY);
        ReusableMethods.ddmIndex(vendorPages.sizeButtonDDM_SY,8);
        Assert.assertTrue(vendorPages.sizeButtonSY.isEnabled());
        ReusableMethods.bekle(3);
        extentTest.info("Kullanici Size secenegini tiklar");
        extentTest.info("Kullanici Size DDM''  dan bir deger sec ve verify yapar");

//        Add Attribute tiklanip Name ve Value degerleri girilir
        ReusableMethods.click(vendorPages.sizeAddNewButtonSY);
        extentTest.info("Kullanici Size secenegini tiklar");
        ReusableMethods.bekle(3);
        vendorPages.sizeNameButtonSY.sendKeys(faker.name().bloodGroup(),Keys.TAB,faker.internet().domainName(),Keys.TAB);
        extentTest.info("Kullanici name ve value deger girer");
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorPages.sizeNameButtonSY.isEnabled());

        Assert.assertTrue(vendorPages.sizeSelectAllButtonSY.isDisplayed());
        Assert.assertTrue(vendorPages.sizeAddNewButtonSY.isDisplayed());
        Assert.assertTrue(vendorPages.sizeSelectNoneButtonSY.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici Select all, select none ve add new butonlarının görünür olduğunu doğrular");

//        Submit butonuna basilir ve Products sayfasinda bilginin eklendigi dogrulanir
        ReusableMethods.click(vendorPages.submitButtonSY);
        Assert.assertTrue(vendorPages.kayitMesajiSY.isDisplayed());
        extentTest.info("Kullanici Attribute islemlerinin yapildigini dogrular");
        extentTest.pass("Kullanici Attribute islemlerinin yapildigini dogrulandi");
        extentReport.flush();
        Driver.closeDriver();

    }

}
