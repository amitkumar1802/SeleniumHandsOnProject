package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstname;
	public WebElement FirstName() {
		return firstname;
	}
	
	@FindBy(id="input-lastname")
	private WebElement lastname;
	public WebElement LastName() {
		return lastname;
	}
	
	@FindBy(id="input-email")
	private WebElement emailaddress;
	public WebElement EmailAddress() {
		return emailaddress;
	}
	
	@FindBy(id="input-telephone")
	private WebElement telephoneNumber;
	public WebElement TelephoneNumber() {
		return telephoneNumber;
	}
	
	@FindBy(id="input-password")
	private WebElement password;
	public WebElement Password() {
		return password;
	}
	
	@FindBy(id="input-confirm")
	private WebElement confirmPassword;
	public WebElement ConfirmPassword() {
		return confirmPassword;
	}
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement checkbox;
	public WebElement CheckboxOption() {
		return checkbox;
	}
	
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueOption;
	public WebElement ContinueOption() {
		return continueOption;
	}
	
}
