package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandle {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://Ramazon.com");

        System.out.println(driver.getWindowHandle());

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wisequarter.com");
        System.out.println(driver.getWindowHandle());
        Thread.sleep(2000);
        driver.quit();


    }
}
