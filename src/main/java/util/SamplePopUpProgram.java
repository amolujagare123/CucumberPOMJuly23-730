package util;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SamplePopUpProgram {


    @Test
    public void myTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.convertflow.com/blog/cross-selling-strategies");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//div[@class='cf-close'][@data-cta-id='116947']")).click();
    }

    //
}
