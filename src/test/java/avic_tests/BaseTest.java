package avic_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.AppleStorePage;
import pages.DiscountPage;
import pages.HomePage;
import pages.IphonePage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;

    @BeforeTest
    public void profileSetUp(){
        chromedriver().setup();
    }

    @BeforeMethod
    public void testSetUp(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/");
    }

    @AfterMethod
    public void testDown(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }

    public AppleStorePage getAppleStorePage(){
        return new AppleStorePage(getDriver());
    }

    public IphonePage getIphonePage(){
        return new IphonePage(getDriver());
    }

    public DiscountPage getDiscountPage(){
        return new DiscountPage(getDriver());
    }
}
