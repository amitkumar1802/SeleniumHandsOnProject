package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement useremail;
	public WebElement UserEmail() {
		return useremail;
	}
	
	@FindBy(id="input-password")
	private WebElement userpassword;
	public WebElement UserPassword() {
		return userpassword;
	}
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginoption;
	public WebElement LoginOption() {
		return loginoption;
	}

}
