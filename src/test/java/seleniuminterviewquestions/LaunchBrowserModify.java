package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserModify {

    Logger log = LogManager.getLogger(LaunchBrowserModify.class);
    WebDriver driver = new ChromeDriver();
    BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        LaunchBrowserModify lb = new LaunchBrowserModify();
        lb.driver.manage().window().maximize();

        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();
        lb.driver.get("https://demo.nopcommerce.com/");

        lb.log.info("Title is :{}", lb.driver.getTitle());
        lb.log.info("URL is :{}", lb.driver.getCurrentUrl());
        lb.log.info("Page Source is :{}", lb.driver.getPageSource());

        lb.driver.quit();
    }
}
