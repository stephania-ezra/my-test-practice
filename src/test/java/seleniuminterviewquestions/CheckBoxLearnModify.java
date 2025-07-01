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

public class CheckBoxLearnModify {

    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(CheckBoxLearnModify.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        CheckBoxLearnModify cblm = new CheckBoxLearnModify();
        cblm.driver.manage().window().maximize();
        cblm.driver.get("https://demoqa.com/automation-practice-form");

        cblm.but.scrollToMiddle(cblm.driver);
        cblm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        cblm.checkTheBoxes();
        cblm.UnCheckTheBoxes();
        cblm.checkDisplay();
        cblm.checkEnabled();
        cblm.checkParticularHobby();
        cblm.checkLastTwoCheckBoxes();
        cblm.checkSelected();
    }

    void checkTheBoxes() {

        but.stopTheFlow(3);
        //WebElement sportsElement = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        // WebElement sportsElement = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
        WebElement sportsElement = driver.findElement(By.id("hobbies-checkbox-1"));
        sportsElement.click();
        log.info("sports is clicked");

        but.stopTheFlow(3);
        WebElement readingElement = driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
        // WebElement readingElement = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
        readingElement.click();
        log.info("reading is clicked");

        but.stopTheFlow(3);
        WebElement musicElement = driver.findElement(By.xpath("//label[normalize-space()='Music']"));
        //WebElement musicElement = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
        musicElement.click();
        log.info("music is clicked");
    }

    void UnCheckTheBoxes() {

        WebElement sportsElement = driver.findElement(By.id("hobbies-checkbox-1"));
        sportsElement.click();
        but.stopTheFlow(3);
        WebElement readingElement = driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
        readingElement.click();
        but.stopTheFlow(3);
        WebElement musicElement = driver.findElement(By.xpath("//label[normalize-space()='Music']"));
        musicElement.click();
    }

    void checkDisplay() {
        //is displayed()
        WebElement sportsElement = driver.findElement(By.id("hobbies-checkbox-1"));
        Boolean sportsValue = sportsElement.isDisplayed();
        log.info(sportsValue);

        if (sportsValue == true) {
            sportsElement.click();
        }
    }

    void checkSelected() {
        //isSelected
        WebElement readingElement = driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
        Boolean readingValue = readingElement.isSelected();
        log.info(readingValue);

        if (readingValue == false) {
            readingElement.click();
        }
    }

    void checkEnabled() {
        //isEnabled
        WebElement readingElement = driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
        Boolean musicValue = readingElement.isEnabled();
        log.info(musicValue);

        WebElement musicElement = driver.findElement(By.xpath("//label[normalize-space()='Music']"));

        if (musicValue == true) {
            musicElement.click();
        }

        List<WebElement> hobbiesList = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
        int totalHobbies = hobbiesList.size();
        log.info("Number of hobbies are:{}", hobbiesList.size());
        // log.info(hobbiesList.get(1));
        //log.info(hobbiesList.getLast());
        //log.info(hobbiesList.getFirst());


        for (WebElement hobby : hobbiesList) {
            hobby.click();
        }
        log.info("All hobbies are clicked");
    }

    void checkParticularHobby() {

        List<WebElement> hobbiesList = driver.findElements(By.
                xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
        for (WebElement hobbies : hobbiesList) {
            log.info("Hobbies are:{}", hobbies.getText());
            if (hobbies.getText().equals("Sports") || hobbies.getText().equals("Reading")) {
                hobbies.click();
            }
        }
    }

    void checkLastTwoCheckBoxes() {

        // total no of checkboxes - want to select = starting index
        // 3 - 2 = 1
        //3
        List<WebElement> hobbiesList = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
        int totalHobbies = hobbiesList.size();
        for (int i = totalHobbies - 2; i < totalHobbies; i++) {
            hobbiesList.get(i).click();
            log.info("hobbies clicked is:{}", hobbiesList.get(i).getText());
        }
        // i= 3-2 ie 1 ; 1<3;
        // hobbies.get(1).click() ; // sports
        // i = 2
        //for(int i = 2 ; 2<3 ; )
        //hobbies.get(2).click();//Reading
    }
}
