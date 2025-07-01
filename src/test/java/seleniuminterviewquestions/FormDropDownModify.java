package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FormDropDownModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(FormDropDownModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        FormDropDownModify fdd = new FormDropDownModify();

        fdd.driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_13");
        fdd.driver.manage().window().maximize();
        fdd.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement pleaseLoginButtonElement = fdd.driver.findElement(By.
                xpath("//*[@id=\"btnDropdownDemo\"]"));
        pleaseLoginButtonElement.click();

        //List<WebElement> allOptionsList = driver.findElements(By.className("form-group"));
        //log.info("Total number of options:" + allOptionsList.size());

        WebElement email = fdd.driver.findElement(By.id("emailDropdown"));
        email.sendKeys("123@gmail.com");

        WebElement password = fdd.driver.findElement(By.id("passwordDropdown"));
        password.sendKeys("09sdsd123");

        WebElement loginButton = fdd.driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/div/form/button"));
        loginButton.click();

        fdd.driver.quit();
    }
}
