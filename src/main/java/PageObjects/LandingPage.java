package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement accountOption;
	
	public WebElement AccountOption() {
		return accountOption;
	}
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	public WebElement LoginOption() {
		return loginOption;
	}
	
	@FindBy(linkText = "Register")
	private WebElement registrationOption;
	public WebElement RegistrationOption() {
		return registrationOption;
	}
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchTab;
	public WebElement SearchTab() {
		return searchTab;
	}
	
	@FindBy(xpath = "//span//button[@class='btn btn-default btn-lg']")
	private WebElement searchOption;
	public WebElement SearchOption() {
		return searchOption;
	}
	
}
