package tests.d3_webelement_class;

import org.openqa.selenium.WebDriver;
import utilitis.WebDriverFactory;

public class browserFactoryTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://cybertekschool.com");
        System.out.println(driver.getPageSource());//how we can print a source of the page
        driver.quit();
    }
}
