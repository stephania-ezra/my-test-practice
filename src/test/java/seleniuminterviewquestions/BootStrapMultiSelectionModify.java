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

public class BootStrapMultiSelectionModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(BootStrapMultiSelectionModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        BootStrapMultiSelectionModify bsmsm = new BootStrapMultiSelectionModify();
        bsmsm.driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        bsmsm.driver.manage().window().maximize();
        bsmsm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        bsmsm.selectingCheckedBoxes();
        bsmsm.excludingHeaderOptions();
        bsmsm.unExpandingButton();

        //bsmsm.driver.quit();

    }

    void selectingCheckedBoxes() {
        WebElement buttonElement = driver.findElement(By.
                xpath("/html/body/div[3]/table/tbody/tr[2]/" +
                        "td[3]/div/span/div/button/span"));
        buttonElement.click();

        List<WebElement> multiSelectList = driver.findElements(By.
                xpath("//ul[@class='multiselect-container dropdown-menu']/li[@class='active']"));
    }

    void excludingHeaderOptions() {

        List<WebElement> optionsList = driver.findElements(By.
                xpath("//ul[@class='multiselect-container dropdown-menu']/li[not(contains(@class,'multiselect-group'))]"));
        log.info("Number of MultiSelect Options:{}", optionsList.size());

        for (WebElement option : optionsList) {
            String optionText = option.getText();
            log.info(optionText);

            //deselecting HTML and CSS checkbox ; selecting Bootstrap checkbox
            if (option.findElement(By.tagName("input")).isSelected() || optionText.equals("Bootstrap")) {
                option.click();
            }
        }
    }

    void unExpandingButton() {
        WebElement buttonElement = driver.findElement(By.
                xpath("/html/body/div[3]/table/tbody/tr[2]/" +
                        "td[3]/div/span/div/button/span"));
        if (Boolean.parseBoolean(buttonElement.getAttribute("aria-expanded"))) {
            buttonElement.click();
        }
    }
}


