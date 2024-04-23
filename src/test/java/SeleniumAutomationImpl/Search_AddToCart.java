package SeleniumAutomationImpl;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.CheckoutCart;
import PageObjects.IphonePage;
import PageObjects.LandingPage;
import resources.Base;

public class Search_AddToCart extends Base {
	
	public WebDriver driver;
	Logger logger = LogManager.getLogger(Search_AddToCart.class.getName());
	@BeforeMethod
	public void setUp() throws IOException {
		
		driver = initializer();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test
	public void SearchAddToCart() {
		LandingPage landingPage= new LandingPage(driver);
		logger.info("Redirected to landing page");
		landingPage.SearchTab().click();
		landingPage.SearchTab().sendKeys("Iphone");
		landingPage.SearchOption().click();
		logger.error("Error occured");
		
		IphonePage iphonePage = new IphonePage(driver);
	    iphonePage.IPhoneText().click();
	    iphonePage.Quantity().click();
	    iphonePage.Quantity().clear();
	    iphonePage.Quantity().sendKeys("2");
	    iphonePage.AddToCart().click();
	    Assert.assertTrue(true,iphonePage.VerifyWhetherAdded().getText());
	    iphonePage.ClickOnAddToCart().click();
	    
	    
	    CheckoutCart checkoutCart = new CheckoutCart(driver);
	    checkoutCart.CheckOut().click();
	    checkoutCart.DeleteElement().click();
	    Assert.assertTrue(true,checkoutCart.VerifyWhetherDeleted().getText());
	    checkoutCart.BackToHome().click();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
