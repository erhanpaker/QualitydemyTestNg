package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualitydemyTest {

    QualitydemyPage quality = new QualitydemyPage();

    @Test

    public void qualitydemyTest() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        quality.cookies.click();

        quality.login.click();

        quality.emailButonu.sendKeys(ConfigReader.getProperty("GecerliMail"));

        ReusableMethods.waitForClickablility(quality.loginButton,5);

        quality.passwordBox.sendKeys(ConfigReader.getProperty("GecerliPassword"));
        ReusableMethods.bekle(5);
        quality.loginButton.click();

        ReusableMethods.bekle(10);

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(quality.categories).moveToElement(quality.allcourses).
                click(quality.allcourses).perform();

        actions.sendKeys(Keys.END).perform();
















    }
}