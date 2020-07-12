package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createSignature {
	public WebDriver ldriver; 

	public createSignature(WebDriver rdriver) {
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

	@FindBy(xpath = "//*[@id=\'gb\']/div[2]/div[2]/div[3]/div[3]/a")
	@CacheLookup
	WebElement btnSetting;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div/button[2]")
	@CacheLookup
	WebElement btnAdvSetting;
	
	@FindBy(xpath = "//*[@id=\':z3\']")
	@CacheLookup
	WebElement btnCreateSignature;
	
	@FindBy(xpath = "//*[@id=\':19b.in\']")
	@CacheLookup
	WebElement txtSignature;
	
	@FindBy(xpath = "/html/body/div[48]/div[3]/button[1]")
	@CacheLookup
	WebElement btnCreate;
	
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
	
	public void clickSettings() {
		btnSetting.click();
	}
	
	public void clickAdvSettings() {
		btnAdvSetting.click();
	}
	
	public void clickCreatesignature() {
		btnCreateSignature.click();
	}
	
	public void setSignature(String signature) {
		txtSignature.clear();
		txtSignature.sendKeys(signature);
	}
	
	public void clickCreate() {
		btnCreate.click();
	}
	
	public void userIsLoggedIn() {
		Assert.assertTrue(userIsLoggedIn.isDisplayed());
	}


}
