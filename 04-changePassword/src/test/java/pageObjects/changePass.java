package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class changePass {
	
	public WebDriver ldriver; 

	public changePass(WebDriver rdriver) {
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
	
	@FindBy(xpath = "//*[@id=\':2z\']/a")
	@CacheLookup
	WebElement btnAccountes;
	
	@FindBy(xpath = "//*[@id=\':1\']/div/div/div/div/div/div/div[4]/div/table/tbody/tr[1]/td[2]/div[1]/a")
	@CacheLookup
	WebElement btnChangePassword;
	
	@FindBy(xpath = "//*[@id=\'yDmH0d\']/c-wiz/div/div[3]/c-wiz/div/div[3]/div[1]/c-wiz/form/div[1]/div/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement txtWritePass;
	
	@FindBy(xpath = "//*[@id=\'yDmH0d\']/c-wiz/div/div[3]/c-wiz/div/div[3]/div[1]/c-wiz/form/div[3]/div/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement txtConfirmPass;
	
	@FindBy(xpath = "//*[@id=\'yDmH0d\']/c-wiz/div/div[3]/c-wiz/div/div[3]/div[2]/div/span/span")
	@CacheLookup
	WebElement btnConfirmChange;
	
	@FindBy(xpath = "//*[@id=\':jm\']/div/div")
	@CacheLookup
	WebElement userIsLoggedIn;
	
	@FindBy(xpath = "//*[@id=\'yDmH0d\']/c-wiz/div/c-wiz/div/div[1]/div[2]/div")
	@CacheLookup
	WebElement processCompleted;
	
	

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
	
	public void clickAccounts() {
		btnAccountes.click();
	}
	
	public void clickChangePassword() {
		btnChangePassword.click();
	}
	
	public void setPassword1(String pass1) {
		txtWritePass.clear();
		txtWritePass.sendKeys(pass1);
	}
	
	public void setPassword2(String pass2) {
		txtConfirmPass.clear();
		txtConfirmPass.sendKeys(pass2);
	}
	
	public void clickConfirm() {
		btnConfirmChange.click();
	}
	
	public void userIsLoggedIn() {
		Assert.assertTrue(userIsLoggedIn.isDisplayed());
	}
	
	public void processCompleted() {
		Assert.assertTrue(processCompleted.isDisplayed());
	}
	

}

