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


    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/nav/ul/li[3]")
    public WebElement second;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div[2]/ul/li[1]/div/div[1]/a/img")
    public WebElement engılsh;

    @FindBy(xpath = "//*[@id=\"course_13\"]")
    public WebElement bay;

    @FindBy(xpath = "//*[@id=\"cart_items_details\"]/div[2]/div/button")
    public WebElement checkout;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[1]/div/div/img[2]")
    public WebElement stripe;



}
