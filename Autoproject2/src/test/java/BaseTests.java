import Application.CustomerLoginPage;
//import Application.Home.Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.WebDriver;

public class BaseTests {

    private WebDriver driver;
    protected Home.java home;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users/qxz3x80/Desktop/Driver/chromedriver.exe");
        //WebdriverManager.chromeDriver().SetUp();
        WebDriver driver = new ChromeDriver();
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("(https://magento.softwaretestingboard.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void enterEmail(String userEmail) {
        WebElement CustomerLogin = driver.findElement(By.id("Customer Login"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        System.out.println(email.getText());
        System.out.println(password.getText());
    }
}

