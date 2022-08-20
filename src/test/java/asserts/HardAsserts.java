package asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAsserts {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        driver.get("https://www.instagram.com");
        Assert.assertEquals(driver.getTitle(), "Instagram", "title should be instagram");
        Assert.assertEquals("facebook", "instagram");
        System.out.println("social media");

    }@Test
    public void test2(){
        Assert.assertTrue(true);
        Assert.assertEquals("Welcome","Welcome");
        System.out.println("digital partner  class");


    }@AfterMethod
    public void afterMethod(){
        driver .close();
    }
}
