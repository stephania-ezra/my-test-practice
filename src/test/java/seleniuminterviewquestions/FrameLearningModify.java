package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLearningModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(FrameLearningModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        FrameLearningModify fl = new FrameLearningModify();
        //driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        fl.driver.get("https://kitchen.applitools.com/ingredients/iframe");
        fl.driver.manage().window().maximize();

        fl.goToSameSiteFrame();
        fl.crossDomainFrame();
        //fl.driver.quit();
    }

    void goToSameSiteFrame() {

        driver.switchTo().frame("the-kitchen-table");
        WebElement nameHeaderElement = driver.findElement(By.xpath("//*[@id=\"column-button-name\"]"));
        nameHeaderElement.click();
        log.info("Name Column is sorted");

        but.stopTheFlow(3);
        WebElement typeHeaderElement = driver.findElement(By.xpath("//*[@id=\"column-button-type\"]"));
        typeHeaderElement.click();
        log.info("Type Column is sorted");

        but.stopTheFlow(3);
        WebElement flavorHeaderElement = driver.findElement(By.
                xpath("//*[@id=\"column-button-flavor\"]"));
        flavorHeaderElement.click();
        log.info("Flavor Column is sorted");
        driver.switchTo().defaultContent();

        but.scrollToFooter(driver);
    }

    void crossDomainFrame() {

        driver.switchTo().defaultContent();
        but.stopTheFlow(3);

        driver.switchTo().frame("youtube-table-cypress");
        WebElement crossDomainElement = driver.findElement(By.
                xpath("//*[@id=\"movie_player\"]/div[5]/div"));
        crossDomainElement.click();
        log.info("Verifying videos table video is played ha ha");
    }
}

