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

public class DropDownLearning10Modify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(DropDownLearning10Modify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        DropDownLearning10Modify ddl10 = new DropDownLearning10Modify();
        ddl10.driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        ddl10.driver.manage().window().maximize();

       /* WebElement stateDropDownElement = driver.findElement(By.id("state"));
        Select stateDropDown = new Select(stateDropDownElement);

        List<WebElement> stateList = stateDropDown.getOptions();
        log.info("No.of State :{}", stateList.size());

        for(WebElement state :stateList){
            if(state.getText().equals("Haryana")){
                state.click();
                break;
            }
        }*/

        WebElement stateDropDownElement = ddl10.driver.findElement(By.id("state"));
        ddl10.selectFromDropDown(stateDropDownElement,"Rajasthan");

        WebElement cityDropDownWebElement = ddl10.driver.findElement(By.id("city"));
        ddl10.selectFromDropDown(cityDropDownWebElement,"Meerut");

        /*WebElement cityDropDownWebElement = driver.findElement(By.id("city"));
        Select cityDropDown = new Select(cityDropDownWebElement);

        List<WebElement> cityList = cityDropDown.getOptions();
        log.info("No.of City:{}", cityList.size());

        for(WebElement city :cityList ){
            if(city.getText().equals("Lucknow")){
                city.click();
                break;
            }
        }*/

    }

    void selectFromDropDown(WebElement element , String value){
        Select drp = new Select(element);
        List<WebElement> allOptions = drp.getOptions();

        for(WebElement option :allOptions ){
            if(option.getText().equals(value)){
                option.click();
                break;
            }
        }
    }
}
