package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        // Biz browser'lari olusturdugumuz druver sayesinde otomate edebiliyoruz
        // Bunun icin  her testin basinda mutlaka driver objesi olusturacagiz

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        // acilan sayfanin basliginin amazon icerdigini test edin

        String expectedKelime="amazon";
        String actualResul=driver.getTitle();

        if(actualResul.contains(expectedKelime)){
            System.out.println("Title testi passed");
        } else {
            System.out.println("Titel amazon icermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }

        // gittigimiz sayfanin URL;inin   oldugunu test edin
        String expectedURL="https://www.amazon.com/";
        String actualURL=driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("Url testi passed");
        }else{
            System.out.println("Url istediginiz degerde degil");
            System.out.println(driver.getCurrentUrl());
        }


        Thread.sleep(5000);
        driver.close();



    }
}
