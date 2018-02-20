package util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DriverManager {

    public void waitForElement(WiniumDriver driver, String elementName) {
        Wait<WebDriver> nwait = new FluentWait<WebDriver>(driver)
                .withTimeout(240000, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);
        nwait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementName)));
    }

    public WiniumDriver openAppWithDriver(String filepath) throws MalformedURLException {
        DesktopOptions options = new DesktopOptions();
        System.out.println(filepath);
        options.setApplicationPath(filepath);
        return new WiniumDriver(new URL("http://localhost:9999"), options);
    }
}
