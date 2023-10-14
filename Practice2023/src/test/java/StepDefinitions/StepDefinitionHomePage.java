package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionHomePage 
{
	WebDriver driver;
	//@Before("@smoke")
	@Before
	public void setUp()
	{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();		
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	   driver.get("https://demo.actitime.com/login.do");
	}
	@When("Enter id and password")
	public void enter_id_and_password() {
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	}
	@Then("Click on Login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("loginButton")).click();
	}
	@When("Click on user tab")
	public void click_on_user_tab() {
	   System.out.println("User tab");
	}
	@Then("User page should be displayed")
	public void user_page_should_be_displayed() {
	  System.out.println("user page");
	}

	@When("Click on logout")
	public void click_on_logout() {
	   System.out.println("click Logout");
	}
	@Then("User should get logged out")
	public void user_should_get_logged_out() {
	    System.out.println("log out");
	}
	
	@When("Enter <id> and <password>")
	public void enter_id_and_password(String id,String pwd) {
		driver.findElement(By.id("username")).sendKeys(id);
	    driver.findElement(By.name("pwd")).sendKeys(pwd);
		
	}






	
}
