package tests.d4_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtils;

public class EnterTextPractice {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputBox= driver.findElement(By.name("email"));
        inputBox.sendKeys("random@email.com");
        WebElement button=driver.findElement(By.id("form_submit"));
        button.click();
        BrowserUtils.wait(2);
        String expectedUrl="http://practice.cybertekschool.com/email_sent";
        String actualUrl= driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected URL: "+expectedUrl);
            System.out.println("Actual URL: "+actualUrl);
        }

        driver.close();

    }
}
