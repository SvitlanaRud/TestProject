package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//h1[contains((text(),'Sign in to GitHub']")
    private WebElement welcomeMessage;

    public void takeScreenshot(){
//        takeScreenshot();
    }
}
