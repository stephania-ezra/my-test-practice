package com.learning.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class BaseUtilTest {

    public final Logger log = LogManager.getLogger(BaseUtilTest.class);

    public void tearDown(WebDriver driver) {
        try {
            WebElement signOutToggleButton = driver
                    .findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button"));
            signOutToggleButton.click();

            WebElement signOut = driver
                    .findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a"));
            signOut.click();


            // using web driver wait and checking the homepage redirect
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .ignoring(StaleElementReferenceException.class)
                    .until((WebDriver d) -> {

                        if (d.getCurrentUrl()
                                .contains("https://magento.softwaretestingboard.com/customer/account/logoutSuccess/")) {
                            log.info("successfully logged out");
                            return true;
                        } else if (d.getCurrentUrl()
                                .equalsIgnoreCase("https://magento.softwaretestingboard.com")) {
                            log.info("successfully logged out");
                            return true;
                        } else
                            return false;
                    });
        } catch (NoSuchElementException nsee) {
            log.info("not logged in yet, so no need to sign out. ");
        }
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        // LocalStorage
//        String localStorage = (String) jsExecutor.executeScript(String
//                .format("return window.localStorage.getItem('%s');", "mage-cache-storage"));
//        log.info("mage-cache-storage: " + localStorage);
//        assertTrue(isCustomerDataPresent(localStorage));
        finally {
            driver.quit();
        }
    }

    /**
     * This method will take screenshot
     *
     * @param driver   WebDriver
     * @param fileName fileName (TestClassName + TestMethodName + .jpg)
     */
    public void takeScreenShot(WebDriver driver, String fileName) {
        // adding subfolder
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String screenshotSubFolderName = myDateObj.format(myFormatObj);

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File memoryFile = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            Path fromFilePath = memoryFile.toPath();
            Path screenshots = Paths.get("screenshots", screenshotSubFolderName);

            if (!Files.exists(screenshots))
                Files.createDirectory(screenshots);

            Path toPath = Paths.get(String.valueOf(screenshots), fileName);
            Files.copy(fromFilePath, toPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method will stop the execution using Thread.sleep
     *
     * @param value in seconds
     */
    public void stopTheFlow(long value) {
        try {
            if (value == 0)
                value = 5;
            log.info("waiting {} seconds", value);
            Thread.sleep(Duration.ofSeconds(value));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method will scroll the browser to the top
     *
     * @param driver WebDriver
     */
    public void scrollToTop(WebDriver driver) {
        // Scroll to the top of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }

    /**
     * This method will scroll the browser to the middle
     *
     * @param driver Webdriver
     */
    public void scrollToMiddle(WebDriver driver) {
        // Scroll to the top of the page
        scrollToMiddle(driver, "0, 400");
    }

    public void scrollToMiddle(WebDriver driver, String fromTo) {
        // Scroll to the top of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(" + fromTo + ");");
    }

    /**
     * This method will scroll the browser to the footer
     *
     * @param driver Webdriver
     */
    public void scrollToFooter(WebDriver driver) {
        // Scroll to the top of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1200);");
    }

    public void hoverTheElement(WebDriver driver, WebElement element) {
        //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(element).perform();
        stopTheFlow(3);
    }

    //check this

    public WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return driver.findElement(locator);
    }
}

