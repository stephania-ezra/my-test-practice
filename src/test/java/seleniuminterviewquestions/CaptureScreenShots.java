package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class CaptureScreenShots {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(CaptureScreenShots.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {

        CaptureScreenShots ssc = new CaptureScreenShots();
        ssc.driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
        ssc.driver.manage().window().maximize();
        ssc.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ssc.checkScreenShots(ssc.driver);
        ssc.getParticularSectionScreenShot();
        ssc.getLogoScreenShot();
        ssc.driver.quit();
    }

    /**
     * This method will take a screenshot
     *
     * @param driver WebDriver
     */
    void checkScreenShots(WebDriver driver) {

        // Take Screenshots example
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Path source = scrFile.toPath();
            Path target = Paths.get("images", "screenshot.png");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
//            FileHandler.copy(scrFile, new File("images//screenshot.png"));
            log.info("Screenshot captured");
        } catch (IOException e) {
//            throw new RuntimeException("unable to find path" + e.getMessage());
            log.error("unable to find path " + e.getMessage());
        }
    }

    void getParticularSectionScreenShot() throws IOException {
        WebElement verifyingTablesElement = driver.findElement(By.
                xpath("//*[@id=\"__next\"]/div/div/section/div/div[2]"));
        File scrFile = verifyingTablesElement.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile, new File("images//table.png"));
        log.info("Verifying table Screenshot is captured");
    }

    void getLogoScreenShot() throws IOException {
        WebElement logoElement = driver.findElement(By.tagName("a"));
        File scrFile = logoElement.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile, new File("images//logo.png"));
        log.info("Verifying logo Screenshot is captured");
    }
}
