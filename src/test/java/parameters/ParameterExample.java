package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethod(String browserName) {
        if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equals("firefox")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
            driver=new FirefoxDriver();
       }else {
            System.out.println("please select correct browser");
        } driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }
    @Parameters({"name","model"})
    @Test
    public void verifyParameter(String name,String model){
        WebElement element=driver.findElement(By.name("field-keywords"));
        element.sendKeys(name+" " +model);
        element.sendKeys(Keys.ENTER );
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
