package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.driver.com","src/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        //sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        System.out.println("maximize window boyutlari"+driver.manage().window().getSize());
        System.out.println("maximize window konum"+driver.manage().window().getPosition());




        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("full screen window boyutlari"+driver.manage().window().getSize());


        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));

        Thread.sleep(3000);
        driver.close();



    }
}
