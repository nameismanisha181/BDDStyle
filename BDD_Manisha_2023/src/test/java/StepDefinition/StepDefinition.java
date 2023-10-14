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
import io.netty.util.internal.SystemPropertyUtil;

public class StepDefinition {
	
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
	@Given("User is on home page")
	public void user_is_on_home_page() {
	    driver.get("https://demo.actitime.com/login.do");
	}
	
	@Given("User is on Home page.Click on users tab")
	public void user_is_on_home_page_click_on_users_tab() {
	   System.out.println();
	}


	@When("User enter id and password")
	public void user_enter_id_and_password() {
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	
	  
	}

	@Then("Click on Login button")
	public void click_on_login_button() {
	   driver.findElement(By.id("loginButton")).click();
	}

	

	@When("Add new user")
	public void add_new_user() throws InterruptedException {
		Thread.sleep(3000);
	    System.out.println("User adds new user");
	}


	@Then("New user should get added on page")
	public void new_user_should_get_added_on_page() {
		 System.out.println("New user gets adde on page");
	}

	@Given("User is on Home page. Click on Taks tab")
	public void user_is_on_home_page_click_on_taks_tab() {
		System.out.println("New user gets adde on page");
	}

	@When("Add Task")
	public void add_task() {
		System.out.println("Add new task");
	}

	@Then("Task should get added to page")
	public void task_should_get_added_to_page() {
		System.out.println("New task added to page");
	}

	@When("Verify logout button")
	public void verify_logout_button() {
		System.out.println("Verify logout button");
	}

	@Then("Logout button should be present")
	public void logout_button_should_be_present() {
		System.out.println("Logout button is present");
	}

}
