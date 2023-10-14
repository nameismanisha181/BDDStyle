package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionScenarioOutline {

	WebDriver driver;
    @Before
    public void login()
    {
    	WebDriverManager.firefoxdriver().setup();
    	driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    }
    
    @After
    public void CloseApp()
    {
    	driver.quit();
    }
	@Given("Enter AUT url")
	public void enter_aut_url() {
	  driver.get("https://demo.actitime.com/login.do");
	}
	@When("Enter {string} and {string}")
	public void enter_and(String id, String password) {
	  driver.findElement(By.id("username")).sendKeys(id);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	}
	@Then("Hit Login button")
	public void hit_login_button() {
	   driver.findElement(By.id("loginButton"));
	}



}
