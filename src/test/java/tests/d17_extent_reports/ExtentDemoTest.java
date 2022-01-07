package tests.d17_extent_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentDemoTest {

    ExtentReports report;
    ExtentHtmlReporter htmlReporter;
    ExtentTest extentLogger;

    @BeforeMethod
    public void setUp() {
        report = new ExtentReports();
        String path = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("TC001 Vytrack smoke tests");
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("browser", "chrome");
    }
        @Test
        public void test1(){
          extentLogger=report.createTest("Login as driver test");
          extentLogger.info("open chrome");
            extentLogger.info("go to url");
            extentLogger.info("enter driver login info");
            extentLogger.info("click submit");
            extentLogger.info("click verify logged in");
            extentLogger.pass("TC001 passed");



        }
        @AfterMethod
        public void close(){
            report.flush();
        }



    }




