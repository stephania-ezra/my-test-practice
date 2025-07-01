package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class JavaScriptExecutorDemo {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(JavaScriptExecutorDemo.class);
    private final WebDriver driver = new ChromeDriver();
    private final JavaScriptUtil jsu = new JavaScriptUtil();

    public static void main(String[] args) throws IOException {
        JavaScriptExecutorDemo jsed = new JavaScriptExecutorDemo();
        jsed.driver.get("https://demo.nopcommerce.com/");
        //jsed.driver.get("https://jqueryui.com/tooltip/");
        jsed.driver.manage().window().maximize();
        jsed.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //jsed.drawBorderTakeScreenshot();
        //jsed.getPageTitle();
        // jsed.clickElement();
        //jsed.generateAlert();
        //jsed.refreshPage();
        //jsed.zoomPage();
        jsed.flashElement();
        //jsed.driver.quit();
    }

    void drawBorderTakeScreenshot() throws IOException {
        ////img[@alt='nopCommerce demo store']
        WebElement logoElement = driver.findElement(By.
                xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        jsu.drawBorder(logoElement, driver);

        File srcFile = logoElement.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile, new File("images//logo.png"));
        log.info("Logo Screenshot is captured by using JS");
    }

    void getPageTitle() {
        String title = jsu.getTitleByJS(driver);
        log.info("Title is displayed by using JS");
    }

    void clickElement() {
        WebElement registerElement = driver.findElement(By.
                xpath("//a[normalize-space()='Register']"));
        jsu.clickElementByJS(registerElement, driver);
        log.info("Click Action is performed by using JS");
    }
    //generate our own alert :)

    void generateAlert() {
        jsu.generateAlertByJS(driver, "Hakkuna Matata");
    }

    //refresh a page by JS
    void refreshPage() {
        but.stopTheFlow(5);
        jsu.refreshBrowserByJS(driver);
        log.info("Page is refreshed");
    }

    void zoomPage() {
        jsu.zoomPageByJS(driver);
    }

    void flashElement() {
        WebElement logoElement = driver.findElement(By.
                xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        jsu.flashByJS(logoElement, driver);
    }
}
