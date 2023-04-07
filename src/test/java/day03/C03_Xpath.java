package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.EventListener;

public class C03_Xpath {

    /*
   https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
   2- Add Element butonuna basin
   Delete butonu’nun gorunur oldugunu test edin
   Delete tusuna basin
   “Add/Remove Elements” yazisinin gorunur oldugunu test edin

    */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        String deleteButon = deleteButton.getText();
        String expectedDeleteButon = "Delete";
        if (deleteButon.equals(expectedDeleteButon)){
            System.out.println("Delete Buton testi PASSED");
        }else System.out.println("Delete Buton testi FAILED");

        //2.YOL

        if (deleteButton.isDisplayed()){
            System.out.println("Delete Buton testi PASSED");
        }else System.out.println("Delete Buton testi FAILED");

        // Delete tusuna basin
        deleteButton.click();

        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        String expectedAddRemove = "Add/Remove Elements";
        String actualAddRemove = driver.findElement(By.xpath("//*[@id=\"content\"]/h3")).getText();
        if (actualAddRemove.equals(expectedAddRemove)){
            System.out.println("Add/Remove testi PASSED");
        }else System.out.println("Add/Remove testi FAILED" + actualAddRemove);

        //Syafayi kapatin
        //driver.close();

    }
}