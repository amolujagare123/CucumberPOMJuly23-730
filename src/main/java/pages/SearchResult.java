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


    By priceListRaw = By.xpath("//span[@data-testid='price-and-discounted-price']");

    public ArrayList<Integer> getPriceList()
    {
        ArrayList<String> rawPriceList = getElementTextList(priceListRaw);
        ArrayList<Integer> priceList = new ArrayList<>();
        for (String priceStr:rawPriceList) // ₹ 10,500
        {
            String temp1 = priceStr.split(" ")[1]; // 10,500
            String temp2 = temp1.replace(",", ""); // 10500
            int price = 0;
            try {
                 price = Integer.parseInt(temp2);
            }
            catch (Exception e)
            {

            }

            priceList.add(price);
        }

        return priceList;
    }

}
