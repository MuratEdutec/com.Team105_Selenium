package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver_Get {

    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.com.driver","src/drivers/chromedriver");
    //windows olanlar sonunda.exe yazmali, mac'de buna gerek yok

        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");
        Thread.sleep(5000);
        driver.close();
        //driver.get("https://www.hod-360.nl/login");

        /*
        1- Selenium jar dosyalarini ve chrome driver'ini manuel olarak sisteme tanitmis olduk.

        Eger firefox veya safari ile calismamiz gerekirse,
        bu defa da onlarin driverlar'ini indirip, manuel olarak
        10.satirda  o driver'lari tanimlamaliyiz

        2- 13.satirda ChromeDriver() constructor'ini kullanarak bir obre olusturduk
        bu  objeyi kullanamasak bile
        bu satirdan dolayi bos bir browser acilir

        3- driver.get(url) driver'i yazdigimizda url'e goturur
        url yazarken www yazmazsak calisir
        ancak https:// yazmazsak method calismaz


         */
    }
}
