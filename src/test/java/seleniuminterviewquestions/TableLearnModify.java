package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableLearnModify {

    BaseUtilTest but = new BaseUtilTest();
    Logger log = LogManager.getLogger(TableLearnModify.class);
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        TableLearnModify tl = new TableLearnModify();

        tl.driver.get("https://www.letcode.in/table");
        tl.driver.manage().window().maximize();

        tl.totalRows();
        tl.totalColumns();
        tl.getSpecificRow();
        tl.getAllData();
        tl.checkLetsHandleItTable();

        tl.driver.quit();
    }

    void totalRows() {

        //1. Total number of rows
        List<WebElement> rowsList = driver.findElements(By.xpath("//table[@id='shopping']//tbody//tr"));
        int rows = rowsList.size();
        log.info("Total Number of Rows:{}", rows);
    }

    void totalColumns() {

        //2.Total Number of Columns
        List<WebElement> columnsList = driver.findElements(By.
                xpath("//table[@id='shopping']//thead/tr/th"));
        int columns = columnsList.size();

        log.info("Total Number of Columns:{}", columns);
    }

    void getSpecificRow() {
        //3.Retrieve the specific row/column data

        WebElement eggPriceElement = driver.findElement(By.
                xpath("//table[@id='shopping']//tbody//tr[3]//td[2]"));
        log.info("Egg Price:{}", eggPriceElement.getText());
    }

    void getAllData() {
        //4. retrieve all the data from the table
        log.info("Displaying the web table data");

        List<WebElement> rowsList = driver.findElements(By.xpath("//table[@id='shopping']//tbody//tr"));
        int rows = rowsList.size();

        List<WebElement> columnsList = driver.findElements(By.
                xpath("//table[@id='shopping']//thead/tr/th"));
        int columns = columnsList.size();

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                WebElement dataElement = driver.findElement(By.
                        xpath("//table[@id='shopping']//tbody//tr[" + r + "]/td[" + c + "]"));
                String data = dataElement.getText();
                log.info("{}    ", data);
            }
        }
    }

    void checkLetsHandleItTable() {
        //5. Let's handle it table

        but.scrollToMiddle(driver);
        List<WebElement> numberOfRows = driver.findElements(By.
                xpath("//table[@id='simpletable']//tbody//tr"));
        int rowCounts = numberOfRows.size();
        log.info("Row count is :{}", rowCounts);

        List<WebElement> numberOfColumns = driver.findElements(By.
                xpath("//table[@id='simpletable']//thead//tr//th"));
        int columnCounts = numberOfColumns.size();
        log.info("Column count is :{}", columnCounts);

        //retrieving "Raj"

       /* WebElement lastNameElement = driver.findElement(By.xpath("//table[@id='simpletable']//tbody//tr[2]//td[2]"));
        String lastName = lastNameElement.getText();
        log.info("Last Name is:{}", lastName);*/

        //if lastname is raj , mark present

        for (int r = 1; r <= rowCounts; r++) {
            WebElement lastNameElement = driver.findElement(By.
                    xpath("//table[@id='simpletable']//tbody/tr[" + r + "]/td[2]"));
            String lastName = lastNameElement.getText();

            if (lastName.equalsIgnoreCase("Raj")) {
                WebElement presentOrAbsentElement = driver.findElement(By.
                        xpath("//table[@id='simpletable']//tbody/tr[" + r + "]/td[4]"));
                presentOrAbsentElement.findElement(By.tagName("input")).click();
            }
        }
    }
}

