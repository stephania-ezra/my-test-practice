package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderLearn {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(SliderLearn.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        SliderLearn sl = new SliderLearn();
        sl.driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        sl.driver.manage().window().maximize();
        sl.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        sl.checkMinimumSlider();
        sl.checkMaximumSlider();

        sl.driver.quit();
    }

    void checkMinimumSlider() {

        WebElement minimumPriceElement = driver.findElement(By.
                xpath("//div[@id='slider-range']//span[1]"));
        log.info("Location of minimum Price Slider:{}", minimumPriceElement.getLocation());
        log.info("Size of Minimum Price Element:{}", minimumPriceElement.getSize());

        Actions act = new Actions(driver);
        act.dragAndDropBy(minimumPriceElement, 100, 0).perform();

        //getting the location details after moved
        log.info("Location of minimum Price Slider:{}", minimumPriceElement.getLocation());
        log.info("Size of Minimum Price Element:{}", minimumPriceElement.getSize());

    }

    void checkMaximumSlider() {

        WebElement maximumPriceElement = driver.findElement(By.
                xpath("//*[@id=\"slider-range\"]/span[2]"));
        log.info("Location of maximum Price Slider:{}", maximumPriceElement.getLocation());
        log.info("Size of maximum Price Element:{}", maximumPriceElement.getSize());

        Actions act = new Actions(driver);
        act.dragAndDropBy(maximumPriceElement, -100, 0).perform();

        //getting the location details after moved
        log.info("Location of maximum Price Slider:{}", maximumPriceElement.getLocation());
        log.info("Size of maximum Price Element:{}", maximumPriceElement.getSize());

    }


}
