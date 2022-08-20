package testing;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("hhttps://www.youtube.com//");
        driver.manage().window().maximize();

//        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//        driver.findElement(By.id("btnLogin")).click();
//
//        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

          driver.close();

    }
}
