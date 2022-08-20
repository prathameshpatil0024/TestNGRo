package selenium;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

    public class Date {
        public static WebDriver driver;

        public static void selectCities(String city, String sourceorDestination){

            List <WebElement> listofCities;

            if (sourceorDestination.equals("source")){
                driver.findElement(By.name("boarding_from")).sendKeys(city);
                listofCities = driver.findElements(By.xpath("//ul[@id='ui-id-5']//child::li"));
            }else {
                driver.findElement(By.name("boarding_to")).sendKeys(city);
                listofCities = driver.findElements(By.xpath("//ul[@id='ui-id-6']//child::li"));
            }
            for(WebElement c: listofCities){
                if (c.getText().equals(city)){
                    c.click();
                    break;
                }
            }

        }

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver= new ChromeDriver();
            driver.get("https://www.railyatri.in/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            selectCities("C SHAHU M RAJ KOLHAPUR TERM | KOP", "boarding_from");
            selectCities("MUMBAI CENTRAL | MMCT", "boarding_to");

            String selDate= "3";
            String selMonth = "August";
            String selYear = "2022";

            driver.findElement(By.id("datepicker_train")).click();
            String limonth = driver.findElement(By.xpath("(//table[@class='table-condensed'])[1]//child::tbody//tr//td")).getText();
            String liofYear= driver.findElement(By.xpath("(//table[@class='table-condensed'])[2]//child::tbody//tr//td")).getText();

            if ( limonth.equals(selMonth) && liofYear.equals(selYear)){
                List<WebElement> allDate= driver.findElements(By.xpath("//table[@class=' table-condensed']//child::tbody//tr//td"));
                for(WebElement date: allDate){
                    if(date.getText().equals(selDate)){
                        date.click();
                        break;
                    }
                }
            }

            driver.close();

        }
    }

