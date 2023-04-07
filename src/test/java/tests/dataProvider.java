package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class dataProvider {


    @DataProvider



    public static Object[][] gonderilecekLogin(){
        Object[][] gonderilecekMailPassword ={{"erhan"},{"ali"},{"can"},{"anevzatcelik@gmail.com"}};


        return gonderilecekMailPassword;
    }

    @Test(dataProvider = "gonderilecekLogin")

    public void qualityTest(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
}
