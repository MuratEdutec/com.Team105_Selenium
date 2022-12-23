package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeSelector {
    public static void main(String[] args) {

    //    1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
    //    2 ) Berlin’i 3 farkli relative locator ile locate edin
    //    3 ) Relative locator’larin dogru calistigini test edin

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //    1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement sailorElementi= driver.findElement(By.xpath("//p[text()='Sailor']"));
        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElementi));

//    2 ) Berlin’i 3 farkli relative locator ile locate edin

        // Above -->>>  SAILOR====
        // id'si pid7_thumb

        String expectedIdDegeri= "pid7_thumb";

        String actualIdDegeri= berlin1.getAttribute("Id");


        if (expectedIdDegeri.equals(actualIdDegeri)){
            System.out.println("Above Sailor " + "Relative locater testi => PASSED");
        }else{
            System.out.println("Above Sailor " + "Relative locater testi FAILED<=");
        }

        //driver.close();

        // Right Of -->>>  BOSTON====
        //pid6_thumb

        WebElement bostonElementi= driver.findElement(By.xpath("//p[text()='Boston']"));


        WebElement berlin2= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElementi));

        String expectedIdDegeri2= "pid6_thumb";
        String actualIdDegeri2= berlin2.getAttribute("Id");

        if (expectedIdDegeri.equals(actualIdDegeri)){
            System.out.println("Above Boston " + "Relative locater testi => PASSED");
        }else{
            System.out.println("Above Boston " + "Relative locater testi FAILED<=");
        }


    // Right Of -->>>  BOSTON====
    //pid6_thumb

        WebElement nycElementi= driver.findElement(By.xpath("//p[text()='NYC']"));


        WebElement berlin3= driver.findElement(RelativeLocator.with(By.tagName("img")).below(nycElementi));

        String expectedIdDegeri3= "pid3_thumb";
        String actualIdDegeri3= berlin3.getAttribute("Id");

        if (expectedIdDegeri.equals(actualIdDegeri)){
            System.out.println("Above NYC " + "Relative locater testi => PASSED");
        }else{
            System.out.println("Above NYC " + "Relative locater testi FAILED<=");
        }


        WebElement berlin4= driver.findElement(RelativeLocator.with(By.tagName("img"))
                .below(nycElementi)
                .toRightOf(bostonElementi)
                .above(sailorElementi));

     //  //3 ) Relative locator’larin dogru calistigini test edin
     //  //   id'si pid7_thumb oldugunu test edelim
     //  String expectedIdDegeri="pid7_thumb";
     //  String actualIdDegeri=berlin4.getAttribute("Id");
     //  if (expectedIdDegeri.equals(actualIdDegeri)){
     //      System.out.println("Relative locator testi PASSED");
     //  }else {
     //      System.out.println("Relative locator testi FAILED");
     //  }



        driver.close();




    }
}
