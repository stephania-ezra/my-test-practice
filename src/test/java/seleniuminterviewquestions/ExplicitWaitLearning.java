package seleniuminterviewquestions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitLearning {

    public static void main(String[] args) {

        // BaseUtilTest but = new BaseUtilTest();
        Logger log = LogManager.getLogger(ExplicitWaitLearning.class);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/default.asp");
        driver.manage().window().maximize();

        WebElement inputElement = driver.findElement(By.id("tnb-google-search-input"));
        inputElement.sendKeys("selenium");
        inputElement.sendKeys(Keys.RETURN);

       /* try {
            By locator = By.xpath("//*[@id=\"e1\"]/div[1]/a");

            waitForElementPresent(driver, locator, 10).click();
        } catch (Exception e) {
            log.info("Selenium Link not found:" + e.getMessage());
        }*/

        By locator = By.
                xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[6]/div[2]" +
                "/div/div/div[1]/div[1]/div/div[1]/div/a");
        log.info("Title of the Webpage is:{}", driver.getTitle());

        driver.quit();
    }

    public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return driver.findElement(locator);
    }
    //got timeout exception when tried first time
    //with schools website by selecting selenium link


}
