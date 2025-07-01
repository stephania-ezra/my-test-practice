package seleniuminterviewquestions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameLearning3 {

    public static void main(String[] args) {

        Logger log = LogManager.getLogger(FrameLearning3.class);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        // switch to outer iframe
        driver.switchTo().frame("iframeResult");

        //switch to inner iframe
        driver.switchTo().frame(0); // 0 - represents first inner iframe
        WebElement innerFrameText = driver.findElement(By.xpath("/html/body/h1"));
        log.info(" Inner Frame text is:{}", innerFrameText.getText());

        //switch to outer frame
        driver.switchTo().parentFrame(); //represents outer frame or parent frame ...
        WebElement outerFrameSubHeading = driver.findElement(By.xpath("/html/body/p"));
        log.info(" Outer Frame sub-Heading is:{}",outerFrameSubHeading.getText());

        driver.quit();
    }
}
