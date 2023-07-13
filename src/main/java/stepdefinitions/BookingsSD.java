package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchResult;

public class BookingsSD {
    SearchResult searchResult = new SearchResult();
    @Given("I am on default locations search result screen")
    public void i_am_on_default_locations_search_result_screen() {

    }
    @When("^I select option for stars as (.+) stars$")
    public void i_select_option_for_stars_as_stars(String star) // 5 star
    {

        searchResult.clickStarRating(star.split(" ")[0]);
    }
    @Then("^I verify system displays only (.+) stars hotels on search result$")
    public void i_verify_system_displays_only_stars_hotels_on_search_result(String star) {

    }

}
