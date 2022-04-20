package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IphonePage extends BasePage{
    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private List<WebElement> addToCartButton;

    @FindBy(xpath = "//div[@class='cart-parent-limit']/div[@class='item']")
    private WebElement productOfCartList;

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstProductAddToCartButton(){
        addToCartButton.get(0).click();
    }

    public WebElement getProductOfCartList(){
        return productOfCartList;
    }

    public boolean getVisibilityProductOfCart(){
        return productOfCartList.isEnabled();
    }
}
