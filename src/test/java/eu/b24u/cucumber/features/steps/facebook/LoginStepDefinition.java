package eu.b24u.cucumber.features.steps.facebook;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eu.b24u.cucumber.page.login.FacebookPage;
import eu.b24u.cucumber.page.login.FacebookPageImpl;
import eu.b24u.cucumber.steps.TestBase;

public class LoginStepDefinition extends TestBase {
	
	FacebookPage facebookPage;
	
	@Given("^the login page$")
	public void the_login_page() throws Throwable {
		prepare();
		facebookPage = new FacebookPageImpl(getDriver()).navigateTo();
		selenium.wait(1);
	}

	@When("^I write a username \"([^\"]*)\"$")
	public void i_write_a_username(String username) throws Throwable {
		facebookPage.setUsername(username);
	}

	@When("^I click a button login$")
	public void i_click_a_button_login() throws Throwable {
		facebookPage.clickLoginButton();
		selenium.wait(1);
	}
	
	@And("^I write a password \"([^\"]*)\"$")
	public void i_write_a_password(String password) throws Throwable {
	    facebookPage.setPassword(password);
	}
	
	@Then("^I see title page which contain \"([^\"]*)\"$")
	public void i_see_notification_which_contain(String textInNotification) throws Throwable {
		Assert.assertEquals(facebookPage.getTitle(), textInNotification);

	    teardown();
	}
}
