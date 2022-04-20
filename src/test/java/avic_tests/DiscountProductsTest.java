package avic_tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DiscountProductsTest extends BaseTest{
    @Test(priority = 2)
    public void checkAllDiscountProdHaveIconDiscount(){
        getHomePage().clickDiscountButton();
        assertEquals(getDiscountPage().getDiscountProductsCount(), getDiscountPage().getDiscountImgCount());
    }
}
