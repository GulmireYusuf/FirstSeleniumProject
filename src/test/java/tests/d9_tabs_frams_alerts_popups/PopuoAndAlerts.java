package tests.d9_tabs_frams_alerts_popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

public class PopuoAndAlerts {
    WebDriver driver;

    @BeforeMethod
      public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);

    }
    @Test
    public void htmlPopup(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=dfd0d");
        driver.findElement(By.xpath("//span[.='Confirm']")).click();
        driver.findElement(By.xpath("//span[.='No']")).click();
    }

    @Test
    public void jsAlerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[1]")).click();

        Alert alert=driver.switchTo().alert();//create object from alert class then switch to the new alert
        alert.accept();// clicking ok in alerts

        driver.findElement(By.xpath("//button[2]")).click();
        alert=driver.switchTo().alert();//switch to the new alert
        alert.dismiss();//close the alert

        driver.findElement(By.xpath("//button[3]")).click();
        alert=driver.switchTo().alert();//switch to the new alert
        Thread.sleep(1000);
        alert.sendKeys("red alert");//send keys to alert
        Thread.sleep(1000);

        System.out.println(alert.getText());
        alert.accept();//close the alert



    }
}
