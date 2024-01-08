package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTestsPage {

    static WebDriver driver;

    public LoginTestsPage(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    //Data extracted from the browser
    public static void singIn(String username, String password){
        //get values
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        //set values
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);

        //click on the button
        loginBtn.click();

        //close the window once the process finish.
        driver.quit();


    }
}
