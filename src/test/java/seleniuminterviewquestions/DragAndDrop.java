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

public class DragAndDrop {

    private final BaseUtilTest but = new BaseUtilTest();
    private final WebDriver driver = new ChromeDriver();
    private final Logger log = LogManager.getLogger(DragAndDrop.class);

    public static void main(String[] args) {

        DragAndDrop dad = new DragAndDrop();
        dad.driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        dad.driver.manage().window().maximize();
        dad.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        dad.checkDragAndDrop();
        //dad.driver.quit();
    }

    void checkDragAndDrop() {

        // WebElement madridElement = driver.findElement(By.id("box7"));//source
        WebElement seoulElement = driver.findElement(By.xpath("//div[@id='box5']"));
        log.info(seoulElement.getSize());
        log.info(seoulElement.getLocation());


        WebElement southKoreaElement = driver.findElement(By.
                xpath("//div[@id='countries']//div[@id='box105']"));
        log.info(southKoreaElement.getSize());
        log.info(southKoreaElement.getLocation());

        //WebElement uSElement = driver.findElement(By.id("box103"));//target

        Actions act = new Actions(driver);
        act.dragAndDrop(seoulElement, southKoreaElement).perform();

        //log.info("{} moved to {}", madridElement.getText(), uSElement.getText());
    }
}


