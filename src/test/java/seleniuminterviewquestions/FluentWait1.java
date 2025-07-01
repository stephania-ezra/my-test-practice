package seleniuminterviewquestions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait1 {

    private final Logger log = LogManager.getLogger(FluentWait1.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        FluentWait1 fw1 = new FluentWait1();
        fw1.driver.get("https://www.w3schools.com/html/default.asp");
        fw1.driver.manage().window().maximize();

        WebElement inputElement = fw1.driver.findElement(By.id("tnb-google-search-input"));
        inputElement.sendKeys("selenium");
        inputElement.sendKeys(Keys.RETURN);

        By elementLoc = By.xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[6]/div[2]" +
                "/div/div/div[1]/div[1]/div/div[1]/div/a");
        waitForElementWithFluentWait(fw1.driver, elementLoc);

        fw1.log.info("Title of the Webpage is:{}", fw1.driver.getTitle());

    }

    public static WebElement waitForElementWithFluentWait(WebDriver driver, By locator) {
        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement element = mywait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }
}


