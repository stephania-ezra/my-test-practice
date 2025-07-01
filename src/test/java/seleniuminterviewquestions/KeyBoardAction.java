package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardAction {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(KeyBoardAction.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        KeyBoardAction ka = new KeyBoardAction();
        ka.driver.get("https://the-internet.herokuapp.com/key_presses");
        ka.driver.manage().window().maximize();
        ka.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ka.checkKeyBoardAction();
        ka.but.stopTheFlow(5);
        // ka.driver.quit();
    }

    void checkKeyBoardAction() {

        Actions act = new Actions(driver);
        act.sendKeys(Keys.RETURN).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.ARROW_LEFT).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.ARROW_RIGHT).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.BACK_SPACE).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.ENTER).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.ESCAPE).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.COMMAND).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.DELETE).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.TAB).perform();
        but.stopTheFlow(5);
        act.sendKeys(Keys.SPACE).perform();
    }
}
