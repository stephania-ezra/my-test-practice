package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleDropDown {

    private final WebDriver driver = new ChromeDriver();
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(HandlingMultipleDropDown.class);


    public static void main(String[] args) throws InterruptedException {

        HandlingMultipleDropDown hmdd = new HandlingMultipleDropDown();

        hmdd.driver.manage().window().maximize();
        hmdd.driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");

        /*WebElement multiSelectDropdownElement = driver.findElement(By.id("demo-multiple-select-input"));
        Select multiSelectDropdown = new Select(multiSelectDropdownElement);

        WebElement selectOneDropdownElement = driver.findElement(By.id("inputGroupSelect03"));
        Select selectOneDropdown = new Select(selectOneDropdownElement);*/

        WebElement multiSelectDropdownElement = hmdd.driver.findElement(By
                .xpath("//*[@id='demo-multiple-select']"));
        hmdd.selectFromDropDown(multiSelectDropdownElement, "Books");

        WebElement selectOneDropdownElement = hmdd.driver.findElement(By.id("inputGroupSelect03"));
        hmdd.selectFromDropDown(selectOneDropdownElement, "Mrs");

        hmdd.driver.wait(1000);
        hmdd.driver.quit();
    }

    void selectFromDropDown(WebElement element, String value) {

        Select dropdown = new Select(element);
        List<WebElement> optionsList = dropdown.getOptions();

        for (WebElement option : optionsList) {
            if (option.getText().equals(value)) {
                option.click();
                break;
            }
        }
    }
}



