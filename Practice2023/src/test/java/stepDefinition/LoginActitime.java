package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginActitime {

	WebDriver driver;
@Before
public void setUp()
{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
}
@BeforeStep
public void demo1()
{
	System.out.println("Before each step");
}

@AfterStep
public void demo2()
{
	System.out.println("After each step");
}

@After
public void tearDown()
{
	driver.close();
}
@Given("User is on home page")
public void user_is_on_home_page() {
   driver.get("https://demo.actitime.com/login.do");
}
@When("Give  and password and click on login")
public void give_and_password_and_click_on_login() {
   driver.findElement(By.name("username")).sendKeys("admin");
   driver.findElement(By.name("pwd")).sendKeys("admin");
   driver.findElement(By.id("loginButton")).click();
}

}
