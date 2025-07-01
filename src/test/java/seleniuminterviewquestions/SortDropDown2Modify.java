package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDropDown2Modify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(SortDropDown1.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        SortDropDown2Modify sdd2 = new SortDropDown2Modify();
        sdd2.driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        sdd2.driver.manage().window().maximize();
        sdd2.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        sdd2.but.scrollToMiddle(sdd2.driver);

        sdd2.but.stopTheFlow(5);

        WebElement stateDropDownWebElement = sdd2.driver.findElement(By.id("state"));
        stateDropDownWebElement.click();

        Select stateDropDown = new Select(stateDropDownWebElement);

        List<WebElement> allOptionsList = stateDropDown.getOptions();
        sdd2.log.info("Options Count:{}", allOptionsList.size());

        ArrayList originalList = new ArrayList();
        ArrayList tempList = new ArrayList();

        for (WebElement option : allOptionsList) {
            String optionText = option.getText();
            originalList.add(optionText);
            tempList.add(optionText);

            //Before Sorting
            sdd2.log.info("Original List Before sorting{}", originalList);
            sdd2.log.info("Temp List Before Sorting{}", tempList);

            Collections.sort(tempList);
        }

        sdd2.log.info("After Sorting");
        sdd2.log.info("***************");
        sdd2.log.info("Original List is: {}", originalList);
        sdd2.log.info("Temp List is: {}", tempList);

        if (originalList.equals(tempList)) {
            sdd2.log.info("DropDown is Sorted");
        } else {
            sdd2.log.info("DropDown not Sorted");
        }
        sdd2.driver.quit();
    }
}
