package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sendMsg {
	public WebDriver ldriver; 

	public sendMsg(WebDriver rdriver) {
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

	@FindBy(xpath = "//*[@id=\':jm\']/div/div")
	@CacheLookup
	WebElement btnCompose;
	
	@FindBy(xpath = "//*[@id=\':pa\']")
	@CacheLookup
	WebElement txtTo;
	
	@FindBy(xpath = "//*[@id=\':os\']")
	@CacheLookup
	WebElement txtSubject;
	
	@FindBy(xpath = "//*[@id=\':px\']")
	@CacheLookup
	WebElement txtMsg;
	
	@FindBy(xpath = "//*[@id=\':oi\']")
	@CacheLookup
	WebElement btnSend;
	
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
	
	public void clickCompose() {
		btnCompose.click();
	}
	
	public void setTo(String email) {
		txtTo.clear();
		txtTo.sendKeys(email);
	}
	
	public void setSubject(String subject) {
		txtSubject.clear();
		txtSubject.sendKeys(subject);
	}
	
	public void setMsg(String msg) {
		txtMsg.clear();
		txtMsg.sendKeys(msg);
	}
	
	public void clickSend() {
		btnSend.click();
	}

	public void userIsLoggedIn() {
		Assert.assertTrue(userIsLoggedIn.isDisplayed());
	}

}
