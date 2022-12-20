package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://amazon.com");
        // get ile ayni islemi yapar

        Thread.sleep(2000);
        driver.get("https://wisequarter.com");
        Thread.sleep(3000);

        // yeniden amazon'a donelim
        driver.navigate().back();

        // tekrar wisequarter.com'a gitmek istersek
        Thread.sleep(2000);
        driver.navigate().forward();




        driver.quit();

    }
}
