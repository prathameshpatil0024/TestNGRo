package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Parameter1 {
   public static  WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }@Test
    public void verifyParameter(){
        String name="realme";
        String model="narzo";
        WebElement element=driver.findElement(By.name("field-keywords"));
        element.sendKeys(name+" "+model);
        element.sendKeys(Keys.ENTER );
    }@AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
