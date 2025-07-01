package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DynamicTableWorkOut {

    Logger log = LogManager.getLogger(DynamicTableWorkOut.class);
    BaseUtilTest but = new BaseUtilTest();

//    public static void main(String[] args) {
//        BaseUtilTest but = new BaseUtilTest();
//        Logger log = LogManager.getLogger(DynamicTableWorkOut.class);
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//
//        List<WebElement> rowsList = driver.findElements(By.
//                xpath("//table[@class='tsc_table_s13']//tbody/tr"));
//        int rows = rowsList.size();
//        log.info("Rows:{}", rows);
//
//        List<WebElement> columnsList = driver.findElements(By.
//                xpath("//table[@class='tsc_table_s13']//thead//tr//th"));
//        int columns = columnsList.size();
//        log.info("Columns:{}", columns);
//
//        ArrayList<Integer> heightArray = new ArrayList<>();
//        HashMap<String,Integer> demoTable = new HashMap<>();
//
//        for (int r = 1; r <= rows; r++) {
//            WebElement heightElement = driver.findElement(By.
//                    xpath("//table[@class='tsc_table_s13']//tbody/tr[" + r + "]/td[3]"));
//            String height = heightElement.getText();
//            log.info(height.replaceAll("[^0-9]", ""));
//
//            heightArray.add(Integer.parseInt(height));
//            //Integer dHeight = Integer.parseInt(height);
//            // heightArray.add(dHeight);
//        }
//        Collections.sort(heightArray);
//        log.info("Tallest height:{}", heightArray.getLast());
//
//        demoTable.put("Burj Khalifa",829);
//        demoTable.put("Clock Tower Hotel",601);
//        demoTable.put("Taipei 101",509);
//        demoTable.put("Financial Center",492);
//
//        log.info(demoTable.containsValue(829));
//
//
//
//        /*///Tallest height 829m represents -> Burj Khalifa structure
//        for (int r = 1; r <= rows; r++) {
//            for (int c = 1; c <= columns; c++) {
//                WebElement heightElement = driver.findElement(By.
//                        xpath("//table[@class='tsc_table_s13']//tbody/tr[1]/td[" + c + "]"));
//                String heightValue = heightElement.getText();
//
//                if (heightValue.equals("829m")) {
//                    WebElement structureElement = driver.findElement(By.
//                            xpath("//table[@id='tsc_table_s13']//tbody/tr[" + r + "]/td[1]"));
//                    String structureName = structureElement.getText();
//                    log.info("Structure for {}is:{}", heightValue, structureName);
//                    break;
//                }
//            }
//        }*/
//
//
//        /* if (rows == 4) {
//            for (WebElement row : rowsList) {
//                log.info("Structure are:{}", row.getText());
//            }
//
//        }*/
//        /*log.info("There are only 4 structure values present in the table ");
//
//        int headerCount = 0;
//        WebElement footerHeader1 = driver.findElement(By.
//                xpath("//table[@class='tsc_table_s13']//tfoot/tr/th"));
//        log.info("footer header is:{}", footerHeader1.getText());
//        headerCount++;
//
//        WebElement footerHeader2 = driver.findElement(By.
//                xpath("//table[@class='tsc_table_s13']//tfoot/tr/td"));
//        log.info("footer header is:{}", footerHeader2.getText());
//        headerCount++;
//
//        log.info("Header Count:{}", headerCount);*/
//    }

    public static void main(String[] args) {

        DynamicTableWorkOut dtw = new DynamicTableWorkOut();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement tableElement = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));

        WebElement footerElement = tableElement.findElement(By.tagName("tfoot"));
        WebElement bodyElement = tableElement.findElement(By.tagName("tbody"));
        List<WebElement> bRowsElements = bodyElement.findElements(By.tagName("tr"));
        List<TechlisticRow> rowList = new ArrayList<>();

        for (WebElement bRow : bRowsElements) {
            TechlisticRow row1 = new TechlisticRow();

            WebElement tHElement = bRow.findElement(By.tagName("th"));
            row1.setStructure(tHElement.getText());

            List<WebElement> tdElements = bRow.findElements(By.tagName("td"));
            row1.setCountry(tdElements.get(0).getText());
            row1.setCity(tdElements.get(1).getText());
            row1.setHeightAsString(tdElements.get(2).getText());
            row1.setBuilt(Integer.parseInt(tdElements.get(3).getText()));
            row1.setRank(Integer.parseInt(tdElements.get(4).getText()));

            dtw.log.info("rows is {} ", row1);
            rowList.add(row1);
        }

        // sort the rowList by height ascending
        rowList.sort(Comparator.comparing(TechlisticRow::getHeight));
        TechlisticRow tallestRowAfterSort = rowList.getLast(); // since the rowList is sorted
        dtw.log.info("The tallest structure is {} , having a height of {}"
                , tallestRowAfterSort.getStructure(), tallestRowAfterSort.getHeightAsString());


        // find how many elements are there in tfoot
        WebElement trElement = footerElement.findElement(By.tagName("tr"));
        dtw.log.info("footer elements {} ", trElement.getSize());
    }
}

