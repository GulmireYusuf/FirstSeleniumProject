package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class LoginPage {

    public LoginPage(){   //constrauctor here// every page object model class must have this method
        PageFactory.initElements(Driver.get(),this);//we need pagefactory class and initElement method to initializie object.
    }

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name ="_submit")
    public WebElement loginButton;



    public void login(String userNameStr, String passwordStr){
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginButton.click();
    }

}
