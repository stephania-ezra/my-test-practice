package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

public class UploadFileLearn {
    private final BaseUtilTest but = new BaseUtilTest();
    private final JavaScriptUtil jsu = new JavaScriptUtil();
    private final Logger log = LogManager.getLogger(UploadFileLearn.class);
    private final WebDriver driver = new ChromeDriver();

    public UploadFileLearn() throws AWTException {
    }

    public static void main(String[] args) throws AWTException {
        UploadFileLearn ufl = null;
        try {
            ufl = new UploadFileLearn();
        } catch (AWTException e) {
            throw new RuntimeException(e.getMessage());
        }
        //ufl.driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
        ufl.driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        ufl.driver.manage().window().maximize();
        ufl.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ufl.checkUploadOption1();
        ufl.checkUploadOption2();
        ufl.toolKiter();
        ufl.driver.quit();
    }

    void checkUploadOption1() {
        WebElement chooseFileElement = driver.findElement(By.xpath("//*[@id=\"picture\"]"));

        //here in input tag ,type attribute is file. so we can use sendKeys()

        chooseFileElement.sendKeys("//Users//stephania//Downloads//Gratitude-Journal.pdf");
        log.info("file name is displayed");
    }

    void checkUploadOption2() {
        WebElement chooseFileElement = driver.findElement(By.xpath("//*[@id=\"picture\"]"));
        jsu.clickElementByJS(chooseFileElement, driver);
    }

    /**
     * 1. copy the path
     * 2.Ctrl+ v
     * 3.Enter
     */
    void toolKiter() throws AWTException {

        Robot robot = new Robot();
        robot.delay(2000);

        //String filePath = "//Users//stephania//Downloads//Gratitude-Journal.pdf";

        //copy the file to clipboard (Similar to Ctr + c)
        StringSelection ss = new StringSelection("//Users//stephania//Downloads//Gratitude-Journal.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //ctrl + v
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(2000);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(2000);

        //press Enter key
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
