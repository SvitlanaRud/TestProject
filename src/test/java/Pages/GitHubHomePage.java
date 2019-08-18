package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GitHubHomePage extends BasePage {
//    @FindBy(xpath = "//a[@href='/login']")
    private WebElement sidnInLink = driver.findElement(By.xpath("//a[@href='/login']"));

    @FindBy (tagName = "h1")
    private WebElement welcomeMessage;

    @FindBy (xpath = "//div[@class = 'd-flex flex-items-center']/a")
    private WebElement signUpLink;

    public SignInPage clickSignInLink(){
        sidnInLink.click();
        return new SignInPage();
    }
}
