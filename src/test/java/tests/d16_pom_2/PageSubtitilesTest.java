package tests.d16_pom_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utilitis.ConfigurationReader;
import utilitis.TestBase;

public class PageSubtitilesTest extends TestBase {

    @Test
    public void VerifySubTitleTest(){
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

        DashboardPage dashboardPage=new DashboardPage();
        String actual=dashboardPage.getPageSubTitle();
         // get the subtitle
        Assert.assertEquals(actual,"Quick Launchpad");
        // changing pages
        dashboardPage.navigateToModule("Activities","Calendar Events");
        // get the subtitle of the new page
        actual= dashboardPage.getPageSubTitle();
        Assert.assertEquals(actual,"Calendar Events");

    }

}
