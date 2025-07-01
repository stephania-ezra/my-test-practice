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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitLearning {

    public static void main(String[] args) {

        Logger log = LogManager.getLogger(FluentWaitLearning.class);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/default.asp");
        driver.manage().window().maximize();

        //fluentwait declaration
        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);


        WebElement inputElement = driver.findElement(By.id("tnb-google-search-input"));
        inputElement.sendKeys("selenium");
        inputElement.sendKeys(Keys.RETURN);

        //By locator = By.
               // xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[6]/div[2]" +
                       // "/div/div/div[1]/div[1]/div/div[1]/div/a");

        //fluentwait implementation

        WebElement element=mywait.until(new Function<WebDriver,WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.
                        xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[6]/div[2]" +
                                "/div/div/div[1]/div[1]/div/div[1]/div/a"));
            }

        });

        log.info("Title of the Webpage is:{}", driver.getTitle());
        element.click();

        driver.quit();
    }
}
