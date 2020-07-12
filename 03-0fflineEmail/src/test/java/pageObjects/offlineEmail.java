package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class offlineEmail {
	public WebDriver ldriver; 

	public offlineEmail(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[@id=\'identifierId\']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\'identifierNext\']/div/button/div[2]")
	@CacheLookup
	WebElement btnLogin1;

	@FindBy(xpath="//*[@id=\'password\']/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//*[@id=\'passwordNext\']/div/span/span")
	@CacheLookup
	WebElement btnLogin2;

	@FindBy(xpath = "//*[@id=\':jx\']/div[7]/a")
	@CacheLookup
	WebElement btnManageLabels;
	
	@FindBy(xpath = "//*[@id=\':2q3\']/a")
	@CacheLookup
	WebElement btnOffline;
	
	@FindBy(xpath = "//*[@id=\':2ow\']")
	@CacheLookup
	WebElement btnEnableCheckpoint;
	
	@FindBy(xpath = "//*[@id=\':2op\']")
	@CacheLookup
	WebElement btnKeepingData;
	
	@FindBy(xpath = "//*[@id=\':2oq\']")
	@CacheLookup
	WebElement btnSaveChanges;
	
	@FindBy(xpath = "//*[@id=\':jm\']/div/div")
	@CacheLookup
	WebElement userIsLoggedIn;
	

	public void setEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void clickLogin1() {
		btnLogin1.click();
	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin2() {
		btnLogin2.click();
	}
	
	public void clickManageLabels() {
		btnManageLabels.click();
	}
	
	public void clickOffline() {
		btnOffline.click();
	}
	
	public void clickEnableCheckpoint() {
		btnEnableCheckpoint.click();
	}
	
	
	public void clickKeepingData() {
		btnKeepingData.click();
	}
	
	public void clickSaveChanges() {
		btnSaveChanges.click();
	}
	public void userIsLoggedIn() {
		Assert.assertTrue(userIsLoggedIn.isDisplayed());
	}


}
