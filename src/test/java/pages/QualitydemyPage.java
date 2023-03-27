package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
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

    // @FindBy(xpath = "(//a[@class='course-title'])[5]")
    @FindBy(xpath = "//*[text()='All courses'])[1]")
    public WebElement english;

    @FindBy(xpath = "(//a[@class='course-title'])[2]")
    public WebElement second;



}
