package tests.d5_LocatorsAndXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtilities;

public class TestsForNameLocator {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        BrowserUtilities.wait(2);

        driver.findElement(By.name("full_name")).sendKeys("mila");
        BrowserUtilities.wait(2);
        driver.findElement(By.name("email")).sendKeys("mila@email.com");

        BrowserUtilities.wait(2);
        driver.findElement(By.name("wooden_spoon")).click();

        BrowserUtilities.wait(2);
        WebElement result= driver.findElement(By.name("signup_message"));
        System.out.println(result.getText());
        BrowserUtilities.wait(2);
        driver.quit();

    }
}
