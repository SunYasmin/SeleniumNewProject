package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class day01_Giris {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new RemoteWebDriver()//uzaktan kullanacagi ip yi veriyoruz o uzaktaki driver i calistiriyor
        driver.manage().window().maximize();








    }
}
