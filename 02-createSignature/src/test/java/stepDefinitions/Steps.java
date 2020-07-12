package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.createSignature;

public class Steps {
	
	public WebDriver driver;
	public createSignature lp; 
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		lp = new createSignature(driver);
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
	    
	}

	@When("User click on settings")
	public void user_click_on_settings() {
	    lp.clickSettings();
	}

	@When("User click on see all settings")
	public void user_click_on_see_all_settings() {
	    lp.clickAdvSettings();
	}

	@When("User presses on create new signature")
	public void user_presses_on_create_new_signature() {
	    lp.clickCreatesignature();
	}

	@When("User writes content {string}")
	public void user_writes_content(String signature) {
	    lp.setSignature(signature);
	}

	@When("User click on Create")
	public void user_click_on_Create() {
	    lp.clickCreate();
	}

	@Then("Making signature process is completed")
	public void making_signature_process_is_completed() {
	    
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}

}
