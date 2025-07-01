package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestionModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(AutoSuggestionModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        AutoSuggestionModify asm = new AutoSuggestionModify();

        asm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        asm.driver.manage().window().maximize();

        asm.driver.get("https://www.google.co.in/?gws_rd=cr");

        asm.checkAutoSuggestion();
        asm.driver.quit();
    }

    void checkAutoSuggestion() {

        WebElement searchElement = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        searchElement.sendKeys("java tutorial");

        List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//b"));

        log.info(list.size());
        for (WebElement element : list) {
            if (element.getText().contains("beginners")) {
                element.click();
                break;
            }
        }
    }
}
