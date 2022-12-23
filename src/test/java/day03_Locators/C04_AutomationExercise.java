package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_AutomationExercise {
    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");


        // 3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkListesi= driver.findElements(By.tagName("a"));
        if (linkListesi.size()==147){
            System.out.println("Link listesi testi PASSED");
        }else{
            System.out.println("Sayfada " + linkListesi.size() + " adet link var, test FAILED");

        }


        // 4- Products linkine tiklayin
        driver.findElement(By.partialLinkText(" Products")).click();


        // 5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));
        if(specialOfferElementi.isDisplayed()){
            System.out.println("Special Offer Testi PASSED");

        }else
        System.out.println("Special Offer Testi FAILED");


        // 6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();

    }
}
