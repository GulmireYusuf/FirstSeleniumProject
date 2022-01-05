package tests.d15_page_object_model_based_test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilitis.ConfigurationReader;
import utilitis.TestBase;

public class NegativeLoginTest extends TestBase {

    @Test
    public void wrongPasswordTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.password.sendKeys("password");
        loginPage.loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vytrack.com/user/login");
    }

    @Test
    public void wrongUsernameTest(){
        LoginPage loginpage=new LoginPage();
        loginpage.userName.sendKeys("alo");
        loginpage.password.sendKeys("UserUser123");
        loginpage.loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vytrack.com/user/login");


    }




}
