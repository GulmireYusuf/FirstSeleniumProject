package tests.d5_LocatorsAndXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtils;

public class TestsForIdLocators {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        BrowserUtils.wait(2);
        WebElement disapearButton= driver.findElement(By.id("disappearing_button"));
        disapearButton.click();

        WebElement result=driver.findElement(By.id("result"));
        System.out.println(result.getText());

        driver.quit();
    }


}
