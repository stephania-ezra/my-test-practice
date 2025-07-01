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

public class SortDropDownModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(SortDropDownModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        SortDropDownModify sdd = new SortDropDownModify();
        sdd.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        sdd.driver.get("https://www.wikipedia.org/");
        sdd.driver.manage().window().maximize();

        WebElement languageElement = sdd.driver.findElement(By.id("searchLanguage"));
        languageElement.click();

        Select languageDropDownElement = new Select(languageElement);
        List<WebElement> languageList = languageDropDownElement.getOptions();

        ArrayList originalList = new ArrayList();
        ArrayList tempList = new ArrayList();

        for (WebElement language : languageList) {
            String text = language.getText();
            originalList.add(text);
            tempList.add(text);
        }

        sdd.log.info("Before Sorting");
        sdd.log.info("***************");
        sdd.log.info("Displaying Original List:{}", originalList);
        sdd.log.info("Displaying temp List:{}", tempList);

        Collections.sort(tempList);

        sdd.log.info("After Sorting");
        sdd.log.info("***************");
        sdd.log.info("Original List:{}", originalList);
        sdd.log.info("Temp List:{}", tempList);

        if (originalList.equals(tempList)) {
            sdd.log.info("DropDown is Sorted");
        } else {
            sdd.log.info("DropDown not Sorted");
        }
        sdd.driver.quit();
    }
}
