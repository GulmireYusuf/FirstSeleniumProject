package tests.d11_file_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class FileUploadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");
        Thread.sleep(1000);
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Mila\\Desktop\\file.txt");
        driver.findElement(By.id("file-submit")).click();

        String actual= driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actual,"file.txt");
    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/upload");
        String projectPath=System.getProperty("user.dir");
        String relativePath="/src/test/resources/test_file.txt";
        String fullPath=projectPath+relativePath;//location of the file within the project

        driver.findElement(By.id("file-upload")).sendKeys(fullPath);
        driver.findElement(By.id("file-submit")).click();

        String actual= driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actual,"test_file.txt");
    }
}