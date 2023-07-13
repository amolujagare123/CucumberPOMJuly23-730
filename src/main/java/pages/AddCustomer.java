package pages;

import org.openqa.selenium.By;

public class AddCustomer extends Base{

    By name= By.xpath("//input[@id='name']");
    By address = By.xpath("//textarea[@name='address']");
    By contact1= By.xpath("//input[@name='contact1']");
    By contact2= By.xpath("//input[@name='contact2']");
    By add= By.xpath("//input[@name='Submit']");

    By successMessage= By.xpath("//div[@class='confirmation-box round']");

    public String getSuccessMessage()
    {
        return getElementText(successMessage);
    }

    public void setName(String value)
    {
        setValue(name,value);
    }

    public void setAddress(String value)
    {
        setValue(address,value);
    }

    public void setContact1(String value)
    {
        setValue(contact1,value);
    }
    public void setContact2(String value)
    {
        setValue(contact2,value);
    }
    public void clickAdd()
    {
        clickOn(add);
    }
}
