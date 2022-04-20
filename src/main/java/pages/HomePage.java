package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//span[@class='sidebar-item-title']")
    private List<WebElement> sideBarList;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='modalAlert']")
    private WebElement alertMassage;

    @FindBy(xpath = "//div[@class='top-links__left flex-wrap']//a[contains(@href,'discount')]")
    private WebElement discountButton;

    @FindBy(xpath = "//div[@class='header-bottom__right-icon']/i[@class='icon icon-cart-new']")
    private WebElement cartButton;

    @FindBy(xpath = "//div[@id='js_cart']//b")
    private WebElement cartMassage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickFirstElementSideBarList(){
        sideBarList.get(0).click();
    }

    public boolean getVisibilityAlertMassage(){
        return alertMassage.isDisplayed();
    }

    public void clickDiscountButton(){
        discountButton.click();
    }

    public void clickCartButton(){
        cartButton.click();
    }

    public String getCartMassage(){
        return cartMassage.getText();
    }
}
