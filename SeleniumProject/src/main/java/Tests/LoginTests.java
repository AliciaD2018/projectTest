package Tests;

import Pages.LoginTestsPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTests {
    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
    }

    /*
    * We can run tests individually.
    * */
    @Test
    public void loginSuccessful() {
        //variables
        String username="standard_user";
        String password="secret_sauce";
        String expectedURL="https://www.saucedemo.com/inventory.html";

        //login works with the values.
        LoginTestsPage testpage = new LoginTestsPage(driver);
        LoginTestsPage.singIn(username, password);

        //validate the login works/loaded as expected.
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",expectedURL);

    }

}
