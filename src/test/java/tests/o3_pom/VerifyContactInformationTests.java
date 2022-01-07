package tests.o3_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactInformationPage;
import pages.ContactsPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilitis.BrowserUtilities;
import utilitis.ConfigurationReader;
import utilitis.Driver;
import utilitis.TestBase;

public class VerifyContactInformationTests extends TestBase {

    @Test
    public void contactInformationTest() throws InterruptedException {
        extentLogger=reports.createTest("Contact detalis test");
        extentLogger.info("login");
        LoginPage loginPage=new LoginPage();
        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");
        extentLogger.info("username: "+username);
        extentLogger.info("password: "+password);
        loginPage.login(username,password);

        extentLogger.info("Go to customer->contacts");
        ContactsPage contactsPage=new ContactsPage();
        contactsPage.navigateToModule("Customers","Contacts");

        extentLogger.info("click on email johnsmith@gmail.com");
        contactsPage.waitUntilLoaderScreenDisappear();
        contactsPage.getContactEmail("").click();

        ContactInformationPage contactInformationPage=new ContactInformationPage();
        extentLogger.info("Verify that full time is Dana Kraljica");
        String actualName=contactInformationPage.contactFullName.getText();
        Assert.assertEquals("Dana Kraljica",actualName);
        extentLogger.info("verify that phone number is ");

        String actualPhone=contactInformationPage.phone.getText();
        Assert.assertEquals(actualPhone,"N/A");

        String actuaEmail=contactInformationPage.email.getText();
        Assert.assertEquals(actuaEmail,"");












    }
}
