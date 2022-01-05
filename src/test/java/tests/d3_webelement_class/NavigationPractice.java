package tests.d3_webelement_class;

import org.openqa.selenium.WebDriver;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtilities;

public class NavigationPractice {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://google.com");

        BrowserUtilities.wait(3);

        System.out.println(driver.getTitle());

        driver.navigate().to("http://amazon.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.quit();


    }
}
