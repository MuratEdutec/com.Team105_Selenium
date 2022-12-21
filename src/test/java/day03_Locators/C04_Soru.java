package day03_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Soru {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Sayfada 147 adet link bulundugunu test edin.
        4- Products linkine tiklayin
        5- special offer yazisinin gorundugunu test edin
         6- Sayfayi kapatin
         */

            driver.get("https://www.automationexercise.com/");

















        Thread.sleep(3000);
        driver.close();




    }
}
