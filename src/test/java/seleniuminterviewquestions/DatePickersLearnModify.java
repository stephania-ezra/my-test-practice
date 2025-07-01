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

public class DatePickersLearnModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(BootStrapLearnModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        DatePickersLearnModify dplm = new DatePickersLearnModify();
        dplm.driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
        dplm.driver.manage().window().maximize();
        dplm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        dplm.checkMonthSelect();
        dplm.checkYearSelect();
        dplm.checkDaySelect();

        //dplm.driver.quit();
    }

    void checkMonthSelect() {

        //expected -> user wanted
        String userGivenMonth = "December";

        WebElement monthYearDropDownElement = driver.findElement(By.xpath("//input[@id='datetimepicker1']"));
        monthYearDropDownElement.click();

        //month
        WebElement monthDropDownElement = driver.findElement(By.
                xpath("/html/body/div[2]/div[1]/div/div/select"));

        Select monthDropDown = new Select(monthDropDownElement);
        List<WebElement> allOptions = monthDropDown.getOptions();

        for (WebElement option : allOptions) {
            String monthText = option.getText();
            if (monthText.equalsIgnoreCase(userGivenMonth)) {
                option.click();
                break;
            }
        }
    }

    void checkYearSelect() {

        String userGivenYear = "2024";
        WebElement yearElement = driver.findElement(By.
                xpath("/html/body/div[2]/div[1]/div/div/div/input"));

        String yearText = yearElement.getAttribute("value");
        log.info("Current year :{}", yearText);

        //string to int
        int userYearInt = Integer.parseInt(userGivenYear);
        int sysYearInt = Integer.parseInt(yearText);

        if (userYearInt == sysYearInt) {
            yearElement.click();
        } else if (userYearInt > sysYearInt) {
            WebElement dateUpArrow = driver.findElement(By.
                    xpath("(//span[@class='arrowUp'])[1]"));
            dateUpArrow.click();
        } else {
            WebElement dateDownArrow = driver.findElement(By.
                    xpath("/html/body/div[2]/div[1]/div/div/div/span[2]"));
            dateDownArrow.click();
        }
    }

    //date

    void checkDaySelect() {

        String userGivenDay = "25";
        List<WebElement> dayElements = driver.findElements(By.
                xpath("//div//span[@class='flatpickr-day']"));
        log.info("Day Elements Size:{}", dayElements.size());

        for (WebElement dayElement : dayElements) {
            String dayText = dayElement.getText();
            if (dayText.equalsIgnoreCase(userGivenDay)) {
                dayElement.click();
                break;
            }
        }
    }
}



