package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {


        //amazon ana sayfaya gidin
        // gift cards linkini tiklayin
        // gift cards sayfasina gittigini test edin

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));


        driver.get("https://www.amazon.com");

        Thread.sleep(5000);


        WebElement giftCardLinki= driver.findElement(By.partialLinkText("Gift"));
        giftCardLinki.click();

        // istenen sayfaya gittigini test etmek icin
        // title'in Gift Card icerdigini test edebiliriz


        String expectedKelime="Gift Cards";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedKelime)){
            System.out.println("Gift Card testi PASSES");
        }else {
            System.out.println("Gift Card testi FAILED");

        }















        Thread.sleep(3000);
        driver.close();


    }
}
