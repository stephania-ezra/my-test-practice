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

public class BootStrapAssignmentModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(BootStrapAssignmentModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        BootStrapAssignmentModify bsam = new BootStrapAssignmentModify();

        bsam.driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        bsam.driver.manage().window().maximize();
        bsam.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        bsam.checkDeselectedOptions();
        bsam.checkThreeDropDown();
        bsam.checkTotalNumberOfOptions();
        bsam.printingOptionInSpecificGroup();
        bsam.printSelectedOption();
        bsam.selectingAllDropDown();
        bsam.totalSelectedOption();

        // bsam.driver.quit();
    }

    void checkDeselectedOptions() {

        //1. Deselect the selected dropdown options
        WebElement dropDownElement = driver.findElement(By.
                xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button"));
        dropDownElement.click();

        //Deselecting HTML , CSS options
        List<WebElement> allOptions = driver.findElements(By.
                xpath("//ul[@class = 'multiselect-container dropdown-menu']" +
                        "/li[not(contains(@class,'multiselect-group'))]"));

    }

    void checkTotalNumberOfOptions() {

        List<WebElement> allOptions = driver.findElements(By.
                xpath("//ul[@class = 'multiselect-container dropdown-menu']" +
                        "/li[not(contains(@class,'multiselect-group'))]"));

        log.info("Total DropDown Options are :{}", allOptions.size());

        int selectedCount = 0;
        for (WebElement option : allOptions) {
            if (option.findElement(By.tagName("input")).isSelected()) {
                log.info("Displaying Selected DropDown Options:{}", option.getText());
                option.click();
                log.info("Deselected the selected dropdown options");
            }
        }
    }

    void checkThreeDropDown() {

        List<WebElement> allOptions = driver.findElements(By.
                xpath("//ul[@class = 'multiselect-container dropdown-menu']" +
                        "/li[not(contains(@class,'multiselect-group'))]"));

        for (WebElement option : allOptions) {

            if (option.findElement(By.tagName("input")).isSelected()) {
                log.info("Displayed Selected DropDown Options:{}", option.getText());
                option.click();
                log.info("Deselect the selected dropdown options");
            }
            String optionText = option.getText();
            if (optionText.equals("Python") || optionText.equals("Oracle") || optionText.equals("jQuery")) {
                option.click();
            }
        }
    }

    void selectingAllDropDown() {

        List<WebElement> allOptions = driver.findElements(By.
                xpath("//ul[@class = 'multiselect-container dropdown-menu']" +
                        "/li[not(contains(@class,'multiselect-group'))]"));
        for (WebElement option : allOptions) {
            if (!(option.getText().equals("CSS") || option.getText().equals("HTML"))) {
                option.click();
            }
        }
        log.info("All DropDown Options are selected");

    }

    void printSelectedOption() {
        List<WebElement> allOptions = driver.findElements(By.
                xpath("//ul[@class = 'multiselect-container dropdown-menu']" +
                        "/li[not(contains(@class,'multiselect-group'))]"));

        for (WebElement option : allOptions) {
            if (!(option.getText().equals("CSS") || option.getText().equals("HTML"))) {
                option.click();
                log.info("Displaying DropDown Options:{}", option.getText());
            }
        }
    }

    void totalSelectedOption() {

        int selectedCount = 0;
        List<WebElement> allOptions = driver.findElements(By.
                xpath("//ul[@class = 'multiselect-container dropdown-menu']" +
                        "/li[not(contains(@class,'multiselect-group'))]"));
        for (WebElement option : allOptions) {
            if (option.findElement(By.tagName("input")).isSelected()) {
                log.info("Display Selected DropDown Options:{}", option.getText());
                selectedCount++;
            }
        }

        log.info("Total number of selected options is:{}", selectedCount);
    }

    void printingOptionInSpecificGroup() {

        WebElement ulElement = driver.findElement(By.xpath("/html/body/div[3]" +
                "/table/tbody/tr[2]/td[3]/div/span/div/ul"));

        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
        log.info("liElements number:{}", liElements.size());
        WebElement groupElement = null;

        for (WebElement li : liElements) {
            String className = li.getAttribute("class");

            if (className.equalsIgnoreCase("multiselect-item multiselect-group")) {
                groupElement = li;
                log.info("Group name {}", groupElement.getText());
                continue;
            }

            if (groupElement != null)
                log.info("Group name {} -> {}", groupElement.getText(), li.getText());
        }
    }
}


