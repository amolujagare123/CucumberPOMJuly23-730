package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchResult;

import java.util.ArrayList;
import java.util.Collections;

import static stepdefinitions.SharedSD.getDriver;

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
       getDriver().navigate().refresh();
        ArrayList<Integer> starList = searchResult.getStartValueList();
        System.out.println(starList);

        int size = starList.size();
        int frequency = Collections.frequency(starList,Integer.parseInt(star.split(" ")[0]));

        boolean result = (size==frequency);

        Assert.assertTrue("all stars are not "+star,result);
    }

    @Then("I verify {string} is within the search result")
    public void iVerifyIsWithinTheSearchResult(String hotelName) {

        ArrayList<String> hotelsList = searchResult.getHotelsList();
        boolean flag = false;
        for (String hotel:hotelsList) {
            System.out.println(hotel);
            if(hotel.contains(hotelName))
            {
                flag = true;
            }
        }

        Assert.assertTrue(hotelName+":this hotel is not in the search result",flag);
    }
}
