package tests.d12_review;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class TestCase6FromHomeWork {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        actions=new Actions(driver);
        driver.get("https://www.google.com/");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void googleSearch() throws InterruptedException {
        WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        element.sendKeys("wooden spoon"+ Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.id("result-stats")).isDisplayed());
        driver.navigate().back();
        WebElement input=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        input.sendKeys("book"+Keys.ENTER);









    }

}
