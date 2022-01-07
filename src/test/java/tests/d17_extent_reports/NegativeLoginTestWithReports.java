package tests.d17_extent_reports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilitis.TestBase;

public class NegativeLoginTestWithReports extends TestBase {

    @Test
    public void wrongPasswordTest(){
        //if we don't add extentLogger=report.createTest, this test will not be in the html report
        extentLogger= reports.createTest("wrong password test");
        LoginPage loginPage=new LoginPage();
        extentLogger.info("Enter username:salesmanager101");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter password: password");
        loginPage.password.sendKeys("password");
        extentLogger.info("click login button");
        loginPage.loginButton.click();
        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vytrack.com/user/login");
        extentLogger.pass("PASS: wrong password test");
    }
    @Test
    public void wrongUsernameTest(){
        extentLogger= reports.createTest("wrong username test");
        LoginPage loginPage=new LoginPage();
        extentLogger.info("Enter username:salesmanager101");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter password: password");
        loginPage.password.sendKeys("password");
        extentLogger.info("click login button");
        loginPage.loginButton.click();
        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(),"https://google.com");
        extentLogger.pass("PASS: wrong username test");
    }


}
