package asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        SoftAssert softAssert =new SoftAssert() ;
        driver.get("https://www.instagram.com/");
        softAssert.assertEquals(driver.getTitle(), "Instagram","title should be instagram");
        softAssert.assertEquals("facebook","instagram");
        System.out.println("social media");
        softAssert.assertAll();

    }@Test
    public void test2(){
        SoftAssert softAssert =new SoftAssert() ;
        softAssert.assertFalse(false) ;
        softAssert.assertNotSame("Welcome","Welcome");
        System.out.println("digital partner");
        softAssert.assertAll();

    }@AfterMethod
    public void afterMethod(){
        driver .close();
    }
}


