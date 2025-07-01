package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewTabLearn {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(NewTabLearn.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        NewTabLearn ntl = new NewTabLearn();
        ntl.driver.get("https://www.jquery-az.com/");
        ntl.driver.manage().window().maximize();
        ntl.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ntl.checkNewTabLaunching();
        //ntl.driver.quit();
    }

    void checkNewTabLaunching() {

        String tab = Keys.chord(Keys.COMMAND, Keys.RETURN);

        WebElement aboutUsElement = driver.findElement(By.linkText("About Us"));
        aboutUsElement.sendKeys(tab);
    }
}
