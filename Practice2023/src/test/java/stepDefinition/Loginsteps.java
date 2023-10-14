package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	@Given("Open login page")
	public void open_login_page() {
	   
		System.out.println("Done");
	}

	@When("Enter userid and password")
	public void enter_userid_and_password() {
	    
	}

	@And("Click on login button")
	public void click_on_login_button() {
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
	   
	}

}
