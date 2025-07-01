package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardActionMultipleKeys {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(KeyBoardActionMultipleKeys.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        KeyBoardActionMultipleKeys kbamk = new KeyBoardActionMultipleKeys();
        kbamk.driver.get("https://text-compare.com/");
        kbamk.driver.manage().window().maximize();
        kbamk.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        kbamk.checkMultipleKeyBoardAction();
        //kbamk.driver.quit();
    }

    void checkMultipleKeyBoardAction() {

        WebElement textBox1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        textBox1.sendKeys("I am Gorgeous ha ha ha");


        WebElement textBox2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        Actions act = new Actions(driver);

        //command a
        act.keyDown(Keys.COMMAND);
        act.sendKeys("a");
        act.keyUp(Keys.COMMAND);
        act.perform();

        //command c
        act.keyDown(Keys.COMMAND);
        act.sendKeys("c");
        act.keyUp(Keys.COMMAND);
        act.perform();

        //tab
        act.sendKeys(Keys.TAB).perform();

        //command v
        act.keyDown(Keys.COMMAND);
        act.sendKeys("v");
        act.keyUp(Keys.COMMAND);
        act.perform();

        //compare texts

        if (textBox1.getAttribute("value").equalsIgnoreCase(textBox2.getAttribute("value"))){
            log.info("Both the text are same, copied");
        } else {
            log.info("Text not copied");
        }
    }
}
