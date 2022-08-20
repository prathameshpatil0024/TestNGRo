package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
    }
    @Test
    public void test1(){
        SoftAssert softAssert =new SoftAssert() ;
        driver.get("https://www.instagram.com/");
       softAssert.assertEquals(driver.getTitle(),"Instagram","title should instagram");
       softAssert.assertEquals(driver.findElement(By.name("//input[@name='username']")).getText(),"username","the text shold be username");
       softAssert.assertEquals(driver.findElement(By.name("//input[@name='password']")).getText(),"password","the text should be password");
       softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver .close();

    }
}


