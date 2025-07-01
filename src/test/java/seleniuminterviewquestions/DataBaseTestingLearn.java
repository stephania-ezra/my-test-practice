package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DataBaseTestingLearn {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(DataBaseTestingLearn.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        DataBaseTestingLearn dbtl = new DataBaseTestingLearn();
        dbtl.driver.get("https://www.opencart.com/index.php?route=account/register");
        dbtl.driver.manage().window().maximize();
        dbtl.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        dbtl.registerForOpenCart();
        dbtl.driver.quit();
    }

    void registerForOpenCart() {

        WebElement userNameElement = driver.findElement(By.xpath("//*[@id=\"input-username\"]"));
        userNameElement.sendKeys("Edward");

        WebElement firstNameElement = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        firstNameElement.sendKeys("Edie");

        WebElement lastNameElement = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        lastNameElement.sendKeys("Cullan");

        WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        emailElement.sendKeys("edie.cullan@gmail.com");

        WebElement countryElement = driver.findElement(By.xpath("//*[@id=\"input-country\"]"));
        countryElement.sendKeys("India");

        WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        passwordElement.sendKeys("edie12%@cu#23");

        WebElement clickOrTouchFlagElement = driver.findElement(By.
                xpath("//*[@id=\"captcha-message\"]/div"));
        clickOrTouchFlagElement.click();

        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]"));
        registerButton.click();

        log.info("User Registration completed");
    }
}
