package eu.b24u.cucumber.page.peka.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import eu.b24u.cucumber.page.facebook.login.FacebookPage;
import eu.b24u.cucumber.page.facebook.login.FacebookPageImpl;

/**
 * PekaLoginStepDef
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 13.04.2019 11:37
 **/
public class PekaLoginStepDef {

    private PekaPage pekaPage;

    /**
     * Konstruktor, łączy użycie interfejsu z implementacją
     * W przypadku braku konstruktora dostajemy null pointer exception
     */
    public PekaLoginStepDef() {
        this.pekaPage = new PekaPageImpl();
    }

    @Given("^the login page on peka site$")
    public void the_login_page() throws Throwable {
        pekaPage.navigateToLoginPage();
    }

    @When("^I write a username \"([^\"]*)\" on peka site$")
    public void iWriteAUsernameOnPekaSite(String username) throws Throwable {
        pekaPage.setUsername(username);
    }

    @And("^I write a password \"([^\"]*)\" on peka site$")
    public void iWriteAPasswordOnPekaSite(String password) throws Throwable {
        pekaPage.setPassword(password);
    }

    @And("^I click a button login on peka site$")
    public void iClickAButtonLoginOnPekaSite() {
        pekaPage.clickLoginButton();
    }
}
