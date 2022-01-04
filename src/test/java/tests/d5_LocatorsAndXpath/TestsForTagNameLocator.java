package tests.d5_LocatorsAndXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtils;

public class TestsForTagNameLocator {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        BrowserUtils.wait(2);

        driver.findElement(By.name("full_name")).sendKeys("mila");
        BrowserUtils.wait(2);
        driver.findElement(By.name("email")).sendKeys("mila@email.com");

        BrowserUtils.wait(2);
        driver.findElement(By.name("wooden_spoon")).click();

        WebElement result= driver.findElement(By.tagName("h3"));
        System.out.println(result.getText());
        BrowserUtils.wait(2);
        driver.quit();


    }
}
