package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Login;

import static stepdefinitions.SharedSD.getDriver;

public class LoginSD {
    Login login = new Login();
    @Given("I am on login page")
    public void i_am_on_login_page() {

    }
    @When("^I enter (.+) and (.+)$")
    public void i_enter_admin_and_admin(String username,String password) {
        login.setUsername(username);
        login.setPassword(password);
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
       login.clickLogin();
    }
    @Then("^I should get (.+)$")
    public void i_should_get_correct_url(String url) {
        Assert.assertEquals("This is not a correct page",
                url,getDriver().getCurrentUrl());
    }

    @When("I click on forgot password link")
    public void iClickOnForgotPasswordLink() {
        login.clickForgotPassword();
    }

    @Then("I should reach to the forgot password page")
    public void iShouldReachToTheForgotPasswordPage() {

        String expected = "POSNIC - Store Logo";
        String actual = getDriver().getTitle();
        Assert.assertEquals("this is not a forgot password page",
                expected,actual);
    }
}
