package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualitydemyTest {
    Actions actions = new Actions(Driver.getDriver());
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

        ReusableMethods.bekle(5);

        // Actions actions = new Actions(Driver.getDriver());

       actions.moveToElement(quality.categories).moveToElement(quality.allcourses).
               click(quality.allcourses).perform();
        ReusableMethods.bekle(10);

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        quality.second.click();
        ReusableMethods.bekle(5);
        quality.englsh.click();

        quality.bay.click();

        quality.checkout.click();

        quality.stripe.click();

        ReusableMethods.bekle(5);

        quality.payWithButon.click();

        actions.sendKeys(quality.payButon, "anevzatcelik@gmail.com").perform();

        actions.sendKeys(Keys.TAB).sendKeys("4242424242424242").
                sendKeys(Keys.TAB).sendKeys(" 11 24").
                sendKeys(Keys.TAB).sendKeys("323").
                sendKeys(Keys.TAB).sendKeys("ahmet bye").
                sendKeys(Keys.TAB).click(quality.paybuton).

                // telefon numarasını kutucuğa yazmıyor
                sendKeys("555 252 22 22").perform();
        quality.ode.click();

    }

    @Test

    public void test2(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        quality.cookies.click();

        quality.login.click();

        quality.emailButonu.sendKeys(ConfigReader.getProperty("GecerliMail"));


        ReusableMethods.waitForClickablility(quality.loginButton,5);

        quality.passwordBox.sendKeys(ConfigReader.getProperty("GecerliPassword"));
        ReusableMethods.bekle(5);
        quality.loginButton.click();

        actions.sendKeys(Keys.PAGE_DOWN).

                sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);

        quality.ikincimetod.click();

        quality.wislihst.click();

        ReusableMethods.bekle(6);

        actions.sendKeys(Keys.PAGE_UP).moveToElement(quality.kalp).click(quality.tgoto).perform();







    }
}