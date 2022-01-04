package tests.d7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class RadioButtonsTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue= driver.findElement(By.id("blue"));
        WebElement red= driver.findElement(By.id("red"));

        System.out.println("is blue selected: "+blue.isSelected());
        System.out.println("is red selected: "+red.isSelected());

        Assert.assertTrue(blue.isSelected());// verify blue is selected
        Assert.assertFalse(red.isSelected());// verify red is not selected



    }
}
