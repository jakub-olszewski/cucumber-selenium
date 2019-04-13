package eu.b24u.cucumber.page.peka.login;

import eu.b24u.cucumber.page.BasePage;
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

    /**
     * Konstruktor inicjuje elementy zdefiniowane w tej klasie
     */
    public PekaPageImpl() {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void navigateTo() {
        driver.navigate().to(BASE_URL);
        selenium.wait(10);
    }
}
