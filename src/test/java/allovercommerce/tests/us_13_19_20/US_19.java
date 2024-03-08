package allovercommerce.tests.us_13_19_20;

import allovercommerce.pages.AlloverCommercePages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_19 {

    @Test
    public void testKuponKullanimi() {

        AlloverCommercePages allovercommercePages = new AlloverCommercePages();
        Faker faker = new Faker();

        //        Kullanici anasayfaya girer
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommercelUrl"));

        //    Sign in butonuna tiklanir
        allovercommercePages.siginButton.click();

        //    Acilan pencerede Username or email address ve Password alanina gecerli datalar girilerek musteri olarak giris yapilir
        String fakemail = ConfigReader.getProperty("fakeEmail1");
        String password = ConfigReader.getProperty("password");
        allovercommercePages.userName.sendKeys(fakemail);
        allovercommercePages.password.sendKeys(password, Keys.ENTER);

        //Ürün secilir ve alisveris sepetine konulur
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(4);
        allovercommercePages.searchBox.click();
        allovercommercePages.searchBox.sendKeys("tablo", Keys.TAB,Keys.ENTER);
        allovercommercePages.tablo.click();
        allovercommercePages.addToCartButton.click();

        //Ödeme noktasina gidilir
        ReusableMethods.bekle(4);
        allovercommercePages.wiewCart.click();
        allovercommercePages.wiewCartSubmit.click();

        //Ödeme icin kupon kullanilir
        allovercommercePages.kuponText.sendKeys("kod");
        ReusableMethods.scroll(Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-rounded btn-border-thin btn-outline btn-dark button']")));
        ReusableMethods.bekle(3);
        allovercommercePages.kuponApply.click();

        //Kuponun kullanildigini anlamak icin mesaj yazisina bakilir
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(3);
        Assert.assertTrue(allovercommercePages.couponKullanimMesaji.getText().contains("Coupon code already applied!"));

        Driver.closeDriver();



    }


}
