package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class MultiDropDownHandling {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(MultiDropDownHandling.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        MultiDropDownHandling mddh = new MultiDropDownHandling();

        mddh.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mddh.driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");

        mddh.driver.manage().window().maximize();

        WebElement multiSelectInputElement = mddh.driver.findElement(By.id("mbsc-control-0"));
        multiSelectInputElement.click();

        mddh.selectChoiceValues(mddh.driver, "Books");

        mddh.selectChoiceValues(mddh.driver, "Movies, Music & Games", "Home, Garden & Tools", "Health & Beauty");

        mddh.selectChoiceValues(mddh.driver, "Books", "Movies, Music & Games", "Home, Garden & Tools", "Health & Beauty",
                "Toys", "Kids & Baby", "Clothing & Jewelry", "Sports & Outdoors");

        mddh.driver.quit();
    }

    void selectChoiceValues(WebDriver driver, String... values) {

        // <div aria-hidden="true" class="mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi"
        // role="option" style="height: 34px; line-height: 34px;">
        // <div></div>
        // <span class=" mbsc-ios mbsc-ltr mbsc-wheel-checkmark"></span>
        // </div>

        WebElement parentDivElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]" +
                "/div/div/div/div/div[2]/div/div[1]/div"));
        List<WebElement> choiceList = parentDivElement.findElements(By.tagName("div"));
        log.info("size is:{}", choiceList.size());

        for (WebElement choice : choiceList) {
//                log.info("aria-hidden, {}", choice.getAttribute("aria-hidden"));

            String ariaHidden = choice.getAttribute("aria-hidden");
            if (ariaHidden == null) {
                String text = choice.getText();
                for (String value : values) {
                    if (text.equalsIgnoreCase(value)) {
                        log.info("{} matched", text);
                        choice.click();
                    }
                }
            }
        }
    }
}


