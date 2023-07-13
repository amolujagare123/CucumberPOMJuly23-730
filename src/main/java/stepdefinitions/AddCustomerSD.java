package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddCustomer;
import pages.Dashboard;
import pages.Login;

import java.util.List;

public class AddCustomerSD {

    Login login = new Login();
    Dashboard dashboard = new Dashboard();
    AddCustomer addCustomer = new AddCustomer();
    @When("I do login operation")
    public void i_do_login_operation() {
       login.doLogin("admin","admin");
    }
    @When("I click on add customer link")
    public void i_click_on_add_customer_link() {
        dashboard.clickAddCustomer();
    }
    @When("I enter below data to add customer")
    public void i_enter_below_data_to_add_customer(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();
        addCustomer.setName(data.get(0).get(0));
        addCustomer.setAddress(data.get(0).get(1));
        addCustomer.setContact1(data.get(0).get(2));
        addCustomer.setContact2(data.get(0).get(3));
    }
    @Then("user should be added")
    public void user_should_be_added() {

        String expected = "Customer Details Added";
        String actual = "";
        try {
            actual = addCustomer.getSuccessMessage();
        }
        catch (Exception e)
        {

        }

        boolean result = actual.contains(expected);

        Assert.assertTrue("customer is not added",
               result);
    }

    @And("I click on add button")
    public void iClickOnAddButton() {
        addCustomer.clickAdd();
    }
}
