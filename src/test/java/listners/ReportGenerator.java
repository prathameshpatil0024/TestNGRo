package listners;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(ListnerExample.class)
public class ReportGenerator {
    public static WebDriver driver;
    /** extent report is tool used for the generate the report and share the report.
     In the report ,fail test case,pass test case,skip test are shown.
     **/
    // this is used for generate the file using method in extend report tool
    ExtentReports reports =new ExtentReports();

    //this is used for to generate the file where actual report are store.
    ExtentSparkReporter sparkReporter =new ExtentSparkReporter("prathamesh.html");

    //this is used for capture the all evevnt in the method.
    ExtentTest test;

    @BeforeTest
    public void beforeTest(){
        reports.attachReporter(sparkReporter);
    }
    @Test
    public void test1(){
        test= reports.createTest("launch dream 11").assignAuthor("prathamesh").assignDevice("chrome").assignCategory("bating");
        test.info("open dream11 app") ;
        System.out.println("playing cricket");
        Assert.assertTrue(true);
        test.pass("this test is pass");
    }
    @Test
    public void test2(){
        test= reports.createTest("launch dream 11").assignAuthor("vijay").assignCategory("bating" ).assignDevice("firefox");
        test.info("open dream11 app");
        System.out.println("playing football");
        test.fail("this test is fail");
        Assert.assertTrue(false );
    }
    @Test
    public void test3(){
        test= reports.createTest("launch dream 11").assignAuthor("uday").assignCategory("bating" ).assignDevice("opera mini");
        test.info("open dream11 app") ;
        System.out.println("Both the game are popular");
        test.pass("this test is fail");
        Assert.assertFalse(true);
    }
    @Test
    public void test4(){
        test=reports.createTest("launch dream 11").assignAuthor("rushi").assignCategory("bating" ).assignDevice("safari");
        test.info("open dream11 app") ;
        System.out.println("But hockey is the national game in india");
        test.skip("this test is skip") ;
        Assert.assertFalse(false);
    }
    @AfterMethod
    public void reportClose(){
        reports.flush();
    }
    }


