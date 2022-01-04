package tests.d10_synchronization;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTests {

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
            public void test1(){
       driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
       driver.findElement(By.tagName("button")).click();

       WebElement username=driver.findElement(By.id("username"));
       WebDriverWait wait=new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.visibilityOf(username));
       username.sendKeys("yahoo@email.com");
    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
        WebElement input =driver.findElement(By.cssSelector("input[type='text']"));

        WebDriverWait wait=new WebDriverWait(driver,10);// creating object
        wait.until(ExpectedConditions.elementToBeClickable(input));
        input.sendKeys("mila");




    }

}
