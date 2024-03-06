package allovercommerce.tests.us_10_11_12;

import allovercommerce.pages.RegisterPages;
import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import org.testng.annotations.Test;

public class Us_11 {

    VendorPages vendorPages = new VendorPages();
    RegisterPages registerPages = new RegisterPages();

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));
        registerPages.register.click();
        registerPages.becomeAVendor.click();




    }
}


