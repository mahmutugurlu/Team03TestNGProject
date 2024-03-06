package allovercommerce.tests.us_14_15;

import allovercommerce.pages.VendorPages;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.ReusableMethods;

public class Us_15_Methodlari {
    public static void buyukResimEkle() {
        VendorPages vendorPages =new VendorPages();
        vendorPages.imageButtonSY.click();
        ReusableMethods.bekle(2);
        vendorPages.uploadFilesButtonSY.click();
        vendorPages.selectFilesButton2SY.click();
        String dosyaYolu="C:\\Users\\derya\\Desktop\\kus.jpg";
        ReusableMethods.uploadFile(dosyaYolu);
        vendorPages.selectButtonSY.click();

    }

    public static void kucukResimEkle() {


        VendorPages vendorPages =new VendorPages();
        vendorPages.kucukFotoSY.click();
        ReusableMethods.bekle(2);
        vendorPages.selectFilesButtonSY.click();
        String dosyaYolu="C:\\Users\\derya\\Desktop\\kus.jpg";
        ReusableMethods.uploadFile(dosyaYolu);
        vendorPages.addToGalleryButtonSY.click();
    }

    public static void productTitleEkle(){
        VendorPages vendorPages =new VendorPages();
        ReusableMethods.scroll(vendorPages.productTitleMetinAlaniSY);
        vendorPages.productTitleMetinAlaniSY.sendKeys(ConfigReader.getProperty("productTitleSy"));
        ReusableMethods.bekle(2);
    }

    public static void categoriesSec(){
        VendorPages vendorPages =new VendorPages();
        ReusableMethods.scroll(vendorPages.catagoriesClikButonuSY);
        ReusableMethods.click(vendorPages.catagoriesClikButonuSY);
        ReusableMethods.bekle(2);
    }

}
