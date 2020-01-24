package appWorkflows;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import constants.Constants;
import pages.LoginPage;
import pages.bars.TopBar;
import utils.EncryptionDecryption;
import utils.FileOperations;
import utils.ReadingEmails;

public class LoginWorkflows 
{
	ReadingEmails readingEmailsObj = new ReadingEmails();
	FileOperations fileOperations = new FileOperations();
	Constants constants = new Constants();
	EncryptionDecryption encryptionDecryptionObj = new EncryptionDecryption();
	String subject = "Your Veoci Stage Login Code";
	LoginPage loginPage=new LoginPage();
	TopBar header=new TopBar();

	public void LoginAndNavigateToRoom(RemoteWebDriver driver, String userName)  
	{
		loginPage.enterSearchSite(driver, userName);
		loginPage.clickFacebookLink(driver);
//		loginPage.clickMenus(driver);
//		loginPage.clickGmailLink(driver);
		
	}
	
	public void verifyGmailLoginSucessfully(RemoteWebDriver driver ,SoftAssert softAssert) {
		softAssert.assertTrue(loginPage.isFacebookPageDisplayed(driver), "Facebook title is not displayed on page");
	}

	public void goToSeleniumRoom(RemoteWebDriver driver,String roomID)  {
		header.clickOnHomeIcon(driver);
		header.clickOnHamburgerMenuButton(driver);
		header.hardWait(1000);
		header.clickOnMegaMenuRoomLink(driver);
		header.hardWait(1000);
		header.enterRoomToSearch(driver, roomID);
		header.hardWait(1000);
		header.clickSearch(driver);
		header.hardWait(4000);
		header.clickOnSeleniumRoom(driver);
	}
	
	public void createNewRoom(RemoteWebDriver driver ,String newRoomName)
	{
		header.clickOnHamburgerMenuButton(driver);
		header.clickOnStartRoom(driver);
		header.enterNewRoomName(driver, newRoomName);
		header.clickOnLaunchBtn(driver);
		header.clickOnJoinBtnOnToastr(driver);
		
	}
}
