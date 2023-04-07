package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodlariOrnek {  //NOT EGER BIZ KODU YAZDIK SAYFA ACMAYA CALISIYORUZ
                                        // AMA 10 SN DEN SONRA GELMIYORSA BILDIRILIR BU DA SORUNDUR Duration.OfSecond KUllan
//acılırken tepede sayfa adresinin sekmenin tab in yaninda donen yer

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu = " + driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,40));
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(600,900));


        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanin yeni konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin yeni boyutu = " + driver.manage().window().getSize());


        //8. Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();



    }

}
