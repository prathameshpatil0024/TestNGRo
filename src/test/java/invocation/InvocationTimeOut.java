package invocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationTimeOut {
    WebDriver driver;
    /** invocation timeout used When execution of test method takes time beyond the timeout duration.time out set as
     milliseconds. After that duration the test method not execute then marked as failed.**/

    @Test(invocationTimeOut = 200,invocationCount = 100)
    public void example1(){
        System.out.println("open the facebook");
    }
    @Test(invocationTimeOut =5000)
    public void example2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/ ");
        driver.close();
    }

    }


