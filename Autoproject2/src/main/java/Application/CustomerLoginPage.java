package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");

    public CustomerLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String userEmail) {
        driver.findElement(emailField).sendKeys(userEmail);
    }
    public void enterPassword(String userPassword) {
        driver.findElement(passwordField).sendKeys(userPassword);
    }
}
