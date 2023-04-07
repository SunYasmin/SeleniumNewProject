package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException{

        //NOT EGER BIZ KODU YAZDIK SAYFA ACMAYA CALISIYORUZ ILK etapta bakilir
        // AMA 10-15 SN DEN SONRA GELMIYORSA BILDIRILIR BU DA SORUNDUR Duration.OfSecond Kullan
        //acılırken tepede sayfa adresinin sekmenin tab in yaninda donen yer

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Bu code satiri onemli bu sekilde gorecegiz bastaki konuyu
        driver.get("https://www.amazon.com");//"https://techproeducation.com"
        //cok az verirsem de hata verir
        //sure yeterli veya fazlaysa chrome da acilip kapanir yani konsola baska bisey gelmiyor
        //icini 1000 yapsak calisip kapanir
        //ust satiri yoruma alip bakiyorum

        //implicitly, çalısmıyorsa beklemez kapanır.
        //thread.sleep çalışsada çalısmasada verdiginiz saniye kadar bekler.
        Thread.sleep(5000);
        driver.get("https://techproeducation.com");
        driver.close();

        //BYukarda birsey gormem hizli olabilir konsoldaki sayi sure onemli
        /*
        Ileride wait konusunu daha genis olarak ele alacagiz
        Bir sayfa acilirken, ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yukleme suresine ihtiyac vardir veya
        bir webelementin kullanılabilmesi için zaman gostergesi ihtiyaç olabilir.
        imlicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        MAXIMUM sureyi belirleme olanağı tanir
         */





    }
}
