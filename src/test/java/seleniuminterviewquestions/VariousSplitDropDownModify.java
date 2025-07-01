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

public class VariousSplitDropDownModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(VariousSplitDropDownModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        VariousSplitDropDownModify vsdd = new VariousSplitDropDownModify();
        vsdd.driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_10");
        vsdd.driver.manage().window().maximize();
        vsdd.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        vsdd.dropDownCheck();
        vsdd.driver.quit();
    }

    void dropDownCheck() {

        WebElement allTutorialsDropDownElement = driver.findElement(By.
                xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/div[1]/button[2]"));
        allTutorialsDropDownElement.click();

        List<WebElement> allOptionsList = driver.findElements(By.tagName("a"));
        log.info("Options count :{}", allOptionsList.size());

        for (WebElement option : allOptionsList) {
            log.info("Option Text is:{}", option.getText());
        }

        if (Boolean.parseBoolean(allTutorialsDropDownElement.getAttribute("aria-expanded"))) {
            allTutorialsDropDownElement.click();
        }
    }
}

