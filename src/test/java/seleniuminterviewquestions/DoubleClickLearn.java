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

public class DoubleClickLearn {

    private final BaseUtilTest but = new BaseUtilTest();
    private final WebDriver driver = new ChromeDriver();
    private final Logger log = LogManager.getLogger(DoubleClickLearn.class);

    public static void main(String[] args) {

        DoubleClickLearn dcl = new DoubleClickLearn();
        dcl.driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        //dcl.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dcl.driver.manage().window().maximize();
        //dcl.but.stopTheFlow(5);

        dcl.checkDoubleClickOperation();
        //dcl.driver.quit();
    }

    void checkDoubleClickOperation() {

        driver.switchTo().frame("iframeResult");

        WebElement field1Element = driver.findElement(By.xpath("//*[@id=\"field1\"]"));
        field1Element.clear();
        field1Element.sendKeys("I Love Coding");

        WebElement buttonElement = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        Actions act = new Actions(driver);
        act.doubleClick(buttonElement).perform();

        WebElement field2Element = driver.findElement(By.xpath("//*[@id=\"field2\"]"));
        String field2Text = field2Element.getText();

        if (field1Element.getText().equalsIgnoreCase(field2Text)) {
            log.info("Field1 text copied to Field2 successfully");
        }
    }
}


