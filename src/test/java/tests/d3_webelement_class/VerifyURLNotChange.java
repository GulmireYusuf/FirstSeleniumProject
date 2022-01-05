package tests.d3_webelement_class;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.BrowserUtilities;
import utilitis.WebDriverFactory;

public class VerifyURLNotChange {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //save the expected url

        String expectedUrl=driver.getCurrentUrl();
        WebElement button= driver.findElement(By.id("form_submit"));
        BrowserUtilities.wait(2);
        button.click();
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        {

        }



    }
}
}
