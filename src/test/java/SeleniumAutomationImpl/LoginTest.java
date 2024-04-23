package SeleniumAutomationImpl;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.AccountsPage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import resources.Base;

public class LoginTest extends Base {

	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		driver = initializer();
		driver.get("https://tutorialsninja.com/demo/");
	}

	@Test(dataProvider = "LoginData", priority = 2)
	public void Login(String email, String password) {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.AccountOption().click();
		landingPage.LoginOption().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.UserEmail().sendKeys(email);
		loginPage.UserPassword().sendKeys(password);
		loginPage.LoginOption().click();

		AccountsPage accountsPage = new AccountsPage(driver);
		Assert.assertTrue(true, accountsPage.Verify().getText());
	}

	@Test(dataProvider = "RegistrationData", priority = 1)
	public void Registration(String firstname, String lastname, String email, String number, String password)
			throws InterruptedException {

		LandingPage landingPage = new LandingPage(driver);
		landingPage.AccountOption().click();
		landingPage.RegistrationOption().click();
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.FirstName().sendKeys(firstname);
		registrationPage.LastName().sendKeys(lastname);
		registrationPage.EmailAddress().sendKeys(email);
		registrationPage.TelephoneNumber().sendKeys(number);
		registrationPage.Password().sendKeys(password);
		registrationPage.ConfirmPassword().sendKeys(password);
		registrationPage.CheckboxOption().click();
		registrationPage.ContinueOption().click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@DataProvider
	public Object[][] RegistrationData() {
		Object[][] data = { { "Pankaj", "Kumar", "pankaj1234@gmail.com", "123456789", "pankaj@123" } };
		return data;
	}

	@DataProvider
	public Object[][] LoginData() {
		Object[][] data = { { "pankaj1234@gmail.com", "pankaj@123" } };
		return data;
	}
}
