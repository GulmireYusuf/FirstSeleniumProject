package tests.d14_properties_driver_class_test_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.ConfigurationReader;
import utilitis.TestBase;
import utilitis.WebDriverFactory;

public class LoginTest extends TestBase {

    @Test
    public void login(){
        String url= ConfigurationReader.get("url");
        driver.get(url);
        driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
    }
}
