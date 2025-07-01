package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(DatePickers1.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        RightClickModify rcm = new RightClickModify();
        rcm.driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        rcm.driver.manage().window().maximize();
        rcm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        rcm.checkRightClick();
        rcm.driver.quit();
    }

    void checkRightClick() {

        WebElement rightClickButton = driver.findElement(By.
                xpath("/html/body/div/section/div/div/div/p/span"));
        Actions act = new Actions(driver);
        act.contextClick(rightClickButton).perform();
    }
}
