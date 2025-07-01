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

public class DropDownLearnModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(DropDownLearnModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        DropDownLearnModify ddlm = new DropDownLearnModify();
        ddlm.driver.get("https://www.opencart.com/index.php?route=account/register");
        ddlm.driver.manage().window().maximize();
        ddlm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ddlm.countrySelection();

        //ddlm.driver.quit();

    }

    void countrySelection() {
        WebElement countryDropDownElement = driver.findElement(By.id("input-country"));
        Select countryDropDown = new Select(countryDropDownElement);
        //countryDropDown.selectByValue("13");
        //countryDropDown.selectByIndex(14);
        //countryDropDown.selectByVisibleText("Congo");

        List<WebElement> countryList = countryDropDown.getOptions();
        log.info("Country count is:{}", countryList.size());

        for (WebElement country : countryList) {
            if (country.getText().equalsIgnoreCase("Congo")) {
                country.click();
                break;
            }
        }
    }
}
