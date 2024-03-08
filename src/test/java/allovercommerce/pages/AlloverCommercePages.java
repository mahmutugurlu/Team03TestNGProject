package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlloverCommercePages {




























    // Mahmut

    public AlloverCommercePages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement siginButton;

    @FindBy(xpath = " //*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = " //*[@id='password']")
    public WebElement password;

    @FindBy(xpath = " //*[@id='login']")
    public WebElement loginButton;


    @FindBy(xpath = " //*[@id='menu-item-1079']")
    public WebElement myAccountButton;


    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchBox;

    @FindBy(xpath = " //*[@srcset='https://allovercommerce.com/wp-content/uploads/2024/03/kus-123-300x300.jpg 300w, https://allovercommerce.com/wp-content/uploads/2024/03/kus-123-150x150.jpg 150w, https://allovercommerce.com/wp-content/uploads/2024/03/kus-123-86x86.jpg 86w']")
    public WebElement tablo;

    @FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']")
    public WebElement addToCartButton;


    @FindBy(xpath = "//*[@class='cart-name']")
    public WebElement wiewCart;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement wiewCartSubmit;

    @FindBy(xpath = "//*[@name='coupon_code']")
    public WebElement kuponText;

    @FindBy(xpath = "//*[@class='btn btn-rounded btn-border-thin btn-outline btn-dark button']")
    public WebElement kuponApply;

    @FindBy(xpath = "//*[text()='Coupon code already applied!']")
    public WebElement couponKullanimMesaji;







}
