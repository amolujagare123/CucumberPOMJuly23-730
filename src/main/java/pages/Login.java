package pages;

import org.openqa.selenium.By;

public class Login extends Base{

    By username= By.xpath("//input[@id='login-username']");
    By password= By.xpath("//input[@id='login-password']");
    By submit= By.xpath("//input[@name='submit']");
    By forgotYourPassword = By.xpath("//a[@class='button ']");

    public void setUsername(String value)
    {
        setValue(username,value);
    }
    public void setPassword(String value)
    {
        setValue(password,value);
    }
    public void clickLogin()
    {
       clickOn(submit);
    }

    public void clickForgotPassword()
    {
        clickOn(forgotYourPassword);
    }

    public void doLogin(String username,String password)
    {
        setUsername(username);
        setPassword(password);
        clickLogin();
    }

}
