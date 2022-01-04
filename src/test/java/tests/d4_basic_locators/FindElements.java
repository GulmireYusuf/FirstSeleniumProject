package tests.d4_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtils;

public class FindElements {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedTile=driver.getTitle();//once we open the page we have to capture a title
        WebElement button= driver.findElement(By.id("form_submit"));
        button.click();
        BrowserUtils.wait(2);
        String actualTile=driver.getTitle();//read title again after click.
        if(actualTile.equals(expectedTile)){//in this way,we making sure that after clicking  we stay on the same page
            System.out.println("Test passes");
        }else{
            System.out.println("Test failed");
            System.out.println("Expected title: "+expectedTile);
            System.out.println("Actual Tile: "+actualTile);

        }
        BrowserUtils.wait(2);
        driver.close();

    }
}
