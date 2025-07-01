package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownHandlingModify {

    private final Logger log = LogManager.getLogger(DropDownHandlingModify.class);
    private final WebDriver driver = new ChromeDriver();
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) throws InterruptedException {

        DropDownHandlingModify ddhm = new DropDownHandlingModify();
        ddhm.driver.manage().window().maximize();
        ddhm.driver.get("https://demo.nopcommerce.com/register");
        ddhm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ddhm.normalSelectCommands();
        ddhm.withoutSelectMethods();

    }

    void normalSelectCommands() {

        WebElement currencyDropDownElement = driver.findElement(By.id("customerCurrency"));
        Select currencyDropDown = new Select(currencyDropDownElement);

        //currencyDropDown.selectByVisibleText("Euro");
        //currencyDropDown.selectByValue("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2Fregister");
        //currencyDropDown.selectByIndex(1);
    }

    //Select options from dropdown without using select methods
    void withoutSelectMethods() {

        WebElement currencyDropDownElement = driver.findElement(By.id("customerCurrency"));
        Select currencyDropDown = new Select(currencyDropDownElement);
        List<WebElement> optionsList = currencyDropDown.getOptions();

        log.info("size of the list is :{}", optionsList.size());

        for (WebElement option : optionsList) {
            log.info("Options are :{}", option.getText());
            if (option.getText().equals("US Dollar")) {
                option.click();
                break;
            }
        }
    }

}
