package tests.d8_select_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

import java.util.List;

public class SelectClassTest {
    @Test
    public void printAllOptions(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement element= driver.findElement(By.id("state"));
        Select stateList=new Select(element);

        stateList.getOptions();//returns all the available options from the dropdown list
        List<WebElement> options=stateList.getOptions();
        System.out.println(options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());

        }
    }
    @Test
    public void selectAndVerifySelected() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

       Select stateList=new Select(driver.findElement(By.id("state")));
       stateList.getFirstSelectedOption();//returns what is currently selected,return webelement

        String actualSelection=stateList.getFirstSelectedOption().getText();

        System.out.println("actualSelection = "+actualSelection);
        Assert.assertEquals(actualSelection,"Select a State");

        Thread.sleep(1000);

        stateList.selectByVisibleText("Alaska");

        actualSelection=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,"Alaska");

        stateList.selectByIndex(51);
        actualSelection=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,"Wyoming");

        Thread.sleep(1000);
        stateList.selectByValue("DC");
        actualSelection=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,"District Of Columbia");
    }

}

