package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Month;
import java.util.Date;
import java.util.List;

public class DatePickers1 {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(DatePickers1.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        DatePickers1 dp1 = new DatePickers1();
        dp1.driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        dp1.driver.manage().window().maximize();
        dp1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        dp1.monthSelect();
        dp1.daySelect();
        dp1.yearSelect();

        dp1.driver.quit();
    }

    void monthSelect() {

        WebElement dateOfBirthElement = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
        dateOfBirthElement.click();

        WebElement monthDropDownElement = driver.findElement(By.
                xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));

        Select monthDropDown = new Select(monthDropDownElement);
        List<WebElement> allOptions = monthDropDown.getOptions();
        log.info("Months count are:{}", allOptions.size());

        for (WebElement option : allOptions) {
            if (option.getText().equals("May")) {
                option.click();
                break;
            }
        }
    }

    void yearSelect() {
        WebElement yearDropDownElement = driver.findElement(By.
                xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
        Select yearDropDown = new Select(yearDropDownElement);
        List<WebElement> yearOptions = yearDropDown.getOptions();
        log.info("Year count are:{}", yearOptions.size());

        for (WebElement year : yearOptions) {
            if (year.getText().equals("2025")) {
                year.click();
            }
        }
    }

    void daySelect() {
        String day = "21";
        List<WebElement> rowsDateElement = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
        log.info(rowsDateElement.size());

        for (WebElement rowsDate : rowsDateElement) {
            if (rowsDate.getText().equals(day)) {
                rowsDate.click();
            }
        }
    }
       /* but.stopTheFlow(5);
        //date

        WebElement tableElement = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));

        WebElement bodyElement = tableElement.findElement(By.tagName("tbody"));
        //driver.switchTo().frame(0);
        try {
            List<WebElement> rowsElement = bodyElement.findElements(By.tagName("tr"));
            log.info("number of rows:{}", rowsElement.size());

        } catch (Exception e) {
            log.info("Stale Element Exception:{}", e.getMessage());
        }*/
}


