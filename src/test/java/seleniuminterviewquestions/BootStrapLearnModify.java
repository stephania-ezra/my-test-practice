package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Single Selection dropdown
 */
public class BootStrapLearnModify {

    private final Logger log = LogManager.getLogger(BootStrapLearnModify.class);
    private final WebDriver driver = new ChromeDriver();
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        BootStrapLearnModify bsl = new BootStrapLearnModify();
        bsl.driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_6");
        bsl.driver.manage().window().maximize();

        bsl.checkTutorialOptions();
        bsl.driver.quit();
    }

    void checkTutorialOptions() {
        WebElement allTutorialsElement = driver.findElement(By.
                xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/div/button[2]"));
        allTutorialsElement.click();

        List<WebElement> allOptions = driver.findElements(By.
                xpath("//div[@class='dropdown-menu show']/a"));

        log.info("No.of Options:{}", allOptions.size());

        for (WebElement options : allOptions) {
            String text = options.getText();
            if (text.equals("jQuery") || (text.equals("HTML")) || (text.equals("CSS")) || (text.equals("Bootstrap 4"))) {
                options.click();
                break;
            }
        }
    }
}
