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

public class PracticeDropDown {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(PracticeDropDown.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        PracticeDropDown pdd = new PracticeDropDown();

        pdd.driver.get("https://demoqa.com/automation-practice-form");
        pdd.driver.manage().window().maximize();
        pdd.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        pdd.but.scrollToMiddle(pdd.driver);

        pdd.checkDropDown();

        pdd.driver.quit();
    }

    void checkDropDown() {

        WebElement headingElement = driver.findElement(By.
                xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1"));
        log.info("Title of the page is:{}", headingElement.getText());

        WebElement subHeadingElement = driver.findElement(By.
                xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h5"));
        log.info("Sub-heading is:{}", subHeadingElement.getText());

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        firstNameElement.sendKeys("Alex");

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        lastNameElement.sendKeys("Michalledies");

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        emailElement.sendKeys("alex123@gmail.com");

        WebElement maleGenderElement = driver.findElement(By.
                xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        maleGenderElement.click();

        WebElement mobileElement = driver.findElement(By.id("userNumber"));
        mobileElement.sendKeys("9876543210");

        /*driver.switchTo().frame(0);
        WebElement dateOfBirthElement = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dateOfBirthElement.sendKeys("09/05/2025");*/

       /* but.stopTheFlow(5);
        WebElement subjectsElements = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div"));
        subjectsElements.sendKeys("Science");

        WebElement sportsHobbiesElement = driver.findElement(By.id("hobbies-checkbox-1"));
        sportsHobbiesElement.click();
        log.info("sports is clicked");*/

        but.scrollToFooter(driver);
        WebElement stateAndCityElement = driver.findElement(By.xpath("//*[@id=\"state\"]/div"));
        stateAndCityElement.click();
    }
}


