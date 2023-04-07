package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to() methodu asyfada ileri geri yapacaksak kullanilir
        //driver.get() methodu gibi bizi istedigimiz url e goturur

        //NAVIGASYON;

        driver.navigate().to("https://techproeducation.com");
        // yukardaki kodlarla once amazona hemen ardindan techproya gider
        //ileri geri butonu adresin yanindaki butonlar ile gecis yapabilir gezinirim
        //hızlıca gider bu hizli gitmeyi onlemek icin Thread.sleep() icine sure yazarak bekleterek gecebiliriz

        //tekrar amazon sayfasina donelim
        Thread.sleep(3000);//exception firlatir main yanina throws Interru. ex ekledim
        driver.navigate().back();//back ile geri dondum BIR ONCEKI SAYFAYA GERI DONER

        //todo Tekrar techproed sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();//ılk sayfadan ileriye gider

        //todo Techpro sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();//sayfa yeniler

        //todo Son olarak sayfayi kapatalim
        driver.close();





    }
}
