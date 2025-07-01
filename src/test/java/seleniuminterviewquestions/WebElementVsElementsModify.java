package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementVsElementsModify {

    Logger log = LogManager.getLogger(WebElementVsElementsModify.class);
    WebDriver driver = new ChromeDriver();
    BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) throws InterruptedException {

        WebElementVsElementsModify weve = new WebElementVsElementsModify();

        weve.driver.manage().window().maximize();
        weve.driver.get("https://demo.nopcommerce.com/");

       /* WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        searchBox.sendKeys("XYZ");

        WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//li//a"));
        log.info(ele.getText());

        //NoSuchElement exception
       // WebElement searchBoxButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        //searchBoxButton.click();

        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        log.info("size of the list:{}", elementList.size());

        for (WebElement element: elementList){
           log.info(element.getText());
        }*/


        //logo
        /*WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        log.info(logo.getAccessibleName());

        List<WebElement> elementsList = driver.
                findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
        log.info("Number of Logo present:{}", elementsList.size());*/

       /* List<WebElement> elementsList = driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
        log.info(elementsList.size());
        log.info(elementsList.isEmpty());
        log.info("contains:{}", elementsList.contains(2));*/

        WebElement imageElement = weve.driver.findElement(By.
                xpath("(//img[@title='Show products in category Electronics'])[1]"));

        weve.log.info("size: {}", imageElement.getSize());
        weve.log.info("Location: {}", imageElement.getLocation());
        weve.log.info("Rectangular dimension: {}", imageElement.getRect());
        weve.log.info("Tag Name: {}", imageElement.getTagName());
        weve.log.info("text of image:{}", imageElement.getAttribute("title"));
        weve.driver.quit();
    }
}
