package tests.d3_webelement_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.BrowserUtilities;
import utilitis.WebDriverFactory;

public class VerifyURLChanged {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInput= driver.findElement(By.name("email"));
        emailInput.sendKeys("random@email.com");
        BrowserUtilities.wait(2);
        WebElement retrivePassword= driver.findElement(By.id("form_submit"));
        retrivePassword.click();

        String expectedUrl="http://practice.cybertekschool.com/email_sent";
        String actualUrl= driver.getCurrentUrl();
        if(actualUrl.equals(expectedUrl)){
            System.out.println("pass");
        }else{
            System.out.println("Failed");
        }
      driver.quit();




    }
}
