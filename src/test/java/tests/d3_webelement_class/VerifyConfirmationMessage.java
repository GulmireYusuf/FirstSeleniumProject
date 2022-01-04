package tests.d3_webelement_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;

public class VerifyConfirmationMessage {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInput= driver.findElement(By.name("email"));

        String expectedEmail="random@email.com";
        emailInput.sendKeys(expectedEmail);

        String actualEmail=emailInput.getAttribute("value");
        if(actualEmail.equals(expectedEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedEmail= "+expectedEmail);
            System.out.println("actualEmail = "+actualEmail);
        }
        WebElement retrivePassword= driver.findElement(By.id("form_submit"));
        retrivePassword.click();

        String expectedMessage="'Your e-mail's been sent!'";
        WebElement messageElement= driver.findElement(By.name("confirmation_message"));

        String actualMessage=messageElement.getText();
        if (actualMessage.equals(expectedMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("expectedMessage: "+expectedMessage);
            System.out.println("actualMessage: "+actualMessage);
        }
    }
}
