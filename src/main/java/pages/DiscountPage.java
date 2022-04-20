package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DiscountPage extends BasePage{
    @FindBy(xpath = "//div[@class='item-prod col-lg-3']")
    private List<WebElement> discountProductsList;

    @FindBy(xpath = "//img[contains(@data-src,'utsenka')]")
    private List<WebElement> discountImgList;

    public DiscountPage(WebDriver driver) {
        super(driver);
    }

    public int getDiscountProductsCount (){
        return discountProductsList.size();
    }

    public int getDiscountImgCount(){
        return discountImgList.size();
    }
}
