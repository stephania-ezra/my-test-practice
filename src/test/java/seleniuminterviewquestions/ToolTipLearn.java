package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ToolTipLearn {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger("ToolTipLearn.class");
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        ToolTipLearn ttl = new ToolTipLearn();
        ttl.driver.get("https://jqueryui.com/tooltip/");
        ttl.driver.manage().window().maximize();
        ttl.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ttl.checkToolTip();
        //ttl.driver.quit();
    }

    void checkToolTip() {

        WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frameElement);

        WebElement yourAgeElement = driver.findElement(By.xpath("//input[@id='age']"));

        String title = yourAgeElement.getAttribute("title");
        log.info("Tooltip is:{}", title);
    }
}
