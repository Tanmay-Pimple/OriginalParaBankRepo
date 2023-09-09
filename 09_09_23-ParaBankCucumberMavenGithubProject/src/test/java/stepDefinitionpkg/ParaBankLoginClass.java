package stepDefinitionpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParaBankLoginClass {
	
	@Given("^Setup and Launch Site$")
	public void setup_and_Launch_Site() throws Throwable 
	{
	 WebDriver d = new ChromeDriver();
	 d.get("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("^Enter UserName and Password$")
	public void enter_UserName_and_Password() throws Throwable 
	{
	    System.out.println("Browser Launched");
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable 
	{
		System.out.println("Website Launched");
	}

}
