package listners;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerExample.class)

public class Reports {
 public static WebDriver driver;
 ExtentReports reports = new ExtentReports();
 ExtentSparkReporter sparkReporter = new ExtentSparkReporter("evening.html");
 ExtentTest test;

 @BeforeTest
 public void beforeTest() {
  reports.attachReporter(sparkReporter);
 }

 @Test
 public void method1() {
  test = reports.createTest("launch the youtube").assignAuthor("shivaji").assignDevice("edge");
  test.info("user open the youtube ");
  System.out.println("method1");
  Assert.assertTrue(true);
  test.pass("test is pass");
 }

 @Test
 public void method2() {
  test = reports.createTest("launch the youtube").assignAuthor("suraj").assignDevice("firefox");
  test.info("user open the youtube ");
  System.out.println("method2");
  Assert.assertFalse(false) ;
  test.fail("this test is fail") ;

 }
 @Test
 public void method3(){
  test=reports.createTest("launch the youtube").assignAuthor("rushi").assignDevice("chrome");
  test.info("user open the youtube ");
  System.out.println("method3");
  test.fail("this test is fail");
  Assert.assertTrue(false) ;
}
@Test
 public void method4(){
  test=reports.createTest("launch the browser").assignAuthor("manthan").assignDevice("safari");
  test.info("user is open browser");
  System.out.println("method4");
 test.skip("this test is skip") ;
  Assert.assertTrue(false) ;
 }
@AfterTest
 public void reportingClosed(){
 reports.flush();
 }
}
