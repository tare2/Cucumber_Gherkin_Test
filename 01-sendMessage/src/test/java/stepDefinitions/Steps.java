package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.sendMsg;

public class Steps {
	
	public WebDriver driver;
	public sendMsg lp;
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		lp = new sendMsg(driver);
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

	@When("User click on Compose")
	public void user_click_on_Compose() {
	    lp.clickCompose();
	}

	@When("User sends email to {string}")
	public void user_sends_email_to(String email) {
	    lp.setTo(email);
	}

	@When("User writes email subject {string}")
	public void user_writes_email_subject(String subject) {
	    lp.setSubject(subject);
	}

	@When("User writes content {string}")
	public void user_writes_content(String msg) {
	    lp.setMsg(msg);
	}

	@When("User click on Send")
	public void user_click_on_Send() {
	    lp.clickSend();
	}

	@Then("sending message process is completed")
	public void sending_message_process_is_completed() {
	    
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}

}
