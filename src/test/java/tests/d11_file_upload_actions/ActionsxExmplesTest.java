package tests.d11_file_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class ActionsxExmplesTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
     @Test
    public void HoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
         WebElement img1= driver.findElement(By.tagName("img"));

         Actions actions=new Actions(driver);
         Thread.sleep(2000);
         actions.moveToElement(img1).perform();//perform complete the actions

         Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());
    }

    @Test
    public void dragdroptest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droptarget"));

        Actions action=new Actions(driver);
        Thread.sleep(2000);
        action.dragAndDrop(source,target).perform();

    }
    @Test
    public void dragdropbychaningtest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droptarget"));

        Actions action=new Actions(driver);
        Thread.sleep(2000);
        //build is used to chain the actions
        action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();

    }
}
