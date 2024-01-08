package Tests;

import Pages.testPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
    }

    @Test
    public void login() {

    }

}
