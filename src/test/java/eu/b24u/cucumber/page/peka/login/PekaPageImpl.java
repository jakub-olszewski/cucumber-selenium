package eu.b24u.cucumber.page.peka.login;

import eu.b24u.cucumber.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * PekaPageImpl
 * Klasa, która implementuje interfejs o nazwie PekaPage
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 13.04.2019 12:07
 **/
public class PekaPageImpl extends BasePage implements PekaPage  {

    String BASE_URL = "https://www.peka.poznan.pl";
    String T_PORTMONETKA = "/SOP/account/home.jspb?execution=e8s3";
    String LOGIN_FORM="/SOP/login.jspb";

    @FindBy(id = "i1")
    private WebElement usernameField;

    @FindBy(id = "i2")
    private WebElement passwordField;

    @FindBy(className = "button-inner")
    private WebElement loginButton;

    @FindBy(id = "s3")
    private WebElement amountField;

    @FindBy(className = "label-check")
    private WebElement checkBox;

    @FindBy(name = "_eventId_submitTransaction")
    private WebElement submitAndPayButton;
    /**
     * Konstruktor inicjuje elementy zdefiniowane w tej klasie
     */
    public PekaPageImpl() {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void navigateTo() {
        driver.navigate().to(BASE_URL);
        selenium.wait(1);
    }

    @Override
    public void navigateToLoginPage() {
        driver.navigate().to(BASE_URL+LOGIN_FORM);
        selenium.wait(1);
    }

    @Override
    public void navigateToTPortmonetka() {
        driver.navigate().to(BASE_URL+T_PORTMONETKA);
        selenium.wait(1);
    }

    @Override
    public void setUsername(String username) {
        usernameField.clear();// metoda czyści pole
        usernameField.sendKeys(username); // metoda ustawia wartość w polu username
    }

    @Override
    public void setPassword(String password) {
        passwordField.clear();// metoda czyści pole
        passwordField.sendKeys(password); // metoda ustawia wartość w polu username
    }

    @Override
    public void clickLoginButton() {
        loginButton.click();
    }
}
