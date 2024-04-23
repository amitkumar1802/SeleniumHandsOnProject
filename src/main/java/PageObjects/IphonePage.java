package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IphonePage {

	WebDriver driver;
	public IphonePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "iPhone")
	private WebElement iphoneText;
	public WebElement IPhoneText() {
		return iphoneText;
	}
	
	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement quantity;
	public WebElement Quantity() {
		return quantity;
	}
	
	@FindBy(id = "button-cart")
	private WebElement addToCart;
	public WebElement AddToCart() {
		return addToCart;
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement verifyWhetherAdded;
	public WebElement VerifyWhetherAdded() {
		return verifyWhetherAdded;
	}
	
	@FindBy(id = "cart-total")
	private WebElement clickOnAddToCart;
	public WebElement ClickOnAddToCart() {
		return clickOnAddToCart;
	}
	
}
