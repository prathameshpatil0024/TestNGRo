package extendreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class Test {
    public static WebDriver driver;
        ExtentReports reports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("class.html");
        ExtentTest test;

    @BeforeTest
    public void beforeTest() {
        reports.attachReporter(sparkReporter);
    }}

//    @org.testng.annotations.TestEx

