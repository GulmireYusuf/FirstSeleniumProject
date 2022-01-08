package tests.d13_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

import java.util.List;

public class WebTablesExamplesTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void tables(){
        WebElement table= driver.findElement(By.id("table1"));
        System.out.println(table.getText());
        Assert.assertTrue(table.getText().contains("jsmith@gmail.com"));
    }
    @Test
    public void getHeaders(){
        // get all colum names individually
        List<WebElement> headers=driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers size= "+headers.size());
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
       WebElement headers2=driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println(headers2.getText());
    }
    @Test
    public void printTablesize(){
        List<WebElement> headers=driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("number of columns= "+headers.size());
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("number of rows including headers= "+rows.size());

        List<WebElement> rowsNotIncludeHeaders=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("number of rows not including headers= "+rowsNotIncludeHeaders.size());
    }
    @Test
    public void getRow() {
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]"));
        System.out.println(row.getText());

        List<WebElement> rowsNotIncludeHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("number of rows not including headers= " + rowsNotIncludeHeaders.size());

        for (int i = 0; i < rowsNotIncludeHeaders.size(); i++) {
            String xpath = "//table[@id='table1']/tbody/tr["+ i +"]";
            System.out.println(xpath);
            WebElement singleRow = driver.findElement(By.xpath(xpath));
            System.out.println(singleRow.getText());
        }
    }
        @Test
                public void getCellsRow(){
            List<WebElement> allCellInOneRow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
            for (WebElement cell : allCellInOneRow) {
                System.out.println(cell.getText());
            }
            System.out.println("number of cells in tis row :" +allCellInOneRow);
        }
    @Test
    public void getSingleCellByIndex(){
        WebElement singeltonCell= driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[4]"));
        System.out.println(singeltonCell.getText());
    }
   @Test
    public void printAllCellByIndex() {
       int rowNumber = getNumberOfRows();
       int colNumber = getNumberOfRows();

       for (int i = 1; i <= rowNumber; i++) {

           for (int j = 0; j <= colNumber; j++) {
               String xpath = "//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]";
               WebElement cell = driver.findElement(By.xpath(xpath));
               System.out.println(cell.getText());

           }
       }

       }

   private int getNumberOfRows() {
        List<WebElement> allRowExcludingHeaders=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRowExcludingHeaders.size();
   }

    }


