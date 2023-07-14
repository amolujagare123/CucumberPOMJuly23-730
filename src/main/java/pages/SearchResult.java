package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static stepdefinitions.SharedSD.getDriver;

public class SearchResult extends Base {

    public void clickStarRating(String rating)
    {
        By ratingElement
                = By.xpath("//div[contains(@data-filters-item,'class="+rating+"')]");
        clickOn(ratingElement);
    }

    By starElements = By.xpath("//div[contains(@aria-label,'out of 5')]");

    public ArrayList<Integer> getStartValueList()
    {
        List<WebElement> wbList = getDriver().findElements(starElements);
        ArrayList<Integer> starValueList = new ArrayList<>();
        for (WebElement element:wbList ) {
            String areaLabel = element.getAttribute("aria-label");
            String startStr = areaLabel.split(" ")[0]; //3 out of 5
            int star = 0;
            try {
                star = Integer.parseInt(startStr);
            } catch (Exception e)
            {

            }
            starValueList.add(star);
        }

        return starValueList;
    }

    By hotels = By.xpath("//div[@data-testid='title']");

    public ArrayList<String> getHotelsList()
    {
        return getElementTextList(hotels);
    }
}
