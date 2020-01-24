package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends BasePage {

	By userNameTextField = By.id("identifierId");
	By passwordTextField = By.name("password");
	By NextBtn = By.id("identifierNext");
	By SubmitBtn = By.id("passwordNext");
	
	By menu = By.cssSelector("div.gb_Hf");	
	By gmailLink = By.cssSelector("span.MrEfLc");
	By gmailHomePage = By.cssSelector("a[title='Gmail']");
	
	//************************************************************UNIT ACTIONS***************************
	/**
	 * @param driver
	 * @param username
	 */
	public void enterUserName(RemoteWebDriver driver, String username) {
		waitForElementVisibility(driver, userNameTextField);
		waitForElementVisibility(driver, NextBtn);
		hardWait(3000);
		enterData(driver, userNameTextField, username);
	}
	

	/**
	 * @param driver
	 * @param password
	 */
	public void enterPassword(RemoteWebDriver driver, String password) {
		enterData(driver, passwordTextField, password);
	}
	
	

	/**
	 * @param driver
	 * @throws InterruptedException
	 */
	public void clickOnSubmitutton(RemoteWebDriver driver) throws InterruptedException {
		click(driver, SubmitBtn);
	}
	
	/**
	 * @param driver
	 */
	public void clickMenus(RemoteWebDriver driver) {
		waitForElementVisibility(driver, menu);
		click(driver, menu);
	}
	
	public void clickGmailLink(RemoteWebDriver driver) {
		waitForElementVisibility(driver, gmailLink);
		click(driver, gmailLink);
	}
	
	/**
	 * @param driver
	 * @throws InterruptedException
	 */
	public void clickOnNextButton(RemoteWebDriver driver) throws InterruptedException {
		waitForElementVisibility(driver, NextBtn);
		click(driver, NextBtn);
	}
	
	public int getnextBtnSize(RemoteWebDriver driver) {
		hardWait(5000);
		return getWebElements(driver, NextBtn).size();
	}
	
	public boolean isGmailPageDisplayed(RemoteWebDriver driver) {
		waitForElementVisibility(driver, gmailHomePage);
		return isElementPresent(driver, gmailHomePage);
	}
}
