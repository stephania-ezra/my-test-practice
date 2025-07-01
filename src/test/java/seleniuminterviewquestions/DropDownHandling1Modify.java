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

public class DropDownHandling1Modify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(DropDownHandling1Modify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        DropDownHandling1Modify ddh1m = new DropDownHandling1Modify();

        ddh1m.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ddh1m.driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        ddh1m.driver.manage().window().maximize();

        ddh1m.selectChoiceValues(ddh1m.driver, "choice 3");

        ddh1m.selectChoiceValues(ddh1m.driver, "choice 3", "choice 4", "choice 5");

        ddh1m.selectChoiceValues(ddh1m.driver, "choice 1", "choice 2 1", "choice 2 2",
                "choice 2 3", "choice 3", "choice 4", "choice 5", "choice 6", "choice 6 1",
                "choice 6 2", "choice 6 2 1", "choice 6 2 2", "choice 6 2 3", "choice 7");
    }

    void selectChoiceValues(WebDriver driver, String... value) {

        WebElement multiSelectInputElement = driver.findElement(By.id("justAnInputBox"));
        multiSelectInputElement.click();

        List<WebElement> choiceList = driver.findElements(By.
                xpath("//span[@class='comboTreeItemTitle']"));

        log.info("size is:{}", choiceList.size());

        if (!value[0].equalsIgnoreCase("all")) {
            for (WebElement choice : choiceList) {
                String text = choice.getText();
                for (String val : value) {
                    if (text.equals(val)) {
                        choice.click();
                    }
                }
            }
        } else {
            for (WebElement choice : choiceList) {
                choice.click();
            }
        }
    }
}
        /*WebElement multiSelectDropdownElement = driver.findElement(By
                .xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div"));
        Select select = new Select(multiSelectDropdownElement);*/


