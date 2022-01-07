package utilitis;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected String url;
    Actions actions;

    protected ExtentReports reports;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest(){
        reports=new ExtentReports();
        String path=System.getProperty("user.dir")+"/test-output/report.html";
        htmlReporter=new ExtentHtmlReporter(path);
        reports.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Regression tests");

        reports.setSystemInfo("Environment","QA");
        reports.setSystemInfo("Browser",ConfigurationReader.get("browser"));
        reports.setSystemInfo("OS",System.getProperty("os.name"));
    }
    @AfterTest
    public void teardownTest(){
        reports.flush();
    }
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
    public void teardownMethod(ITestResult result) throws InterruptedException, IOException {
        // if failed take screenshot
        if(result.getStatus()==ITestResult.FAILURE){
            //record the name of the failed testcase
            extentLogger.fail(result.getName());
            // take screenshot and return location of the screenshot
            String screenshot=BrowserUtilities.getScreenshot(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshot);
            // capture the exception
            extentLogger.fail(result.getThrowable());
        }else if (result.getStatus()==ITestResult.SKIP){
            //sometimes tests are skipped,this is how we log skipped tests
            extentLogger.skip("Test Skipped"+result.getName());
        }
        //close browser
        Thread.sleep(1000);
        Driver.closeDriver();
    }
}