package eu.b24u.cucumber.page;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;

	protected WebDriver getDriver() {
		return driver;
	}

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

}
