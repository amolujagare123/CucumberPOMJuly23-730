package pages;

import org.openqa.selenium.By;

public class SearchResult extends Base {

    public void clickStarRating(String rating)
    {
        By ratingElement
                = By.xpath("//div[contains(@data-filters-item,'class="+rating+"')]");
        clickOn(ratingElement);
    }
}
