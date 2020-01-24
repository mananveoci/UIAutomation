package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends BasePage {

	By googleSearch_Tf = By.name("q");
	By facebookLink = By.name("h3.sA5rQ");
	By fbHeader = By.cssSelector("i.fb_logo");
	
	//************************************************************UNIT ACTIONS***************************
	/**
	 * @param driver
	 * @param username
	 */
	public void enterSearchSite(RemoteWebDriver driver, String username) {
		waitForElementVisibility(driver, googleSearch_Tf);
		hardWait(3000);
		enterData(driver, googleSearch_Tf, username);
	}
	
	/**
	 * @param driver
	 */
	public void clickFacebookLink(RemoteWebDriver driver) {
		waitForElementVisibility(driver, facebookLink);
		click(driver, facebookLink);
	}
	
	/**
	 * @param driver
	 * @return
	 */
	public boolean isFacebookPageDisplayed(RemoteWebDriver driver) {
		waitForElementVisibility(driver, fbHeader);
		return isElementPresent(driver, fbHeader);
	}
}
