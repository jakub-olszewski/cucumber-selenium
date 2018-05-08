package eu.b24u.cucumber.steps;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import eu.b24u.cucumber.utils.OSCheck;
import eu.b24u.cucumber.utils.SeleniumUtil;


public class TestBase {

	public TestBase() {
	}

	protected SeleniumUtil selenium;
	
	private WebDriver driver;

	protected WebDriver getDriver() {
		return driver;
	}

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	boolean silentMode;

	@Before
	public void prepare() {
		silentMode = false;
		// setup chromedriver
		String osname = OSCheck.getName();
		String pathDriver = "src/test/resources/" + osname + "/";
		if (silentMode) {
			pathDriver += "phantomjs";
		} else {
			pathDriver += "chromedriver";
		}
		if (osname.equals("windows")) {
			pathDriver += ".exe";
		}

		if (silentMode) {
			System.setProperty("phantomjs.binary.path", pathDriver);
			setDriver(new PhantomJSDriver());
		} else {
			System.setProperty("webdriver.chrome.driver", pathDriver);
			setDriver(new ChromeDriver());
		}

		// Create a new instance of the Chrome driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.

		// maximize window
		getDriver().manage().window().maximize();

		// And now use this to visit myBlog
		// Alternatively the same thing can be done like this
		// driver.navigate().to(testUrl);
		selenium = new SeleniumUtil(getDriver());
	}

	public void openURL(String url) {
		driver.get(url);
	}

	@After
	public void teardown() throws IOException {
		 driver.quit();
	}

	protected void sendTextToElementById(String name, String text) {
		getDriver().findElement(By.id(name)).sendKeys(text);
	}

	protected void sendTextToElementByName(String name, String text) {
		getDriver().findElement(By.name(name)).sendKeys(text);
	}

	protected WebElement getElementByName(String name) {
		return getDriver().findElement(By.name(name));
	}

	protected WebElement getElementById(String name) {
		return getDriver().findElement(By.id(name));
	}

	protected void clickCheckBoxById(String name) {
		getElementById(name).click();
	}
}
