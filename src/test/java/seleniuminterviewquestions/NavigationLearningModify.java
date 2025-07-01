package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationLearningModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(NavigationLearningModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        NavigationLearningModify nl = new NavigationLearningModify();
        nl.checkNavigation();
        //nl.driver.quit();
    }

    void checkNavigation() {
        driver.get("https://www.amazon.com/");
        //driver.get("https://www.snapdeal.com/");

        driver.navigate().to("https://www.snapdeal.com/");
        driver.navigate().back();//go back to previous amazon page
        driver.navigate().forward();// go front to snapdeal page
        driver.navigate().refresh(); // refresh the snapdeal page
    }
}
