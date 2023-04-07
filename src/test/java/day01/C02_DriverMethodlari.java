package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Su an calistirdigimda kucuk ve bos bir test sayfasi geliyor
        // bunu duzeltelim kodlarim kucuk olmasin sayfam kucuk olmasin

        driver.manage().window().maximize();//test sayfasini buyulttu

        //Amazon sayfasina gidiniz_Test yaparken boyle yazip alta kodumuzu yazacgiz
        driver.get("https://www.amazon.com");


        //System.out.println(driver.getPageSource()); burda butun kaynek kodlarini getirecek gerek yok

        // burda yazdirmak icin olup olmadigini arayacagim java kodlarini yazzzz
        //arayacagim seyi yazip direk kodla ariyorum

        //thread sleep kati calisir kac yazdiysam o kadar sure kesinlikle o sureyi doldurur
        //impli wait sayfa acilinca devam eder beklemeyi durdurur

        // Kaynak kodlarin icinde "Gateway" kelimesinin oldugunu test ediniz
        String istenenKelime = "Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSource testi PASSED");

        }else System.out.println("PageSourse testi FAILED");


        driver.close();//sayfayi kapatir???

    }


}
