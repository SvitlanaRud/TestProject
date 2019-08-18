package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static WebDriver driver;
    public static WebDriverWait wait;


    public static WebDriver getDriver() {

        String property = System.getProperty("driver");
       //  if ("selenium".equals(property)) {
        driver = new ChromeDriver();
        driver.navigate().to("http://github.com");
        driver.manage().window().maximize();
      // }
     /*  else if ("appium".equals(property))
    {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "uiautomator");
        caps.setCapability("platformVersion", "5.1");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", " http://saucelabs.com/example_files/ContactManager.apk");
        try {
            driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver, 10);
    }*/
        return driver;
    }
}
