package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere konumu : " + driver.manage().window().getPosition());//Acilan browser in konumunu verir
        System.out.println("Pencere olculeri : " + driver.manage().window().getSize());//Acilan browser in pencere olculerini verir

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize(); //pencereyi simge durumuna getirir

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();// cerceve var

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Thread.sleep(3000);
        System.out.println("Yeni pencere konumu : " + driver.manage().window().getPosition());
        System.out.println("Yeni pencere olculeri : " + driver.manage().window().getSize());


        //Sayfayi fullscreen yapin Fullscreen de cerceve yok tamamen kapliyor ekrani pencere
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Thread.sleep(3000);
        System.out.println("Fullscreen pencere konumu : " + driver.manage().window().getPosition());
        System.out.println("Fullscreen pencere olculeri : "+ driver.manage().window().getSize());


        //Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();

/*
KONUMLARI KONSOLDA YAZDIRIR
Pencere konumu : (9, 9)
Pencere olculeri : (1051, 798)
Yeni pencere konumu : (-8, -8)
Yeni pencere olculeri : (1552, 832)
Fullscreen pencere konumu : (0, 0)
Fullscreen pencere olculeri : (1536, 864)

 */



    }
}
