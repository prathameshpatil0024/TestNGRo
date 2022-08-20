package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class DateDemo {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        String date = "24";
        String month = "august";
        String year = "2022";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        String setmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        String setyr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

        if (setmonth.equals(month) && setyr.equals(year)) {
            List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
            for (WebElement t : allDate) {
                if (t.getText().equals(date)) ;
                t.click();
                break;
            }
        }  driver.close();
    }

}




//       driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tbody//tr[3]/td[4]")).click();


