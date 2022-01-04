package tests.d8_select_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

import java.util.List;

public class DropdownListNoslectTagTest {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownlink= driver.findElement(By.id("dropdownMenuLink"));
        dropdownlink.click();

        List<WebElement> options=driver.findElements(By.className("dropdown-item"));
        System.out.println("options.g = "+options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());

        }
        driver.findElement(By.linkText("Yahoo")).click();

    }
}
