package tests.d7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class AnotherRadioButtonsTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement basketball= driver.findElement(By.id("basketball"));
        WebElement football= driver.findElement(By.id("football"));

         //
        // basketball.isSelected();
        //Assert.assertFalse(basketball.isSelected());





    }

}
