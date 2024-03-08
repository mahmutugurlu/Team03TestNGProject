package allovercommerce.tests.us_13_19_20;

import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.Extent_Reports;
import allovercommerce.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static allovercommerce.utilities.Extent_Reports.extentReport;

public class US_13 {

    @Test
    public void testadressChange() {


        VendorPages vendorPages = new VendorPages();
        Faker faker = new Faker();

        Extent_Reports.rapor(ConfigReader.getProperty("browser"),"My Extent Report","Mahmut");
        ExtentTest extentTest = extentReport.createTest("US13", "Test Raporu");


        //        Kullanici anasayfaya girer
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));
        extentTest.info("Kullanici Allover Commerce sayfasina gider");


        //    Sign in butonuna tiklanir
        vendorPages.siginButton.click();
        extentTest.info("Kullanici sign in butonuna tiklar");

        //    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        String fakemail = ConfigReader.getProperty("fakeEmail");
        String password = ConfigReader.getProperty("password");
        vendorPages.userName.sendKeys(fakemail);
        vendorPages.password.sendKeys(password, Keys.ENTER);
        extentTest.info("Kullanici kayitli bir email ve password girer ve sign in butonuna tiklar");

        //    My Account yazisina tiklanir
        ReusableMethods.bekle(3);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorPages.myAccountButton.click();
        extentTest.info("Kullanici  My Account butonuna tiklar");

        // Addresses butonuna tiklanir
        vendorPages.addressesButton.click();
        ReusableMethods.scroll(Driver.getDriver().findElement(By.xpath("//*[text()='Edit Your Shipping Address']")));
        ReusableMethods.bekle(3);
        extentTest.info("Kullanici  addresses butonuna tiklar");

        //Shipping adres butonuna tiklanir ve gerekli bilgiler girilir
        vendorPages.shippingAddressButton.click();
        vendorPages.firstName.sendKeys(faker.name().firstName());
        vendorPages.lastName.sendKeys(faker.name().lastName());
        vendorPages.companyName.sendKeys(faker.name().firstName());
        ReusableMethods.scroll(Driver.getDriver().findElement(By.cssSelector("#shipping_company")));
        ReusableMethods.bekle(4);
        vendorPages.countryAddress.click();
        ReusableMethods.bekle(4);
        vendorPages.companyName.sendKeys(faker.address().country(), Keys.ENTER);
        vendorPages.streetAddress.sendKeys(faker.address().streetAddress());
        vendorPages.townAddress.sendKeys(faker.address().cityName());
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        WebElement stateAddress = (WebElement) jse.executeScript("document.querySelector(\"#shipping_state\")");
        vendorPages.streetAddress.sendKeys(faker.address().state());
        vendorPages.zipCode.sendKeys(faker.address().zipCode());
        extentTest.info("Kullanici  Shipping adres butonuna tiklar ve gerekli bilgileri girer");

        //Saveadress butonuna tiklanir ve basarili kayit mesaji görülür
        vendorPages.saveAddressButton.click();
        Assert.assertTrue(vendorPages.successfullyMessage.isDisplayed());
        extentTest.info("Kullanici saveaddress butonuna tiklar");
        extentTest.pass("Basarili kayit mesaji görülür");

        extentReport.flush();


    }



    }
