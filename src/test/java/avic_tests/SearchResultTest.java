package avic_tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchResultTest extends BaseTest{

    @Test(priority = 2)
    public void checkVisibleMessageIfEmptySearch(){
        getHomePage().clickSearchButton();
        assertTrue(getHomePage().getVisibilityAlertMassage());
    }
}
