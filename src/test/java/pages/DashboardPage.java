package pages;

import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class DashboardPage extends BasePage {
    //no need to explicitly write constructors, because it will use its parents constructor
    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);            // --> we don't need this  here
    }


}
