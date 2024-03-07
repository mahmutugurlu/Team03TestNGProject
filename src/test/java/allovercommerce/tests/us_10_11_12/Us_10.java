package allovercommerce.tests.us_10_11_12;

import allovercommerce.pages.RegisterPages;
import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us_10 {

    RegisterPages registerPages = new RegisterPages();
    VendorPages vendorPages = new VendorPages();

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));
        ReusableMethods.bekle(2);

        registerPages.register.click();
        vendorPages.becomeAVendorLinkiSA.click();

        vendorPages.emailBoxVendor.sendKeys("fakeEmail");

        registerPages.passwordKutusu.sendKeys("abc1");
        Assert.assertTrue(registerPages.tooShortYazisi.isDisplayed());



    }

    @Test
    public void test02() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));
        ReusableMethods.bekle(2);

        registerPages.register.click();
        vendorPages.becomeAVendorLinkiSA.click();

        vendorPages.emailBoxVendor.sendKeys("fakeEmail");

        registerPages.passwordKutusu.sendKeys("abc123");
        Assert.assertTrue(registerPages.weakYazisi.isDisplayed());


    }

    @Test
    public void test03() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));
        ReusableMethods.bekle(2);

        registerPages.register.click();
        vendorPages.becomeAVendorLinkiSA.click();

        vendorPages.emailBoxVendor.sendKeys("fakeEmail");

        registerPages.passwordKutusu.sendKeys("abc123-.");
        Assert.assertTrue(registerPages.goodYazisi.isDisplayed());



    }

    @Test
    public void test04() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));
        ReusableMethods.bekle(2);

        registerPages.register.click();
        vendorPages.becomeAVendorLinkiSA.click();

        vendorPages.emailBoxVendor.sendKeys("fakeEmail");

        registerPages.passwordKutusu.sendKeys("abc123-.?");
        Assert.assertTrue(registerPages.strongYazisi.isDisplayed());

        Driver.closeDriver();
    }
}