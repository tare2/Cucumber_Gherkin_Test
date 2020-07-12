package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.offlineEmail;

public class Steps {
	
	public WebDriver driver;
	public offlineEmail lp; 
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		lp = new offlineEmail(driver);
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

	@When("User click on offline choise")
	public void user_click_on_offline_choise() {
	    lp.clickOffline();
	}

	@When("User presses on Enable offline mail")
	public void user_presses_on_Enable_offline_mail() {
	    lp.clickEnableCheckpoint();
	}

	@When("User presses on Keep offline data on my computer")
	public void user_presses_on_Keep_offline_data_on_my_computer() {
	    lp.clickKeepingData();
	}

	@When("User click on Save Changes")
	public void user_click_on_Save_Changes() {
	    lp.clickSaveChanges();
	}

	@Then("offline mail process is completed")
	public void offline_mail_process_is_completed() {
	     
	}

}
