package tests.d9_tabs_frams_alerts_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

import java.util.Set;

public class MultipleWindows {

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
    public void switchWindows() {
        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("Before new window is opened " + driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("After new window is opened " + driver.getTitle());

        //driver.switchTo().window("New Window");

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println("currentWindowHandle= " + currentWindowHandle);

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {//iterate the set of handles and compare to the current handle
            System.out.println(windowHandle);
            if (!currentWindowHandle.equals(windowHandle)) {//if the handle is not equal to the current than it is the handle of the new window
                driver.switchTo().window(windowHandle);//switch to new window by passing the its handle
            }
        }
        System.out.println("After switching " + driver.getTitle());

    }
   @Test
    public void changeByTitle(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targetTitle="New Window";
        driver.findElement(By.linkText("Click Here")).click();

       System.out.println(driver.getWindowHandles().size());

       for (String handle : driver.getWindowHandles()) {
           driver.switchTo().window(handle);
           if(driver.getTitle().equals(targetTitle)){
               break;
           }
       }
       System.out.println(driver.getTitle());

   }
}
