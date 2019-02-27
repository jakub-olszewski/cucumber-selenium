package eu.b24u.cucumber.page.login;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eu.b24u.cucumber.page.BasePage;

/**
 * Strona logowania 
 * 
 * @author github/jakub-olszewski
 *
 */
public class FacebookPageImpl extends BasePage implements FacebookPage{
	
	String BASE_URL = "https://pl-pl.facebook.com/";

	@FindBy(id = "email")
	private WebElement usernameField;
	
	@FindBy(id = "pass")
	private WebElement passwordField;
	
	@FindBy(id = "loginbutton")
	private WebElement loginButton;

	@FindBy(id = "u_0_l")
	private WebElement nameField;

	public FacebookPageImpl(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String username){
		usernameField.clear();
		usernameField.sendKeys(username);
	}

	@Override
	public void setPassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
	}

	@Override
	public void clickLoginButton() {
		loginButton.click();
	}

	@Override
	public FacebookPage navigateTo() {
		getDriver().navigate().to(BASE_URL);
		Assert.assertEquals("Facebook – zaloguj się lub zarejestruj", driver.getTitle());
		return new FacebookPageImpl(getDriver());
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public void setName(String name) {
		nameField.clear();
		nameField.sendKeys(name);
	}
}
