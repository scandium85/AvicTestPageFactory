package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AppleStorePage extends BasePage{
    @FindBy(xpath = "//div[@class='brand-box__title']/a")
    private List<WebElement> brandButton;

    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstButtonsBrand(){
        brandButton.get(0).click();
    }
}
