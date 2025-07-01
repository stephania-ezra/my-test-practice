package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Objects;

public class DownloadLearn {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(DownloadLearn.class);
    private WebDriver driver;

    public static void main(String[] args) {

        DownloadLearn dl = new DownloadLearn();
        dl.downloadRequisite();
        dl.driver.quit();
    }

    void downloadRequisite() {
        String location = System.getProperty("HOME") + "//downloads//";
//        System.get

        //chrome
        //Step 1:
        HashMap<String, Object> preferences = new HashMap<String, Object>();
        preferences.put("download.default_directory", location);

        //Step 2:
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);

        //Step 3:
        driver = new ChromeDriver(options);
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
        driver.manage().window().maximize();

        WebElement downloadButton = driver.findElement(By.
                xpath("//*[@id=\"downloadButton\"]"));
        downloadButton.click();

        but.stopTheFlow(5);

        // File file = new File(location + "//downloads");
//        File file = new File("downloads//sampleFile.jpeg");
//        File file = new File("downloads");
//        if(file.isDirectory() && Objects.requireNonNull(file.list()).length == 0) {
//            log.info("amma saami empty ya dhan iruku");
//        }
//        if (file.exists()) {
//            log.info("File Downloaded successfully");
//        } else {
//            log.info("File not downloaded");
//        }

        File fileLocation = new File("//Users//stephania//Downloads");
        File[] totalFiles = fileLocation.listFiles();

        if(totalFiles != null) {
            log.info("totalFiles {} ", totalFiles.length);
            //assert totalFiles != null;

            for (File file : totalFiles) {
                if (file.getName().equalsIgnoreCase("sampleFile.jpeg")) {
                    log.info("file is Downloaded");
                    break;
                }
            }
        }
    }
}
