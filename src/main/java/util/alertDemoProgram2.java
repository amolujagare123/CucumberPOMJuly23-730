package util;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alertDemoProgram2 {


    @Test
    public void myTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();


        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.sendKeys("no");
        alert.accept(); //click ok
     //  alert.dismiss(); // click cancel

    }

    //
}
