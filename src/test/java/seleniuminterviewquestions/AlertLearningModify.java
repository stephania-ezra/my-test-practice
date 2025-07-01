package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearningModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(AlertLearningModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        AlertLearningModify alm = new AlertLearningModify();
        alm.driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        alm.driver.manage().window().maximize();

        alm.checkAlertOk();
        alm.checkAlertCancel();
        alm.driver.quit();
    }

    void checkAlertOk() {

        WebElement alertElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        alertElement.click();

        //clicking OK button
        but.stopTheFlow(3);
        driver.switchTo().alert().accept();

        log.info("Alert is closed");

        WebElement confirmButton = driver.findElement(By.
                xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        confirmButton.click();

        but.stopTheFlow(3);
        Alert alertWindow = driver.switchTo().alert();
        log.info("Text Message in confirm box:{}", alertWindow.getText());

        // OK button
        driver.switchTo().alert().accept();
        log.info("You clicked Ok is displayed");
    }

    void checkAlertCancel() {

        driver.switchTo().alert().dismiss();
        log.info("You clicked cancel");

        //Prompt

        WebElement promptButton = driver.findElement(By.
                xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        promptButton.click();

        but.stopTheFlow(5);
        Alert alert = driver.switchTo().alert();
        log.info("Text Message of confirm box:{}", alert.getText());
        alert.sendKeys("I am good at learning Alerts ha ha");
        driver.switchTo().alert().accept();// click ok

    }
}
