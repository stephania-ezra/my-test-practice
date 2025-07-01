package seleniuminterviewquestions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {

    public static void main(String[] args) {
        Logger log = LogManager.getLogger(GetTextVsGetAttribute.class);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://admin-demo.nopcommerce.com/login?returnUrl=%2Flogin");

        /*WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.clear();
        email.sendKeys("XYZ@gmail.com");

        log.info("value is :{}", email.getAttribute("value"));
        log.info("Text is:{}", email.getText());

        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        log.info("Text is :{}", loginButton.getText());
        log.info("type is :{}", loginButton.getAttribute("type"));
        log.info("Class is :{}", loginButton.getAttribute("class"));
        log.info("xpath is :{}", loginButton.getAttribute("xpath"));*/


        WebElement titleElement = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        log.info("Title of the Login Page :{}", titleElement.getText());

        driver.quit();
    }
}
