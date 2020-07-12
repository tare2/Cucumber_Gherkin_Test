package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.changePass;

public class Steps {
	
	public WebDriver driver;
	public changePass lp; 
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		lp = new changePass(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string}")
	public void user_enters_Email_as(String email) {
		lp.setEmail(email);
	}

	@When("Click on Next")
	public void click_on_Next() {
		lp.clickLogin1();
	}

	@When("User enters Password as {string}")
	public void user_enters_Password_as(String pwd) {
		lp.setPassword(pwd);
	}

	@When("Click on login")
	public void click_on_login() {
		lp.clickLogin2();
	}

	@Then("User is logged in")
	public void user_is_logged_in() {
	    lp.userIsLoggedIn();
	}

	@When("User click on Manage Labels")
	public void user_click_on_Manage_Labels() {
		lp.clickManageLabels();
	}

	@When("User click on Accounts and Import")
	public void user_click_on_Accounts_and_Import() {
	    lp.clickAccounts();
	}

	@When("User click on Change Password")
	public void user_click_on_Change_Password() {
	    lp.clickChangePassword();
	}

	@When("User enters a new password as {string}")
	public void user_enters_a_new_password_as(String pass1) {
	    lp.setPassword1(pass1);
	}

	@When("User confirms the new password as {string}")
	public void user_confirms_the_new_password_as(String pass2) {
	    lp.setPassword2(pass2);
	}

	@Then("offline mail process is completed")
	public void offline_mail_process_is_completed() {
	    lp.clickConfirm();
	}

}
