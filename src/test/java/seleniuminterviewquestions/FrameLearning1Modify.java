package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLearning1Modify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(FrameLearning1Modify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        FrameLearning1Modify fl1 = new FrameLearning1Modify();
        fl1.driver.get("https://demo.automationtesting.in/Frames.html");
        fl1.driver.manage().window().maximize();

        WebElement frameWithinFrameElement = fl1.driver.findElement(By.linkText("Iframe with in an Iframe"));
        frameWithinFrameElement.click();
        fl1.log.info("iframe with in an iframe Button is clicked");

        WebElement outerFrameElement = fl1.driver.findElement(By.
                xpath("//*[@id=\"Multiple\"]/iframe"));
        fl1.driver.switchTo().frame(outerFrameElement);

        WebElement outerHeaderText = fl1.driver.findElement(By.
                xpath("/html/body/section/div/div/h5"));
        fl1.log.info("Outer Frame Text is:{}", outerHeaderText.getText());

        WebElement innerFrameElement = fl1.driver.findElement(By.
                xpath("/html/body/section/div/div/iframe"));
        fl1.driver.switchTo().frame(innerFrameElement);

        WebElement innerHeaderText = fl1.driver.findElement(By.
                xpath("/html/body/section/div/h5"));
        fl1.log.info("Inner Frame Text is:{}", innerHeaderText.getText());

        WebElement inputBoxElement = fl1.driver.findElement(By.
                xpath("/html/body/section/div/div/div/input"));
        inputBoxElement.sendKeys("Collins is the Best");
        fl1.but.stopTheFlow(3);

        fl1.driver.quit();
    }
}
