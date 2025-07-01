package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementVsElementsModify {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(ElementVsElementsModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        ElementVsElementsModify evem = new ElementVsElementsModify();
        evem.driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        evem.driver.manage().window().maximize();

        evem.locatingOneElement();
        evem.locatingMultipleElements();
    }

    void locatingOneElement() {

        WebElement searchElement = driver.findElement(By.id("small-searchterms"));
        log.info("Search Button is Displayed:{}", searchElement.isDisplayed());
        log.info("Search Button is Enabled:{}", searchElement.isEnabled());
        searchElement.sendKeys("Testing");
    }

    void locatingMultipleElements() {

        WebElement footerElement = driver.findElement(By.xpath("//div[@class='footer-block information']//li"));
        log.info("Footer:{}", footerElement.getText());

        List<WebElement> footerList = driver.findElements(By.
                xpath("//div[@class='footer-block information']//li"));
        log.info("Total number of Footer items:{}", footerList.size());

        for (WebElement footer : footerList) {
            log.info("Footer Element is:{}", footer.getText());
            log.info("Footer is displayed:{}", footer.isDisplayed());
        }
    }

    void customerService() {

        but.scrollToMiddle(driver);
        List<WebElement> customerServiceList = driver.findElements(By.
                xpath("//div[@class='footer-block customer-service']//li//a"));
        log.info("Total number of customerServiceList items:{}", customerServiceList.size());

        for (WebElement customerService : customerServiceList) {
            log.info("customerService Element is:{}", customerService.getText());
        }
    }

    void myAccount() {
        List<WebElement> myAccountList = driver.findElements(By.
                xpath("//div[@class='footer-block my-account']//li//a"));
        log.info("Total number of Footer:{}", myAccountList.size());

        for (WebElement myAccount : myAccountList) {
            log.info("myAccount Element is:{}", myAccount.getText());
        }

    }

    void logoDetails() {

        WebElement logoElement = driver.findElement(By.partialLinkText("nopCommerce"));
        log.info("Logo Displayed:{}", logoElement.isDisplayed());
        log.info("Text of the Logo:{}", logoElement.getText());
        log.info("Location of logo is:{}", logoElement.getLocation());
        log.info("Size of Logo is:{}", logoElement.getSize());


        List<WebElement> logoList = driver.findElements(By.partialLinkText("nopCommerce"));
        log.info("Number of elements in Logo list:{}", logoList.size());

        for (WebElement logo : logoList) {
            log.info("Logo details:{}", logo.getText());
        }
    }

    void logoImageDetails() {

        WebElement imgElement = driver.findElement(By.xpath("//img[contains(title,'dinosaur')]"));
        log.info("Image Element text is{}", imgElement.getText());

        List<WebElement> imageElementList = driver.
                findElements(By.xpath("//img[contains(title,'dinosaur')]"));
        log.info("Image element count:{}", imageElementList.size());
    }
}

