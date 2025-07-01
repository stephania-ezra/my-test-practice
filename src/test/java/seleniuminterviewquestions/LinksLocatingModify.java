package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksLocatingModify {

    private final Logger log = LogManager.getLogger(LinksLocatingModify.class);
    private final WebDriver driver = new ChromeDriver();
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        LinksLocatingModify ll = new LinksLocatingModify();
        ll.driver.get("https://www.geeksforgeeks.org/");
        ll.driver.manage().window().maximize();
        ll.checkWebDevelopmentLink();
        ll.displayAllLinks();

    }

    void checkWebDevelopmentLink() {
        //linkText()
        /*WebElement categoriesElement = driver.findElement(By.linkText("Web Development"));
        categoriesElement.click();*/

        //partialLinkText()
        WebElement webDevelopmentElement = driver.findElement(By.partialLinkText("Web"));
        webDevelopmentElement.click();

        log.info("Web Development Link is clicked");
    }

    void displayAllLinks() {
        // Getting all links in a page

        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        log.info("Total number of Links:{}", linksList.size());

        log.info("***Displaying the Links****");
        for (WebElement link : linksList) {
            log.info("href of the link is:{}", link.getAttribute("href"));
            log.info("Text of the Link is{}", link.getText());
        }
    }
}
