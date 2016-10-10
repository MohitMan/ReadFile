package ReadFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReadFile {
	
	WebDriver driver;
	
	@Given("^URL details for google$")
	public void url_details_for_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
	}

	@When("^I search anything$")
	public void i_search_anything() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("lst-ib")).sendKeys("Hi");
	}

	@Then("^I should see page coordinate$")
	public void i_should_see_page_coordinate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.findElement(By.id("lst-ib")).getLocation());
		driver.quit();
	}
}
