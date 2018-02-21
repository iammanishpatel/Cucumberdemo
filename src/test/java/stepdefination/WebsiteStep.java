package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebsiteStep {
	WebDriver driver = null;
	
	@Given("^Open browser and start application$")
	public void open_browser_and_start_application() {
	    System.setProperty("webdriver.chrome.driver","src//resources//chromedriver.exe");
	    if(driver == null)
	    driver = new ChromeDriver();
		driver.get("https://www.website.com/sign-in/");
		driver.manage().window().maximize();
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("manish121212");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qwerty12345");
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() {
		driver.findElement(By.xpath("//button[@id='signin-submit2']")).click();
	}
	
}
