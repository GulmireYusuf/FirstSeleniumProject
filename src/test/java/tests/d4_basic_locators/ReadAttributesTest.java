package tests.d4_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;

public class ReadAttributesTest {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input= driver.findElement(By.name("email"));
        System.out.println(input.getAttribute("pattern"));//to read value of any attribute, email it's valur attribute
        input.sendKeys("random@email.com");
        System.out.println(input.getAttribute("value"));
        WebElement retrivePasswordButton=driver.findElement(By.id("form_submit"));
        retrivePasswordButton.submit();


        driver.close();
}}




