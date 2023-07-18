package util;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SamplePopUpProgram2 {


    @Test
    public void myTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.asianpaints.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //driver.findElement(By.name("preview-notification-frame"));

        driver.switchTo().frame("preview-notification-frame");

        driver.findElement(By.xpath("//a[@id='NC_CLOSE_ICON']")).click();
    }

    //
}
