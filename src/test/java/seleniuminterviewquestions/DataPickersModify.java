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

public class DataPickersModify {

    private final WebDriver driver = new ChromeDriver();
    private final Logger log = LogManager.getLogger("DataPickersModify.class");
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        DataPickersModify dpm = new DataPickersModify();
        dpm.driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/\");");
        dpm.driver.manage().window().maximize();
        dpm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        dpm.but.scrollToMiddle(dpm.driver);

        dpm.selectMonth();
        dpm.selectYear();
        dpm.selectDay();
    }

    void selectMonth() {

        String userGivenMonth = "December";
        WebElement monthYearDropDownElement = driver.findElement(By.
                xpath("//*[@id=\"datetimepicker1\"]"));
        monthYearDropDownElement.click();

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

    void selectYear() {

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

    void selectDay() {

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

