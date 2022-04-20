package avic_tests;

import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddCartTest extends BaseTest{
    private static final String EXPECTED_EMPTY_CART_MASSAGE = "Корзина пустая!";

    @Test(priority = 1)
    public void checkAddFirstProdInBasket(){
        getHomePage().clickFirstElementSideBarList();
        getAppleStorePage().clickFirstButtonsBrand();
        getIphonePage().clickFirstProductAddToCartButton();
        getIphonePage().waitVisibilityOfElement(30,getIphonePage().getProductOfCartList());
        assertTrue(getIphonePage().getVisibilityProductOfCart());
    }

    @Test(priority = 3)
    public void checkEmptyCart(){
        getHomePage().clickCartButton();
        assertEquals(getHomePage().getCartMassage(),EXPECTED_EMPTY_CART_MASSAGE);
    }
}
