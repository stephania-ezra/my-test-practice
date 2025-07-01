package seleniuminterviewquestions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitLearning {

    public static void main(String[] args) {
        Logger log = LogManager.getLogger(ImplicitWaitLearning.class);
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.wikipedia.org/");
        driver.get("https://www.google.co.in/?gws_rd=cr");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement searchElement = driver.findElement(By.id("APjFqb"));
        searchElement.sendKeys("selenium");
        searchElement.sendKeys(Keys.RETURN);

        log.info("Title of the page is:{}", driver.getTitle());

        WebElement seleniumDevLinkElement = driver.findElement(By.partialLinkText("selenium"));
        seleniumDevLinkElement.click();
        log.info("Selenium Dev page launched successfully");
        log.info("Title of the page is:{}", driver.getTitle());

        driver.quit();
    }
}
