package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C09_Odev3 {

    public static void main(String[] args) throws InterruptedException{

         /*
        Yeni bir class olusturalim (Homework)
        1.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        2.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        yazdirin.
        3.https://www.walmart.com/ sayfasina gidin.
        4. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        5. Tekrar "facebook" sayfasina donun
        6. Sayfayi yenileyin
        7. Sayfayi tam sayfa (maximize) yapin
        8.Browser'i kapatin
         */

        //1.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";

        if (actualTitle.contains(expectedTitle)){

            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED "+ actualTitle);

        //2.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "facebook";

        if (actualUrl.contains(expectedUrl)){

            System.out.println("URL testi PASSED");
        }else System.out.println("URL testi FAILED "+ actualUrl);

        //3.https://www.walmart.com/ sayfasina gidin.
        Thread.sleep(3000);
        driver.navigate().to("https://www.wallmart.com");

        //4. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        Thread.sleep(3000);

        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "wallmart";

        if (actualTitle1.contains(expectedTitle1)){

            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED " + actualTitle1);

        //5. Tekrar "facebook" sayfasina donun

        Thread.sleep(3000);
        driver.navigate().back();

        //6. Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();

        //7. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //8.Browser'i kapatin
        driver.close();

    }


}
