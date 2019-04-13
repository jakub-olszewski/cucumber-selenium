package eu.b24u.cucumber.page.peka.login;

import cucumber.api.java.en.Given;
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
        pekaPage.navigateTo();
    }
}
