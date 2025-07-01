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

public class MouseHoover {

    private final BaseUtilTest but = new BaseUtilTest();
    private final WebDriver driver = new ChromeDriver();
    private final Logger log = LogManager.getLogger(MouseHoover.class);

    public static void main(String[] args) {
        MouseHoover mh = new MouseHoover();
        mh.driver.get("https://www.jquery-az.com/");
        mh.driver.manage().window().maximize();
        mh.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mh.checkMouseHoover();
        mh.driver.quit();
    }

    void checkMouseHoover() {

        WebElement programmingElement = driver.findElement(By.
                xpath("//*[@id=\"navbarCollapse\"]/div[1]/div[1]/a"));

        WebElement vbaElement = driver.findElement(By.
                xpath("//a[normalize-space()='VBA']"));

        Actions act = new Actions(driver);
        act.moveToElement(programmingElement).moveToElement(vbaElement).click().perform();
    }
}
