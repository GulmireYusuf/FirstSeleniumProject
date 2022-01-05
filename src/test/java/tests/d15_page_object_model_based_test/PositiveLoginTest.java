package tests.d15_page_object_model_based_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilitis.TestBase;

public class PositiveLoginTest extends TestBase {
    @Test
    public void loginAsDriver(){

        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("user1");
        loginPage.password.sendKeys("UserUser123");
        loginPage.loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vytrack.com/");

    }
    @Test
    public void loginAsStoreManager(){
        LoginPage loginPage=new LoginPage();
        loginPage.login("user1","UserUser123");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vytrack.com/user/login");
    }
    @Test
    public void verifyCalenderEventPage(){
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("user1");
        loginPage.password.sendKeys("UserUser123");
        loginPage.loginButton.click();

        Assert.assertEquals(driver.getTitle(),"Quick Launchpad");

    }


}
