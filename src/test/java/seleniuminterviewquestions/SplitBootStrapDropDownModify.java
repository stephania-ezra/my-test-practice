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

public class SplitBootStrapDropDownModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(SplitBootStrapDropDownModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        SplitBootStrapDropDownModify sbsdd = new SplitBootStrapDropDownModify();
        sbsdd.driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_9");
        sbsdd.driver.manage().window().maximize();
        sbsdd.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        sbsdd.checkAllTutorials();
    }

    void checkAllTutorials() {
        WebElement allTutorialsElement = driver.findElement(By.
                xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/div[1]/button[1]"));

        allTutorialsElement.click();

        List<WebElement> allOptionsList = driver.findElements(By.tagName("a"));
        log.info("Options Count:{}", allOptionsList.size());

        for (WebElement option : allOptionsList) {
            log.info("Option Details:{}", option.getText());
        }

        but.stopTheFlow(5);
        if (Boolean.parseBoolean(allTutorialsElement.getAttribute("aria-expanded"))) {
            allTutorialsElement.click();
        }
        but.stopTheFlow(5);
    }
}
