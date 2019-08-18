package Tests;

import org.testng.annotations.Test;


public class SeleniumTest extends BaseTest {

    @Test
    public void simpleSeleniumTest()  {
        app.gitHubHomePage.clickSignInLink();

    }


}
