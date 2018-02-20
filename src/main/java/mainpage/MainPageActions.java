package mainpage;

import org.openqa.selenium.winium.WiniumDriver;
import util.DriverManager;

import java.net.MalformedURLException;


public class MainPageActions {
    DriverManager driverManager = new DriverManager();

    public String sampleMainPageAction(String filepath) throws InterruptedException, MalformedURLException {
        System.out.println(filepath);
        WiniumDriver driver = driverManager.openAppWithDriver(filepath);
       /// driver.switchTo().activeElement();
        driver.findElementByClassName("Edit").sendKeys("Hello World!!!!!!!!!");
        //driver.quit();
        return "success";
    }

}