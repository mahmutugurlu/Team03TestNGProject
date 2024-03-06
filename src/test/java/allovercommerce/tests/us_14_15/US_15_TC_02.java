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

public class US_15_TC_02 {
    VendorPages vendorPages=new VendorPages();
    Faker faker=new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void tc02() {
        Extent_Reports.rapor(ConfigReader.getProperty("browser"),"My Extent Report","Sule");
        ExtentTest extentTest = extentReport.createTest("15-TC02", "Test Raporu");

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

//        Inventory yazisina tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.scroll(vendorPages.seoButtonSY);
        ReusableMethods.click(vendorPages.inventoryButtonSY);
        extentTest.info("Kullanici Inventory butonuna tiklar");


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

//        Inventory bolumunde yer alan SKU kutucuguna valid bir deger girilir
        ReusableMethods.scroll(vendorPages.inventoryButtonSY);
        vendorPages.skuBoxSY.sendKeys(faker.number().digits(2));
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorPages.skuBoxSY.isEnabled());
        extentTest.info(" Kullanici SKU  text alanına veri gonderir ve dogrular");

        //Stock status ddm' i sec ve dogrula
        ReusableMethods.scroll(vendorPages.stokStatussDDMSY);
        ReusableMethods.ddmIndex(vendorPages.stokStatussDDMSY,1);
        Assert.assertTrue(vendorPages.stokStatussDDMSY.isEnabled());
        extentTest.info("Stock status ddm' i secilir ve dogrulanir");

//        Manage Stock kutucuguna tiklanir
        ReusableMethods.scroll(vendorPages.manageStockClickButtonSY);
        ReusableMethods.click(vendorPages.manageStockClickButtonSY);
        extentTest.info("Kullanici Manage Stock butonuna tıklar ve dogrular");

//        Stock Qty ye valid bir deger girilir
//        ReusableMethods.scroll(vendorPages.soldIndividuallyClickButton);
        ReusableMethods.scroll(vendorPages.stokStatussDDMSY);
        vendorPages.stockqtyBoxSY.sendKeys(faker.number().digits(1));
        Assert.assertTrue(vendorPages.stockqtyBoxSY.isEnabled());
        extentTest.info("Stock Qty ye valid bir deger girilir ve dogrulanir");

//        Allow Backorders secim yapilir
        ReusableMethods.scroll(vendorPages.allowBackordersDDM_SY);
        ReusableMethods.ddmIndex(vendorPages.allowBackordersDDM_SY,1);
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorPages.allowBackordersDDM_SY.isEnabled());
        extentTest.info("Allow Backorders secim yapilir ve dogrulanir");


//        Sold indvidually kutucuguna tiklanir
        ReusableMethods.scroll(vendorPages.allowBackordersDDM_SY);
        vendorPages.soldIndividuallyClickButtonSY.click();
        Assert.assertTrue(vendorPages.soldIndividuallyClickButtonSY.isSelected());
        extentTest.info("Sold indvidually kutucuguna tiklanir ve dogrulanir");

//        Submit butonuna basilir ve Products sayfasinda urunun eklendigi dogrulanir
        ReusableMethods.scroll(vendorPages.submitButtonSY);
        vendorPages.submitButtonSY.click();
        extentTest.info("Kullanici Submit butonuna tiklar");

        ReusableMethods.scroll(vendorPages.kayitMesajiSY);
        Assert.assertTrue( vendorPages.kayitMesajiSY.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Kullanici Inventory islemlerinin yapildigini dogrular");
        extentTest.pass("Kullanici Inventory islemlerinin yapildigini dogrulandi");
        extentReport.flush();
        Driver.closeDriver();




    }

}
