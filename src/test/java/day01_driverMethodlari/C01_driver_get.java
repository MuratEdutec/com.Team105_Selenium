package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {

    public static void main(String[] args) {

    System.setProperty("webdriver.com.driver","src/drivers/chromedriver.exe");
    //windows olanlar sonunda.exe yazmali, mac'de buna gerek yok

        WebDriver driver=new ChromeDriver();

        //driver.get("https://amazon.com");
        driver.get("https://www.hod-360.nl/login");


    }
}
