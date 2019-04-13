package eu.b24u.cucumber.page.peka.login;

/**
 * PekaPage
 * To interfejst użyty w do implementacji PekaPageImpl
 * Zawiera tylko nazwy metod z argumentami
 * Nie zawiera implementacji metod
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 13.04.2019 12:02
 **/
public interface PekaPage {

    /**
     * Metoda nawiguje do strony głównej
     */
    void navigateTo();

    /**
     * Metoda nawiguje do strony logowania
     */
    void navigateToLoginPage();

    void navigateToTPortmonetka();

    /**
     * Metoda ustawia login na stronie logowania
     * @param username to ustawiany login
     */
    void setUsername(String username);

    /**
     * Metoda ustawia hasło na stronie logowania
     * @param password ustawiane hasło
     */
    void setPassword(String password);

    /**
     * Metoda klika w przycisk logowania
     */
    void clickLoginButton();
}
