package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpLearningModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(PopUpLearningModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        PopUpLearningModify pul = new PopUpLearningModify();

        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        //user name and pwd added
        pul.driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //https://admin:admin@the-internet.herokuapp.com/basic_auth
        // https://user:password@URL
        pul.driver.quit();
    }
}