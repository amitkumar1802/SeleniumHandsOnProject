package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCart {

	WebDriver driver;
	public CheckoutCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//strong//i[@class='fa fa-share']")
	private WebElement checkOut;
	public WebElement CheckOut() {
		return checkOut;
	}
	@FindBy(xpath = "//button[@data-toggle='tooltip'][2]")
	private WebElement deleteElement;
	public WebElement DeleteElement() {
		return deleteElement;
	}
	
	@FindBy(xpath = "//h1[text()='Shopping Cart']")
	private WebElement verifyWhetherDeleted;
	public WebElement VerifyWhetherDeleted() {
		return verifyWhetherDeleted;
	}
	
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement backToHome;
	public WebElement BackToHome() {
		return backToHome;
	}
}
