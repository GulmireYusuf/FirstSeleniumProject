package tests.d4_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtils;

public class EnterTextPractice2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        BrowserUtils.wait(2);
        WebElement inputBox= driver.findElement(By.name("email"));
        inputBox.sendKeys("random@email.com", Keys.ENTER);
        WebElement confirmationMessage=driver.findElement(By.name("confirmation_message"));
        String expectedMessage="Your e-mail's been sent!";
        String actualMessage=confirmationMessage.getText();//to get the text from element
        if(expectedMessage.equals(actualMessage)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        BrowserUtils.wait(2);
        driver.close();
    }
}
