package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name ="_submit")
    public WebElement loginButton;

}
