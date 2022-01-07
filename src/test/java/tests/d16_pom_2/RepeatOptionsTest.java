package tests.d16_pom_2;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalendarEventsPage;
import pages.CreateCalenderEventsPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilitis.BrowserUtilities;
import utilitis.ConfigurationReader;
import utilitis.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatOptionsTest extends TestBase {

    @Test
    public void verifyRadioButtons(){
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        // waiting untill the page load completes
        //calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtilities.waitFor(5);
        calendarEventsPage.createCalendarEvent.click();
       // click on repeat
        CreateCalenderEventsPage createCalenderEventsPage=new CreateCalenderEventsPage();
        createCalenderEventsPage.repeat.click();
        // verify that repeat every day is selected
        Assert.assertTrue(createCalenderEventsPage.days.isSelected(),"Repeat Every day(s) should be selected");
        Assert.assertFalse(createCalenderEventsPage.weekday.isSelected(),"Weekdays should not be selected");

    }
    @Test
    public void verifyRepeatOptions(){
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        // waiting untill the page load completes
        //calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtilities.waitFor(5);
        calendarEventsPage.createCalendarEvent.click();
        // click on repeat
        CreateCalenderEventsPage createCalenderEventsPage=new CreateCalenderEventsPage();
        createCalenderEventsPage.repeat.click();

        List<String> expectedList= Arrays.asList("Daily","Weekly","Monthly","Yearly");

        List<WebElement> options=createCalenderEventsPage.repeatOptionsList().getOptions();

        List<String> actualList=BrowserUtilities.getElementsText(options);

        Assert.assertEquals(actualList,expectedList);


    }


}
