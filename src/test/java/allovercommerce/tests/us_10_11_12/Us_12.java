package allovercommerce.tests.us_10_11_12;

import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us_12 {
    VendorPages vendorPages = new VendorPages();

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));
        vendorPages.siginButton.click();
        vendorPages.userNameOrEmail.sendKeys(ConfigReader.getProperty("vendormail"), Keys.TAB,
                ConfigReader.getProperty("vendorPass"), Keys.ENTER);

        ReusableMethods.bekle(3);

        vendorPages.signOutButonu.click();

        vendorPages.address.click();
        vendorPages.Addbutonu.click();

        ReusableMethods.scroll(vendorPages.followings);

        String email = vendorPages.billingAddressEmailSA.getText();
        Assert.assertTrue(email.isEmpty());

        String firstName = vendorPages.billingAddressFirstNameSA.getText();
        Assert.assertTrue(firstName.isEmpty());

        String lastName = vendorPages.billingAddressLastNameSA.getText();
        Assert.assertTrue(lastName.isEmpty());

        ReusableMethods.click(vendorPages.billingSaveAddressSA);


    }

    @Test
    public void test02() {

        ReusableMethods.scroll(vendorPages.logOut);

        vendorPages.billingAddressFirstNameSA.sendKeys(ConfigReader.getProperty("firstName"));
        vendorPages.billingAddressLastNameSA.sendKeys(ConfigReader.getProperty("lastName"));

        ReusableMethods.click(vendorPages.billingSaveAddressSA);

    }

    @Test
    public void test03() {

        ReusableMethods.scroll(vendorPages.logOut);

        ReusableMethods.click(vendorPages.billingAddressCountryRegionDdmSA);
        vendorPages.billingAddressCountryRegionDdmSA.sendKeys("Germany", Keys.ENTER);
        vendorPages.billingAddressStreetAddressKutusuSA.sendKeys("Biberweg 5");
        vendorPages.billingAddressZipCodeSA.sendKeys("85152");
        vendorPages.billingAddressTownCitySA.sendKeys("Köln");
        vendorPages.billingAddressPhoneSA.sendKeys("01786523654");

        ReusableMethods.click(vendorPages.billingSaveAddressSA);


    }
}

