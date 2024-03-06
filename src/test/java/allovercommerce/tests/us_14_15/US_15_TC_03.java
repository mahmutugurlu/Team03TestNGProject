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

public class US_15_TC_03 {

    VendorPages vendorPages=new VendorPages();
    Faker faker=new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void t03() {

        Extent_Reports.rapor(ConfigReader.getProperty("browser"),"My Extent Report","Sule");
        ExtentTest extentTest = extentReport.createTest("15-TC03", "Test Raporu");

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

//        Acilan ekranda Inventory, Shipping, Attributes, Linked, SEO, Advanced Menulerinin goruldugu dogrulanir

//        Shipping yazisina tiklanir
        ReusableMethods.scroll(vendorPages.shippingButtonSY);
        ReusableMethods.click(vendorPages.shippingButtonSY);
        Assert.assertTrue(vendorPages.shippingButtonSY.isDisplayed());
        extentTest.info("Kullanici Shipping butonuna tiklar");


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

//        Shipping bolumunde Weight kismina valid bir deger girilir
//        Dimensions kisminda olculer girilir

        ReusableMethods.scroll(vendorPages.inventoryButtonSY);
        vendorPages.weightBoxSY.sendKeys(faker.number().digits(2),
                Keys.TAB,faker.number().digits(1),
                Keys.TAB,faker.number().digits(3),
                Keys.TAB,faker.number().digits(2));

        extentTest.info("Kullanici Weight alanina veri gonderir");
        extentTest.info("Kullanici Diemnsions alanininda lengt e  veri girer");
        extentTest.info("Kullanici Widht alanına veri girer");
        extentTest.info("KullaniciHeight alanına veri girer");

//        Shipping class secilir
        ReusableMethods.ddmVisibleText(vendorPages.shippingClassKutusuDDM_SY,"No shipping class");
        extentTest.info("Kullanici Shipping class ddm butonuna tıklar");

//        Processing time secilir
        ReusableMethods.ddmIndex(vendorPages.processing_timeDDM_SY,7);
        Assert.assertTrue(vendorPages.processing_timeDDM_SY.isEnabled());
        extentTest.info("Kullanici Processing Time butonuna tıklar ve ddm e erisilebildigini dogrular");

//        Submit butonuna basilir ve Products sayfasinda urune eklendigi dogrulanir
        ReusableMethods.scroll(vendorPages.submitButtonSY);
        ReusableMethods.click(vendorPages.submitButtonSY);
        extentTest.info("Kullanici submit butonuna basar");

//        ReusableMethods.scroll(vendorPages.kayitMesajiSY);
        Assert.assertTrue(vendorPages.kayitMesajiSY.isDisplayed());
        extentTest.info("Kullanici Shipping islemlerinin yapildigini dogrular");
        extentTest.pass("Kullanici Shipping islemlerinin yapildigini dogrulandi");
        extentReport.flush();
        Driver.closeDriver();

    }

}
