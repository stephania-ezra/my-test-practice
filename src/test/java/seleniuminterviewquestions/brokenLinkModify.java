package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class brokenLinkModify {

    private final Logger log = LogManager.getLogger(brokenLinkModify.class);
    private final WebDriver driver = new ChromeDriver();
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) throws IOException {

        brokenLinkModify blm = new brokenLinkModify();
        blm.driver.get("https://www.geeksforgeeks.org/");
        blm.driver.manage().window().maximize();

        blm.checkBrokenLink();
        // blm.driver.quit();

    }

    void checkBrokenLink() throws IOException {

        List<WebElement> linksList = driver.findElements(By.tagName("a"));

        int brokenLinks = 0;
        int validLinks = 0;
        for (WebElement links : linksList) {
            String url = links.getAttribute("href");

            /*if (url == null || url.isEmpty()) {
                log.info("URL is empty");
                continue;
            }*/
            //converting String to url format

            URL link = new URL(url);

            HttpURLConnection httpConnection = (HttpURLConnection) link.openConnection();
            httpConnection.connect();
            try {
                if (httpConnection.getResponseCode() >= 400) {
                    log.info("{} {} is BrokenLink", httpConnection.getResponseCode(), url);
                    brokenLinks++;
                } else {
                    log.info("{} is a valid link", httpConnection.getResponseCode());
                    validLinks++;
                }
            } catch (Exception e) {
                log.info("Exception while establishing connection:{}", e.getMessage());
            }
        }
        log.info("broken links:{}", brokenLinks);
        log.info("valid Links:{}", validLinks);

    }
}
