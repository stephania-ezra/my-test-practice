package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverStatusModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(WebDriverStatusModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        WebDriverStatusModify wds = new WebDriverStatusModify();
        wds.driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        wds.driver.manage().window().maximize();

        wds.personalDetailsCheck();
        wds.driver.quit();
    }

    void personalDetailsCheck() {
        //FirstName
        WebElement firstNameWebElement = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
        log.info("First Name is Displayed:{}", firstNameWebElement.isDisplayed());
        log.info("First Name is Enabled:{}", firstNameWebElement.isEnabled());

        //LastName
        WebElement lastNameWebElement = driver.findElement(By.id("LastName"));
        log.info("Last Name is Displayed:{}", lastNameWebElement.isDisplayed());
        log.info("Last Name is Enabled:{}", lastNameWebElement.isEnabled());

        //Email
        WebElement emailWebElement = driver.findElement(By.id("Email"));
        log.info("Email is Displayed:{}", emailWebElement.isDisplayed());
        log.info("Email is Enabled:{}", emailWebElement.isEnabled());

        //isSelected -> Male

        but.stopTheFlow(5);
        WebElement maleGenderElement = driver.findElement(By.id("gender-male"));
        log.info("Male Radio Button Selected:{}", maleGenderElement.isSelected());

        but.stopTheFlow(5);
        maleGenderElement.click();
        log.info("Male Radio Button Selected:{}", maleGenderElement.isSelected());

    }
}

