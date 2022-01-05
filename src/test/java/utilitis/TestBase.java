package utilitis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected String url;
    Actions actions;

    @BeforeMethod
    public void setUpMethod() {
        driver=Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url=ConfigurationReader.get("url");
        driver.get(url);
        actions=new Actions(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }
}