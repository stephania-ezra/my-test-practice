package com.learning.stackoverflow;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class StackOverflowTest extends BaseUtilTest{

    public final Logger log = LogManager.getLogger(StackOverflowTest.class);
    WebDriver driver = new ChromeDriver();
    BaseUtilTest but = new BaseUtilTest();

    @Test(priority = 1)
    public void test1(){
        log.info("Hey nonsense I am working");
    }

    @Test(priority = 2)
    public void openStackOverFlow(){
        driver.get("https://stackoverflow.com/questions");
        driver.manage().window().maximize();

        /*WebElement aboutElement = driver.findElement(By.xpath("/html/body/header/div/ol/li[1]/a"));
        aboutElement.click();
        log.info("About is clicked");

        WebElement yearsElement = driver.findElement(By.
                xpath("//*[@id=\"__nuxt\"]/section[1]/div[1]/div[1]/div[1]"));
        log.info(yearsElement.getText());
        Assert.assertEquals(yearsElement.getText(),"17 years","Year Mismatch");*/

        WebElement questionsElement = driver.findElement(By.xpath("//*[@id=\"nav-questions\"]/div/span"));
        questionsElement.click();

        List<WebElement> blogElements = driver.findElements(By.xpath("//*[@id=\"sidebar\"]/div[1]/ul/li"));
        log.info(blogElements.size());

        for(WebElement blogElement:blogElements){
          if(blogElement.getText().equals("The Overflow Blog")){
              log.info("The Overflow Blog is present");
          }
        }

        driver.quit();
    }
}