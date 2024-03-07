package allovercommerce.tests.us_10_11_12;

import allovercommerce.pages.RegisterPages;
import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us_11 {

    VendorPages vendorPages = new VendorPages();

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));
        vendorPages.siginButton.click();
        vendorPages.userNameOrEmail.sendKeys(ConfigReader.getProperty("vendorUserName"), Keys.TAB,
                ConfigReader.getProperty("vendorPassword"), Keys.ENTER);

        ReusableMethods.bekle(3);

        vendorPages.signOutButonu.click();

        Assert.assertTrue(vendorPages.Myaccountyazisi.isDisplayed());


    }

    @Test
    public void test02() {

        vendorPages.storManager.isDisplayed();
        vendorPages.orders.isDisplayed();
        vendorPages.downloads.isDisplayed();
        vendorPages.address.isDisplayed();
        vendorPages.accountDetails.isDisplayed();
        vendorPages.wishList.isDisplayed();
        vendorPages.support.isDisplayed();
        vendorPages.followings.isDisplayed();
        vendorPages.logOut.isDisplayed();

        ReusableMethods.scroll(vendorPages.Dashboard);
        ReusableMethods.bekle(1);

    }

    @Test
    public void test03() {

        vendorPages.storManager.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().getTitle().contains("https://allovercommerce.com/store-manager/");

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

    }

    @Test
    public void test04() {

        vendorPages.orders.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().getTitle().contains("https://allovercommerce.com/my-account-2/orders/");

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
    }

    @Test
    public void test05() {

        vendorPages.downloads.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().getTitle().contains("https://allovercommerce.com/my-account-2/downloads/");

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
    }

    @Test
    public void test06() {

        vendorPages.address.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().getTitle().contains("https://allovercommerce.com/my-account-2/edit-address/");

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
    }

    @Test
    public void test07() {

        vendorPages.accountDetails.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().getTitle().contains("https://allovercommerce.com/my-account-2/edit-account/");

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
    }

    @Test
    public void test08() {

        vendorPages.wishList.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().getTitle().contains("https://allovercommerce.com/wishlist/");

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
    }

    @Test
    public void test09() {

        vendorPages.support.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().getTitle().contains("https://allovercommerce.com/my-account-2/support-tickets/");

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
    }

    @Test
    public void test10() {

        vendorPages.followings.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().getTitle().contains("https://allovercommerce.com/my-account-2/followings/");

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
    }
    @Test
    public void test11() {

        vendorPages.logOut.click();
        ReusableMethods.bekle(2);
        vendorPages.siginButton.isDisplayed();

        Driver.closeDriver();
    }
}


