package tests.d7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class CheckboxTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox= driver.findElement(By.id("box1"));
        WebElement checkbox2= driver.findElement(By.id("box2"));

        System.out.println("Is checkbox selected: "+checkbox.isSelected());
        System.out.println("Is checkbox2 selected: "+checkbox2.isSelected());

        Assert.assertFalse(checkbox.isSelected());
        Assert.assertTrue(checkbox2.isSelected());

        System.out.println("check the first one");
        checkbox.click();

        System.out.println("Is checkbox selected: "+checkbox.isSelected());
        System.out.println("Is checkbox2 selected: "+checkbox2.isSelected());

        // verify that one is selected
        Assert.assertTrue(checkbox.isSelected());
        Assert.assertTrue(checkbox2.isSelected());



    }


}
