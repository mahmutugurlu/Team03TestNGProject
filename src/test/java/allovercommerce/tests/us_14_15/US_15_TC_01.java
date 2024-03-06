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

public class US_15_TC_01 {
    VendorPages vendorPages=new VendorPages();
    Faker faker=new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void tc01() {
        Extent_Reports.rapor(ConfigReader.getProperty("browser"),"My Extent Report","Sule");
        ExtentTest extentTest = extentReport.createTest("15-TC01", "Test Raporu");

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
        Assert.assertTrue(vendorPages.inventoryButtonSY.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici Inventary menusunun gorundugunu dogrular");

        Assert.assertTrue(vendorPages.shippingButtonSY.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici Shipping menusunun gorundugunu dogrular");

        Assert.assertTrue(vendorPages.attributesButtonSY.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici Attributes menusunun gorundugunu dogrular");

        Assert.assertTrue(vendorPages.linkedButtonSY.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici Linked menusunun gorundugunu dogrular");

        Assert.assertTrue(vendorPages.seoButtonSY.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici SEO menusunun gorundugunu dogrular");

        Assert.assertTrue(vendorPages.advancedButtonSY.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici Advanced menusunun gorundugunu dogrular");

        extentTest.pass("Inventory, Shipping, Attributes, Linked, Seo, Advanced menüleri görülebildigi dogrulandi");

        extentReport.flush();


    }
}
