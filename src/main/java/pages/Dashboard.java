package pages;

import org.openqa.selenium.By;

public class Dashboard extends Base{

    By addCustomer= By.xpath("//a[normalize-space()='Add Customer']");

    public void clickAddCustomer()
    {
        clickOn(addCustomer);
    }
}
