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
import java.util.Objects;

public class DatePicker2 {
    private final WebDriver driver = new ChromeDriver();
    private final Logger log = LogManager.getLogger(DatePicker2.class);
//    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        DatePicker2 dp2 = new DatePicker2();
        dp2.driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        dp2.driver.manage().window().maximize();
        dp2.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement dateOfBirthElement = dp2.driver.findElement(By.xpath("//*[@id=\"dob\"]"));
        dateOfBirthElement.click();

        WebElement monthDropDownElement = dp2.driver.findElement(By.
                xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
        dp2.selectFromDropDown(monthDropDownElement, "Mar");

        WebElement yearDropDownElement = dp2.driver.findElement(By.
                xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
        dp2.selectFromDropDown(yearDropDownElement, "2018");

        WebElement tableElement = dp2.driver.findElement(By.
                xpath("//table[@class='ui-datepicker-calendar']"));
        WebElement tBodyElement = tableElement.findElement(By.tagName("tbody"));
        dp2.selectFromDate(tBodyElement, "21");
    }

    void selectFromDropDown(WebElement element, String value) {
        Select drp = new Select(element);
        List<WebElement> allOptions = drp.getOptions();

        for (WebElement option : allOptions) {
            if (option.getText().equals(value)) {
                option.click();
                break;
            }
        }
    }

    void selectFromDate(WebElement tBodyElement, String day) {
        //WebElement tableElement = dp2.driver.findElement(By.
        // xpath("//table[@class='ui-datepicker-calendar']"));

        //WebElement bodyElement = tableElement.findElement(By.tagName("tbody"));

        List<WebElement> rowsElement = tBodyElement.findElements(By.tagName("tr"));
        int rowCount = rowsElement.size();

        List<WebElement> dayElements = tBodyElement.findElements(By.tagName("td"));
        int dayCount = dayElements.size();

        for (WebElement dayElement : dayElements) {
            String dayText = dayElement.getText();
            log.info("days are:{}", dayText);

            if (day.equalsIgnoreCase(dayText)) {
                dayElement.click();
                break;
            }
        }

        log.info("Count is:{}", rowCount);
        log.info("Day count is:{}", dayCount);
    }
}


