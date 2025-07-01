package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandlingWindows1Modify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(HandlingWindows1Modify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        HandlingWindows1Modify hw1 = new HandlingWindows1Modify();
        hw1.driver.get("https://demoqa.com/browser-windows");
        hw1.driver.manage().window().maximize();
        hw1.but.scrollToMiddle(hw1.driver);

        hw1.getWindowID();
        hw1.driver.quit();
    }

    void getWindowID() {

        //parent window id
        String windowId = driver.getWindowHandle();
        log.info("Parent Window Id is:{}", windowId);
        but.stopTheFlow(2);
        //child windows id
        WebElement newWindowElement = driver.findElement(By.
                xpath("//button[@id='windowButton']"));
        newWindowElement.click();

        //using Set

        Set<String> windowIds = driver.getWindowHandles();
        Iterator<String> it = windowIds.iterator();
        String parentWindowId = it.next();
        String childWindowId = it.next();


        List<String> windowIdsList = new ArrayList<String>(windowIds);

        log.info("displaying heading of the child window");
        but.stopTheFlow(3);
        for (String windowId2 : windowIdsList) {
            driver.switchTo().window(windowId2);
            try {
                WebElement headingElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                String heading = headingElement.getText();
                log.info(heading);
            } catch (Exception e) {
                log.info("Heading Element not available{}", e.getMessage());
            }
        }
    }
}
