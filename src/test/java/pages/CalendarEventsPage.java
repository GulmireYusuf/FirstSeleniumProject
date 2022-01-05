package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class CalendarEventsPage extends BasePage {

    @FindBy(css="[title='Create Calendar event']")
    public WebElement createCalendarEvent;
    }

