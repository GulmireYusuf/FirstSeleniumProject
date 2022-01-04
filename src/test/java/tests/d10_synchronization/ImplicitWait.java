package tests.d10_synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
     @Test
    public void test1()  {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

         System.out.println(driver.findElement(By.id("finish")).getText());

     }
    @Test
    public void test2()  {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        System.out.println(driver.findElement(By.id("finish")).getText());

    }
}
