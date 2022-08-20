package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String date="24";
        String month="august";
        String year="2022";

        driver.findElement(By.id("onward_cal")).click();

        List<WebElement> alldate=driver.findElements(By.xpath("//table[@class=='rb-monthTable first last']//tbody//tr[3]/td[4]"));
        for(WebElement tr:alldate){
            tr.getText().equals(date);
            break;

        }Thread.sleep(3000);
        driver.close();
    }
}
