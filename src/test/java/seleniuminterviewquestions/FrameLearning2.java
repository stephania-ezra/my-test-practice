package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLearning2 {

    public static void main(String[] args) {

        BaseUtilTest but = new BaseUtilTest();
        Logger log = LogManager.getLogger(FrameLearning2.class);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");
        WebElement outerFrameHeading = driver.findElement(By.xpath("/html/body/h2"));
        log.info("Outer Frame Heading is:{}", outerFrameHeading.getText());

        WebElement outerFrameSubHeading = driver.findElement(By.xpath("/html/body/p"));
        log.info(" Outer Frame sub-Heading is:{}", outerFrameSubHeading.getText());

        //switching to inner frame

        WebElement innerFrameElement = driver.findElement(By.xpath("/html/body/iframe"));
        driver.switchTo().frame(innerFrameElement);
        log.info("Successfully switched to Inner Frame");

        WebElement innerFrameText = driver.findElement(By.xpath("/html/body/h1"));
        log.info(" Inner Frame text is:{}", innerFrameText.getText());

        // go back to outerframe

        driver.quit();
    }
}

