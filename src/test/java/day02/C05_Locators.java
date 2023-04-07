package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {  //BUradaki int sorusu hangi locator u kullanırisiniz
        //cevap ıd  dir
        //x path kullanmamiz gerekli xpath id sinizi goremesek te kullnanilir her zaman unique olarak aliriz
        //mesela urun arayacagim arama kismina gelip tikladim sag tik yapinca altta incele geldi
        //nutella yazip arayavagima otomasyonla yaptiracagim bunun icin o alani locate etmem lazim
        //sag tik incele alta alani yolu kodu gelir
        // incele kisminda pencere icinde ok olan yere tiklarsam sayfada hangi alana ait oldugunu canli renkle gosteriyor
        //ctrl c  ardindan ctrl f birebir eslesmeyi gosterdi
        // id bulmaliyim attribute unu kullanabilirim artik unique bir tane yeri gosteriyor
        // kopyalayip aratip kontrol ederim
        // tr sayfasinda bunlar farklilik gosterebliri
        //

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com.tr");

        //Amazonda nutella aratiniz aramayi webelement e atadim
        //driver.findElement(By.id("twotabsearchtextbox"));//copy id 2 kez incele yap

        //enter i bir web elemente atamamda fayda var enter a ada basabilirim ama islemedigi yerler olabilir
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella", Keys.ENTER); // id uniqe olduğu bu sorunsuz çalışır
        //not , ve + ikisini de kabul eder

        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));Burada name yaptik oldu


        //simdi nutella yazip enter lama yapalim aratalim
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); // uniqe olduğu için sorunsuz çalışır

        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));
        /*
        Bu locatar çalismadı
        Locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locatar çalışmazsa alternatif locatorlar denemeliyiz

        NOT BURADA YANLIS id locate yapilirsa NoSuchElementException hatasi olur ona gore duzenleme yapilir

        NOT id varken name kullanilmaz

        id kullaniminda onemli olan unique olmasidir olmalidir bir kez daha bakariz aynisindan baska var mi id diye ctrl c+ctrl f

         */




        driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag'ındaki link isminden istediğimiz bir parçayla locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();





    }
}
