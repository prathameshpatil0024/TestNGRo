package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static WebDriver driver;
    public static  void SelectMonthAndYear(String monthorYear,String mmyy) {
        List<WebElement> listOfMonthAndYear = null;
        if (monthorYear.equals("selMonth")) {
            listOfMonthAndYear = driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));
        } else if (monthorYear.equals("selYear")) {
            listOfMonthAndYear = driver.findElements(By.xpath("//span[@class='ui-datepicker-year']"));
        } else{
            System.out.println("please select correct motnth or year");
    }for(WebElement element:listOfMonthAndYear ){
            if(element.getText().equals(mmyy)){
                element.click();
            }
        }

    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        String selDate = "3";
        String selMonth = "August";
        String selYear = "2022";

        driver.findElement(By.id("datepicker1")).click();

        SelectMonthAndYear("month",selMonth);
        SelectMonthAndYear("year",selYear);

        List<WebElement> allDate = driver.findElements(By.xpath("///table[@class='ui-datepicker-calendar']//child::tbody/tr/td"));
            for (WebElement date : allDate) {
                if (date.getText().equals(selDate)) {
                    date.click();
                    break;
                }
            }Thread.sleep(2000);
            driver.close();

        }
    }



