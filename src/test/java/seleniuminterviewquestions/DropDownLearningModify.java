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
import java.util.List;

public class DropDownLearningModify {

    private final Logger log = LogManager.getLogger(DropDownLearningModify.class);
    private final BaseUtilTest but = new BaseUtilTest();
    private WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        DropDownLearningModify ddlm = new DropDownLearningModify();
        ddlm.setDriver(ddlm.setup());
        Actions action = new Actions(ddlm.driver);
        WebElement body = ddlm.driver.findElement(By.tagName("body"));

        //Multi Selection dropdown
        ddlm.multiSelect();
        action.moveToElement(body).click().perform();
        ddlm.but.stopTheFlow(5);

        ddlm.multiSelectWithCascadeOption();

        ddlm.driver.quit();
    }

    WebDriver setup() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();

        return driver;
    }

    void multiSelect() {
        WebElement multiSelectionElement = driver.findElement(By.id("justAnInputBox"));
        multiSelectionElement.click();

        //selectChoiceValues(driver,"choice 2");
        //selectChoiceValues(driver,"choice 1","choice 2","choice 4");
        selectChoiceValues("All");

        multiSelectionElement.clear();
    }

    /**
     * Multi Selection With Cascade Option Select
     */
    void multiSelectWithCascadeOption() {
        WebElement multiSelectionWithCascadeOption = driver.findElement(By.id("justAnInputBox1"));
        multiSelectionWithCascadeOption.click();
    }

    void selectChoiceValues(String... values) {

        List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//        List<WebElement> choiceList = driver.findElements(By.tagName("li"));
        log.info("Size of choice List:{}", choiceList.size());

        for (WebElement choice : choiceList) {

//            WebElement inputElement = choice.findElement(By.tagName("input"));
            String text = choice.getText();
            for (String value : values) {
                if (text.equalsIgnoreCase(value) || value.equalsIgnoreCase("All")) {
//                    action.moveToElement(choice).click().perform();
                    choice.click();
                }
            }
        }
    }


    void others() {

        //Multi Selection With Cascade Option Select
//        WebElement multiSelectionWithCascadeOption = driver.findElement(By.id("justAnInputBox1"));
//        multiSelectionWithCascadeOption.click();
//
//        //selectChoiceValues(driver,"choice 1");
//        //selectChoiceValues(driver,"choice 1","choice 4","choice 5","choice 7");
//        selectChoiceValues(driver,"All");
//        but.stopTheFlow(5);
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}


