package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //sayfayi boyutu ekrani kapladi

        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle()); //CDwindow-0F81DF73ADC5481C62BF84F478592272 konsolda hash kodunu verdi

        //her yeni pencerede windowhandle farkli hashcode u veriyor

        //Farkli pencereler arasinda gezinebilmek icin getWindowhandle() method'unu kullaniriz.


    }
}
