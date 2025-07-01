package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationDisableModify {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(NotificationDisableModify.class);

    public static void main(String[] args) {

        NotificationDisableModify nd = new NotificationDisableModify();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.redbus.in/");
        driver.quit();
    }
}
