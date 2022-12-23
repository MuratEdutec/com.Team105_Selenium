package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class C02_ByClassName {

    public static void main(String[] args) throws InterruptedException {


        // amazon a gidip nutella icin arama yapin
        // ilk sayfada cikan urunlerin icerisinde
        // en yuksek fiyati bulun


        System.setProperty("webdriver.chrome.drive","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.get("http://www.amazon.com");

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        List<WebElement> fiyatlarListesi= driver.findElements(By.className("a-price-whole"));

        System.out.println(fiyatlarListesi);


        /**
         * Bunun icin for-each loop kullanarak
         * her bir webelement uzerindeki yazilari tek tek yazdirmaliyiz
         */

 /*        for (WebElement each: fiyatlarListesi
             ) {
            System.out.print(each.getText()+" ");
                    }
*/


        /*en yuksek fıyatı bulabılmek ıcın java bılgımızı kullanmalıyız.
            1 - web elementlerden getText ıle fıyatı strıng olarak alın
            2- Strıng fiyatı kıyaslama yapabılmek için Integer'a çevirin
            3- en yuksek fıyatı bulup yazdırın*/


        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat =0;

        for (WebElement each: fiyatlarListesi
        ) {
            fiyatStr=each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);

            if (fiyatInt > enYuksekFiyat){
                enYuksekFiyat=fiyatInt;
            }

        }

        System.out.println(" ");
        System.out.println("En yuksek urun fiyati :" + enYuksekFiyat);
        Thread.sleep(3000);
        driver.close();


    }
}
