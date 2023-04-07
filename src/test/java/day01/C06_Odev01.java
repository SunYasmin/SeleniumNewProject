package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Odev01 {
    public static void main(String[] args) {


    //Yeni bir package olusturalim : day01
    //Yeni bir class olusturalim : C03_GetMethods
    //Amazon sayfasina gidelim. https://www.amazon.com/

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

    //Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());

    //Sayfa basliginin “Amazon” icerdigini test edin

        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title tes PASSED");

        }else System.out.println("Title test failed");

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfanın Url'i : "+driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime1 = "amazon";
        if(actualUrl.contains(arananKelime1)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");

        //Sayfa handle degerini yazdirin
        System.out.println("Handle değeri : "+driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualPageSource = driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if (actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sourcecode Testi PASSED");
        }else System.out.println("Sourcecode Testi FAILED");

        //Sayfayi kapatin.
        driver.close();






    }
}
