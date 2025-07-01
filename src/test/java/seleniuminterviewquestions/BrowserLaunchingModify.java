package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchingModify {

    private final Logger log = LogManager.getLogger(BrowserLaunchingModify.class);
    private final WebDriver driver = new ChromeDriver();
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        BrowserLaunchingModify blm = new BrowserLaunchingModify();

        blm.driver.get("https://demo.nopcommerce.com/");
        blm.driver.manage().window().maximize();

        blm.launchBrowserCheck();
        blm.driver.quit();
    }

    void launchBrowserCheck() {

        log.info("WebPage Title:{}", driver.getTitle());

        log.info("Web Page Source:{}", driver.getPageSource());

        log.info("Current URL of the Page:{}", driver.getCurrentUrl());
    }
}
