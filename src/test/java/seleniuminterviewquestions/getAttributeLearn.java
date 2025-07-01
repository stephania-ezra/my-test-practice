package seleniuminterviewquestions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeLearn {

    public static void main(String[] args) {
        Logger log = LogManager.getLogger(getAttributeLearn.class);
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?returnUrl=%2Flogin");
        driver.manage().window().maximize();

        WebElement emailElement = driver.findElement(By.id("Email"));
        log.info("Email available is :{}", emailElement.getAttribute("value"));

        emailElement.clear();
        log.info("Email is cleared");

        emailElement.sendKeys("abc@gmail.com");

        WebElement loginButtonElement = driver.findElement(By.
                xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button"));

        log.info("type is:{}", loginButtonElement.getAttribute("type"));
        log.info("Class is:{}", loginButtonElement.getAttribute("class"));
        log.info("Login Text is:{}", loginButtonElement.getText());

        //driver.quit();
    }
}
