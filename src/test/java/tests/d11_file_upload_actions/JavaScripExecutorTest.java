package tests.d11_file_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class JavaScripExecutorTest {
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
    public void click(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement element= driver.findElement(By.linkText("Home"));
       // how the object is created
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();",element);
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement element= driver.findElement(By.cssSelector("input[type='text']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        String str="hello";
        Thread.sleep(2000);
        jse.executeScript("arguments[0].setAttribute('value','"+str+"')",element);
    }
    @Test
    public void scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse=(JavascriptExecutor) driver;

        for (int i = 0; i < 5; i++) {
            jse.executeScript("scroll(0, 500);");
            Thread.sleep(2000);

        }
        
    }

}
