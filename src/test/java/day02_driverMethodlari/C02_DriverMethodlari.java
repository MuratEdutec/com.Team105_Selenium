package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.driver.com","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        System.out.println("maximize window boyutlari"+driver.manage().window().getSize());
        System.out.println("maximize window konum"+driver.manage().window().getPosition());




        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("full screen window boyutlari"+driver.manage().window().getSize());
        Thread.sleep(3000);


        driver.close();

    }
}
