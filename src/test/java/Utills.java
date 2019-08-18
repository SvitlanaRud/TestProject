import Drivers.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Utills extends DriverFactory {

    public static void stopApp() {
        driver.quit();
    }

    public static void takeScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).
                getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("D:/screenshots/" + System.getProperty("driver") + ".png"));
    }
}
