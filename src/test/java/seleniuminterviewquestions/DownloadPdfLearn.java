package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;

public class DownloadPdfLearn {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(DownloadPdfLearn.class);
    private WebDriver driver;

    public static void main(String[] args) {

        DownloadPdfLearn dpl = new DownloadPdfLearn();

        dpl.downloadPdfFile();
        dpl.driver.quit();
    }

    void downloadPdfFile() {
        String location = System.getProperty("HOME") + "//downloads";

        HashMap<String, Object> preferences = new HashMap<String, Object>();
        preferences.put("plugins.always_open_pdf_externally", true);//pdf
        preferences.put("download.default_directory", location);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);

        driver = new ChromeDriver(options);
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement pdfButtonElement = driver.findElement(By.
                xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a"));
        pdfButtonElement.click();

        but.stopTheFlow(5);
    }
}
