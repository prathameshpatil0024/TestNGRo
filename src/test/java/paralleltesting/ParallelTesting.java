package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ParallelTesting {
    public static WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

    }
   @Test
    public void method1() {
        driver.get("https://in.bookmyshow.com/ ") ;
        System.out.println("method1");
    }
    @Test
    public void method2(){
        driver.get("https://www.facebook.com/") ;
        System.out.println("click to log in");
    }
   @Test
    public void method3() {
        driver.get("https://www.youtube.com/");
        System.out.println("play the song");
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
