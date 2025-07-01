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

public class HandlingWindowsModify {

    private final Logger log = LogManager.getLogger(HandlingWindowsModify.class);
    private final WebDriver driver = new ChromeDriver();
    private final BaseUtilTest but = new BaseUtilTest();

    public static void main(String[] args) {

        HandlingWindowsModify hwm = new HandlingWindowsModify();

        hwm.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        hwm.driver.manage().window().maximize();

        hwm.checkWindowHandle();
        hwm.driver.quit();
    }

    void checkWindowHandle() {
        String windowId = driver.getWindowHandle();
        log.info("Window id is:{}", windowId);

        WebElement orangeHrmIncElement = driver.
                findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));

        orangeHrmIncElement.click();

        //method1
        Set<String> windowIds = driver.getWindowHandles();

        Iterator<String> it = windowIds.iterator();
        String parentWindowId = it.next();
        String childWindowId = it.next();

        log.info("Parent Window ID:{}", parentWindowId);
        log.info("ChildWindowID:{}", childWindowId);

        //method 2
        // convert Set to List

        List<String> windowIDs = new ArrayList<String>(windowIds);
       /* log.info("Parent Window ID:{}",windowIDs.getFirst());
        log.info("Parent Window ID:{}",windowIDs.getLast());

        //currently im in child window , to switch to parent window

        driver.switchTo().window(parentWindowId);
        log.info("Parent Window Title is:{}", driver.getTitle());

        //switching to child window

        driver.switchTo().window(childWindowId);
        log.info("Child Window Title is:{}", driver.getTitle());*/


        //for each loop
        log.info("********Displaying window Titles:************");
        for (String windowId1 : windowIDs) {
            driver.switchTo().window(windowId1);
            String title = driver.getTitle();
            if (title.equals("OrangeHRM")) {
                driver.close();
            }
            log.info(title);
        }
    }
}
