package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(NavigationCommandsModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        NavigationCommandsModify nc = new NavigationCommandsModify();
        nc.driver.manage().window().maximize();
        nc.checkNavigationCommand();

        nc.driver.quit();
    }

    void checkNavigationCommand() {

        driver.get("https://www.amazon.com/");
        //driver.get("https://www.snapdeal.com/");

        driver.navigate().to("https://www.snapdeal.com/");

        // back to amazon.com
        driver.navigate().back();

        // forward to snapdeal
        driver.navigate().forward();

        //refresh snapdeal
        driver.navigate().refresh();

        /**
         *
         * //get command
         *  @Override
         *   public void get(String url) {
         *     execute(DriverCommand.GET(url));
         *   }
         *
         * //navigate().to()
         *  @Override
         *     public void to(String url) {
         *       get(url);
         *     }
         *
         *     @Override
         *     public void to(URL url) {
         *       get(String.valueOf(url));
         *     }
         *
         */
    }
}
