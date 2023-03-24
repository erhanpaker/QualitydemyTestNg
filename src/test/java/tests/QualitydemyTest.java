package tests;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualitydemyTest {

    QualitydemyPage quality = new QualitydemyPage();

    @Test

    public void qualitydemyTest() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        quality.cookies.click();

        quality.login.click();

        quality.emailButonu.sendKeys(ConfigReader.getProperty("GecerliMail"));

        Thread.sleep(500);

        quality.passwordBox.sendKeys(ConfigReader.getProperty("GecerliPassword"));

        quality.loginButton.click();

    }
}
