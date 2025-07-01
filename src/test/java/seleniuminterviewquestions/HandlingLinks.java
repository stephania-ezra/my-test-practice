package seleniuminterviewquestions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingLinks {

    public static void main(String[] args) {

        Logger log = LogManager.getLogger(HandlingLinks.class);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //using linkText() method
       /* WebElement booksElement = driver.findElement(By.linkText("OrangeHRM, Inc"));
        booksElement.click();*/

        //by writing partial linkText
       /* WebElement booksElement = driver.findElement(By.partialLinkText("OrangeHRM"));
        booksElement.click();
        log.info("Orange HRM window is launched");*/

        List<WebElement> links = driver.findElements(By.tagName("a"));
        log.info("Total number of links:{}", links.size());

        /*for (int i =0 ; i<links.size();i++){
            log.info("Text of the Link :{}", links.get(i).getText());
            log.info("href of the link:{}", links.get(i).getAttribute("href"));
        }*/

        for (WebElement link : links){
            log.info(link.getText());
            log.info(link.getAttribute("href"));
        }
        //driver.quit();
    }
}
