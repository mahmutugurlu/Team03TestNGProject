package allovercommerce.tests.us_13_19_20;

import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_20 {


    @Test
    public void testVendorKuponKullanimi() {

        VendorPages vendorPages = new VendorPages();
        Faker faker = new Faker();

        //        Kullanici anasayfaya girer
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));

        //    Sign in butonuna tiklanir
        vendorPages.siginButton.click();

        //    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek vendor olarak giris yapilir
        String fakemail = ConfigReader.getProperty("fakeEmail2");
        String password = ConfigReader.getProperty("password2");
        vendorPages.userName.sendKeys(fakemail);
        vendorPages.password.sendKeys(password, Keys.ENTER);

        //Ürün secilir ve alisveris sepetine konulur
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(4);
        vendorPages.searchBox.click();
        vendorPages.searchBox.sendKeys("tablo", Keys.TAB, Keys.ENTER);
        vendorPages.tablo.click();
        vendorPages.addToCartButton.click();

        //Ödeme noktasina gidilir
        ReusableMethods.bekle(4);
        vendorPages.wiewCart.click();
        vendorPages.wiewCartSubmit.click();

        //Ödeme icin kupon kullanilir
        vendorPages.kuponText.sendKeys("kod");
        ReusableMethods.scroll(Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-rounded btn-border-thin btn-outline btn-dark button']")));
        ReusableMethods.bekle(3);
        vendorPages.kuponApply.click();

        //Kuponun kullanildigini anlamak icin mesaj yazisina bakilir
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorPages.couponKullanimMesaji.getText().contains("Coupon code already applied!"));

        Driver.closeDriver();


    }







    }
