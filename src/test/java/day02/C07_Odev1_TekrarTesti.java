package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Odev1_TekrarTesti {
    public static void main(String[] args) throws InterruptedException{
        /*
        Yeni bir class olusturun (TekrarTesti)
        Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Youtube sayfasina geri donun
        Sayfayi yenileyin
        Amazon sayfasina donun
        Sayfayi tamsayfa yapin
        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
                Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        Sayfayi kapatin

        */

        //1-Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify/dogrulama),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(5000);
        driver.get("https://www.youtube.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";

        if (actualTitle.contains(expectedTitle)) {

            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAİLED. Actual title = " + actualTitle + " olmalidir");

        //2-Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "youtube";

        if (actualUrl.contains(expectedUrl)){

            System.out.println("URL testi PASSED");
        }else System.out.println("URL testi FAILED. Actual Url : " + actualUrl);

        //3-Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com");

        //4-Youtube sayfasina geri donun

        Thread.sleep(3000);
        driver.navigate().back();

        //5-Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();

        //6-Amazon sayfasina donun
        Thread.sleep(3000);
        driver.navigate().forward();


        //7-Sayfayi tam sayfa yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //8-Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.

        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Amazon";

        if (actualTitle1.contains(expectedTitle1)) {

            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAİLED. Actual title = " + actualTitle1 + " olmalidir");

        //9- Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın

        Thread.sleep(3000);

        String actualUrl1 = driver.getCurrentUrl();
        String expectedUrl1 = "https://www.amazon.com.tr";

        if (actualUrl1.contains(expectedUrl1)){

            System.out.println("URL testi PASSED");
        }else System.out.println("URL testi FAILED");

        //10-Sayfayi kapatin

        driver.close();


    }
}
