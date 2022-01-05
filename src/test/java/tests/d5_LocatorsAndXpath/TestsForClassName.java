package tests.d5_LocatorsAndXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtilities;

public class TestsForClassName {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        BrowserUtilities.wait(2);
        WebElement heading=driver.findElement(By.className("h3"));
        System.out.println(heading.getText());
        BrowserUtilities.wait(2);
        driver.quit();

    }
}
