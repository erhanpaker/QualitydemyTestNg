package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.ConfigReader;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookies;

    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement login;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailButonu;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButton;


    @FindBy(xpath = "//span[@class='fw-500']")
    public WebElement categories;

    @FindBy(xpath = "(//*[text()='All courses'])[1]")
    public WebElement allcourses;

    @FindBy(xpath = "//*[text(='2')")
    public WebElement seconPage;


    @FindBy(xpath = "//*[text()='All courses'])[1]")
    public WebElement english;


    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/nav/ul/li[2]/a")
    public WebElement second;

    @FindBy(xpath = "(//a[@class='course-title'])[6]")
    public WebElement englsh;

    @FindBy(xpath = "//*[@id=\"course_12\"]")
    public WebElement bay;

    @FindBy(xpath = "//*[@id=\"cart_items_details\"]/div[2]/div/button")
    public WebElement checkout;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[1]/div/div/img[2]")
    public WebElement stripe;

    @FindBy(xpath = "//*[@id=\"stripePayButton\"]")
    public WebElement payWithButon;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement payButon;

    @FindBy(xpath = "//*[@id=\"cardNumber\"]")
    public WebElement cardNumber;

    @FindBy(xpath = "//*[@id=\"enableStripePass\"]")
    public  WebElement paybuton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[2]/div/div[2]/button/div[3]")
    public WebElement ode;

    @FindBy(xpath = "(//div[@class='course-image'])[1]")
    public WebElement ikincimetod;

    @FindBy(xpath = "(//div[@class='buy-btns'])[1]")
    public WebElement wislihst;

    @FindBy(xpath = "//*[@id=\"wishlist_items\"]/div[1]/a/i")
    public WebElement kalp;

    @FindBy(xpath = "//*[@id=\"wishlist_items\"]/div[2]/div[1]/div[2]/a")
    public WebElement tgoto;




}
