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
}
