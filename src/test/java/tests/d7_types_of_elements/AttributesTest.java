package tests.d7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class AttributesTest {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue= driver.findElement(By.id("blue"));

        System.out.println(blue.getAttribute("name"));

        System.out.println(blue.getAttribute("id"));

        System.out.println(blue.getAttribute("value"));
        System.out.println(blue.getAttribute("innerHTML"));




    }
}