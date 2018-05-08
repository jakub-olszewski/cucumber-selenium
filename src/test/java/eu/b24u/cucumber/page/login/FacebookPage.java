package eu.b24u.cucumber.page.login;

public interface FacebookPage {
	
	/**
	 * Set user name
	 * @param username
	 */
	public void setUsername(String username);

	/**
	 * Method to set password on login page
	 * @param password wrote in password field
	 */
	public void setPassword(String password);

	/**
	 * Click a login button on login page
	 */
	public void clickLoginButton();

	/**
	 * Navigate to page
	 * @return
	 */
	FacebookPage navigateTo();

	/**
	 * get title page
	 * @return
	 */
	public String getTitle();

}
