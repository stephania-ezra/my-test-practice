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

/***
 * if u don't have a parent child div..
 * if u find  a header name , mark it as a group
 * add the elements to that group
 *
 * if u find another header mark it as header
 * add the following elements to that group ..
 */
public class RevisionBootStrapModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(RevisionBootStrapModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        RevisionBootStrapModify rbs = new RevisionBootStrapModify();
        rbs.driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        rbs.driver.manage().window().maximize();
        rbs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        rbs.checkGroupOptions();
        rbs.driver.quit();
    }

    void checkGroupOptions() {
        WebElement dropDownButtonElement = driver.findElement(By.
                xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button"));
        dropDownButtonElement.click();

        WebElement ulElement = driver.findElement(By.
                xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
        log.info("Number of Options:{}", liElements.size());

        WebElement groupElement = null;

        for (WebElement li : liElements) {
            String className = li.getAttribute("class");
            if (className.equalsIgnoreCase("multiselect-item multiselect-group")) {
                groupElement = li;
                log.info("Group Element is:{}", groupElement.getText());
                continue;
            }

            if (groupElement != null) {
                log.info("Group name {} -> {}", groupElement.getText(), li.getText());
            }
        }
    }
}
