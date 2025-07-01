package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDropDown1 {

    public static void main(String[] args) {
        BaseUtilTest but = new BaseUtilTest();

        Logger log = LogManager.getLogger(SortDropDown1.class);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.manage().window().maximize();

        WebElement SignInElement = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
        SignInElement.click();

        WebElement RegisterNowElement = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
        RegisterNowElement.click();

       /* WebElement UserInformationTitleElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/h3[1]"));
        log.info("User Information:{}", UserInformationTitleElement.getText());

        WebElement UserIdElement = driver.findElement(By.name("username"));
        UserIdElement.sendKeys("Michael");

        WebElement NewPasswordElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input"));
        NewPasswordElement.sendKeys("MW@21*89");

        WebElement RepeatPasswordElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input"));
        RepeatPasswordElement.sendKeys("OP@21*89");

        WebElement AccountInformationTitleElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/h3[2]"));
        log.info("Account Information Title :{}", AccountInformationTitleElement.getText());

        WebElement FirstNameElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input"));
        FirstNameElement.sendKeys("Ethan");

        WebElement LastNameElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input"));
        LastNameElement.sendKeys("Calvin");

        WebElement EmailElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input"));
        EmailElement.sendKeys("EC@gmail.com");

        WebElement PhoneElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input"));
        PhoneElement.sendKeys("9876543210");

        WebElement Address1Element = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input"));
        Address1Element.sendKeys("kannanStreet");

        WebElement Address2Element = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input"));
        Address2Element.sendKeys("MumbaiMainRoad");

        WebElement CityElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input"));
        CityElement.sendKeys("Sydney");

        WebElement StateElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input"));
        StateElement.sendKeys("Australia");

        WebElement ZipElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input"));
        ZipElement.sendKeys("833800");

        WebElement CountryElement = driver.findElement(By
                .xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input"));
        CountryElement.sendKeys("Australia");

        WebElement languageDropDownElement = driver.findElement(By.
                xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[1]/td[2]/select"));
        Select languageDropDown = new Select(languageDropDownElement);

        ArrayList originalList = new ArrayList();
        ArrayList tempList = new ArrayList();

        List<WebElement> languages = languageDropDown.getOptions();
        for (WebElement language : languages) {
            String text = language.getText();
            originalList.add(text);
            tempList.add(text);
        }

        log.info("Before Sorting");
        log.info("***************");
        log.info("Displaying Original List:{}", originalList);
        log.info("Displaying temp List:{}", tempList);

        Collections.sort(tempList);

        log.info("After Sorting");
        log.info("***************");
        log.info("Original List:{}", originalList);
        log.info("Temp List:{}", tempList);

        if (originalList.equals(tempList)) {
            log.info("DropDown is Sorted");
        } else {
            log.info("DropDown not Sorted");
        }*/

       /* //method 3  Handling multiple dropdowns by using generic method
        /*WebElement languageElement =driver.findElement(By.
                xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[1]/td[2]/select"));
        selectOptionsFromDropDown(languageElement,"english");

        WebElement categoryElement = driver.findElement(By.
                xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select"));
        selectOptionsFromDropDown(categoryElement,"FISH");*/


        WebElement favouriteCategoryElement = driver.findElement(By.name("account.favouriteCategoryId"));
        favouriteCategoryElement.click();

        Select favouriteCategoryDropDown = new Select(favouriteCategoryElement);

        List<WebElement> categoriesList = favouriteCategoryDropDown.getOptions();
        log.info(categoriesList.size());

       ArrayList originalList = new ArrayList();
        ArrayList tempList = new ArrayList();

        for (WebElement category : categoriesList) {
            String text = category.getText();
            originalList.add(text);
            tempList.add(text);
        }

        log.info("Before Sorting");
        log.info("***************");
        log.info("Displaying Original List: {}", originalList);
        log.info("Displaying temp List: {}", tempList);

        Collections.sort(tempList);

        log.info("After Sorting");
        log.info("***************");
        log.info("Original List is: {}", originalList);
        log.info("Temp List is: {}", tempList);

        if (originalList.equals(tempList)) {
            log.info("DropDown is Sorted");
        } else {
            log.info("DropDown not Sorted");
        }
        //driver.quit();
    }
}






