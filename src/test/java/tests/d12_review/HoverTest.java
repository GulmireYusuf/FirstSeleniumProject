package tests.d12_review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class HoverTest {
    // creating new variables
    // open browser
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        actions=new Actions(driver);
        driver.get("http://practice.cybertekschool.com/hovers");


    }

    @Test
    public void test(){

        for (int i = 0; i < 3; i++) {
            System.out.println(i);

            WebElement img=driver.findElement(By.tagName("img"));

            actions.moveToElement(img).perform();
            actions.pause(2000);// this is like aclling thread.sleep

            WebElement text=driver.findElement(By.xpath("//h5[.='name: user1']"));

            Assert.assertTrue(text.isDisplayed());
            System.out.println(text.getText());

        }
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}


