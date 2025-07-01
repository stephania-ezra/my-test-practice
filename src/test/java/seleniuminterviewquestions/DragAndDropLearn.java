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
import java.util.List;

public class DragAndDropLearn {
    private final WebDriver driver = new ChromeDriver();
    private final Logger log = LogManager.getLogger(DragAndDropLearn.class);
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        DragAndDropLearn dadl = new DragAndDropLearn();
        dadl.driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        dadl.driver.manage().window().maximize();
        dadl.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        dadl.checkDragAndDrop();
        dadl.driver.quit();
    }

    void checkDragAndDrop() {


        WebElement frameElement = driver.findElement(By.
                xpath("//iframe[@class='demo-frame lazyloaded']"));

        driver.switchTo().frame(frameElement);

        WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));

        WebElement trashElement = driver.findElement(By.
                xpath("//*[@id=\"trash\"]"));

        Actions act = new Actions(driver);
        act.dragAndDrop(sourceElement, trashElement).perform();
    }
}


