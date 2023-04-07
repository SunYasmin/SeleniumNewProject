package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.EventListener;
import java.util.List;

public class C08_Odev2_LoginTest {
    public static void main(String[] args) throws InterruptedException{

        /*
        Bir class oluşturun: LoginTest

        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        1-http://a.testaddressbook.com adresine gidiniz.
        2-Sign in butonuna basin
        3-email textbox,password textbox, and signin button elementlerini locate ediniz..
        4-Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        Username : testtechproed@gmail.com
        Password : Test1234!
        5-Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        6-“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        7-Sayfada kac tane link oldugunu bulun.
        */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1-http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");

        //2-Sign in butonuna basin

        //Thread.sleep(3000);

        WebElement signIn = driver.findElement(By.id("sign-in"));
        signIn.click();

        //3-email textbox,password textbox, and signin button elementlerini locate ediniz..

        //Thread.sleep(3000);

        WebElement textBox = driver.findElement(By.id("session_email"));
        //Thread.sleep(3000);

        WebElement passwordBox = driver.findElement(By.id("session_password"));
        //Thread.sleep(3000);

        WebElement signInButon = driver.findElement(By.id("sign-in"));
        //Thread.sleep(3000);


        //4-Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        Username : testtechproed@gmail.com
        //        Password : Test1234!

        WebElement userName = driver.findElement(By.id("session_email"));
        userName.sendKeys( "testtechproed@gmail.com");

        WebElement passWord = driver.findElement(By.id("session_password"));
        passWord.sendKeys("Test1234!");


        WebElement signIn1 = driver.findElement(By.name("commit"));// id ve linkTexti(4 tane cıktı aramada) bulamadim name vardi onu kullandim
        signIn1.click();

        //5-Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        //WebElement arayacagimAlan =   driver.findElement(By.xpath("/html/body/div/div/h1")); BU ADRESSBOOK YAZAN YERİ GETİRİYOR
        //WebElement arayacagimAlan =   driver.findElement(By.xpath("<span class=\"navbar-text\" data-test=\"current-user\">testtechproed@gmail.com</span>"));
        //<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>
        //*[@id="navbar"]/div[2]/span  BUID LERİN XPATH LERİN HEPSİNİ DENEDİM SADECE username yazan kısımdaki xpath ile getirebildim

        WebElement arayacagimAlan =   driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/span"));
        String arananUserId = "testtechproed@gmail.com";
        String actualUserId = arayacagimAlan.getText();

        if (actualUserId.contains(arananUserId)){

            System.out.println("Test PASSED" + actualUserId);
        }else System.out.println("TestFAILED" );


        //6-“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adresses = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]"));
        String arananAdresses = "Addresses";
        String actualAdresses = adresses.getText();

        //adresses.isDisplayed();?????

        if (actualAdresses.contains(arananAdresses)){

            System.out.println("Adres textbox testi PASSED"+actualAdresses);
        }else System.out.println("Adres textbox testi FAILED");

        WebElement signOut = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[3]"));
        String arananSignOut = "Sign out";
        String actualSignOut = signOut.getText();

        if (actualSignOut.contains(arananSignOut)){

            System.out.println("Signout textbox testi PASSED" + actualSignOut);
        }else System.out.println("Signout textbox testi FAILED");

        //7-Sayfada kac tane link oldugunu bulun.

        List<WebElement> linkSayisi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki linklerin sayisi = " + linkSayisi.size());

    }
}
