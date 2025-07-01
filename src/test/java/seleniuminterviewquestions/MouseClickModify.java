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

public class MouseClickModify {

    private final WebDriver driver = new ChromeDriver();
    private final Logger log = LogManager.getLogger(MouseClickModify.class);
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        MouseClickModify mcm = new MouseClickModify();
        mcm.driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        mcm.driver.manage().window().maximize();
        mcm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mcm.rightClickOperation();
        // mcm.driver.quit();
    }

    void rightClickOperation() {
        WebElement rightClickElement = driver.findElement(By.
                xpath("/html/body/div/section/div/div/div/p/span"));

        Actions actions = new Actions(driver);
        actions.contextClick(rightClickElement).perform();
    }
}
