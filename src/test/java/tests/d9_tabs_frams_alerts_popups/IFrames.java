package tests.d9_tabs_frams_alerts_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class IFrames {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/tinymce");
        Thread.sleep(1000);
        driver.switchTo().frame("mce_0_ifr");//switch to frame
        driver.findElement(By.id("tinymce")).sendKeys("hello");

        driver.switchTo().defaultContent();//go back to first frame,useful when we have switched multiple frames

        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).sendKeys("hello");

        driver.switchTo().parentFrame();

        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Finish");
    }
        @Test
        public void manyFrames(){
            driver.get("http://practice.cybertekschool.com/nested_frames");
            driver.switchTo().frame("frame-top");
            System.out.println(driver.getTitle());

            driver.switchTo().frame("frame-middle");

            driver.switchTo().parentFrame();
            driver.switchTo().frame("frame-right");


        }





    }

