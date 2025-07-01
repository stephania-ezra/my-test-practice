package seleniuminterviewquestions;


import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementStatusModify {

    private final Logger log = LogManager.getLogger(WebElementStatusModify.class);
    private final WebDriver driver = new ChromeDriver();
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        WebElementStatusModify wes = new WebElementStatusModify();

        wes.driver.manage().window().maximize();
        wes.driver.get("https://demo.nopcommerce.com/register");

        wes.radioButtonCheck();
        wes.driver.quit();

    }

    void radioButtonCheck() {

        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        log.info("SearchStore Field is Displayed:{}", searchStore.isDisplayed());
        log.info("SearchStore Field is Displayed:{}", searchStore.isEnabled());

        WebElement maleGender = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement femaleGender = driver.findElement(By.xpath("//input[@id='gender-female']"));

        log.info("Male Gender is selected:{}", maleGender.isSelected());
        log.info("Female Gender is selected:{}", femaleGender.isSelected());

        maleGender.click();
        log.info("Male Gender is selected:{}", maleGender.isSelected());
    }
}
