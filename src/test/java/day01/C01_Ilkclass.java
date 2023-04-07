package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilkclass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        // key olan ilki bizim kullanacagimiz web driver in ismi
        //digeri 2. onun yolu hep ayni seyi yazacagiz

        //bir obje kullanarak driver methodlarini kullanabilmemiz gerekiyor
        //bir driver objesi olusturacagiz

        WebDriver driver = new ChromeDriver();//objem webdriver interface o yuzden obje olusturulmaz

        driver.get("https://www.amazon.com");

        /*
        en temel haliyle bir otomasyon yapmak icin
        Class imiza otomasyon icin gerekli olan webdriver in yerini gostermemiz gerekli
        bunun icin java kutuphanesinde System.setProperty() methodunu kullaniriz
        ve methodun icine ilk olarak driver i yazariz.
        Ikinci olarak webdriver in fiziki yolunu kopyalariz
         */

        System.out.println("Actual Title : " + driver.getTitle());//gidilen sitenin basligini yazdirir
        System.out.println("Actual Title : " + driver.getCurrentUrl());//gidilen sayfanin url sini yazdirir




    }
}
