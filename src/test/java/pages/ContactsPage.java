package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilitis.Driver;

public class ContactsPage extends BasePage {
    // this only finds one email.it does not finding others.
   // @FindBy(xpath="//*[contains(text(),'mm@gmail.com')][@data-column-label='Email']")
    //WebElement email;

    //@FindBy(xpath = "//*[contains(text(),'arumi@gmail.com')][@data-column-label='Email']")
    //WebElement email2;

    public WebElement getContactEmail(String email){
        String xpath="//*[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }






}
