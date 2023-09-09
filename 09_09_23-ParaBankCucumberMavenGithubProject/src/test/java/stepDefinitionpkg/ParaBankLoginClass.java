package stepDefinitionpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParaBankLoginClass {
	
	public WebDriver d;
	
	@Given("^Setup and Launch Site$")
	public void setup_and_Launch_Site() throws Throwable 
	{
	 d = new ChromeDriver();
	 d.get("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("^Enter UserName and Password$")
	public void enter_UserName_and_Password() throws Throwable 
	{
	    WebElement un = d.findElement(By.xpath("//*[@id=\'loginPanel\']/form/div[1]/input"));
	    un.click();
	    un.sendKeys("Vihaankahere");
	    
	    WebElement pwd = d.findElement(By.xpath("//*[@id=\'loginPanel\']/form/div[2]/input"));
	    pwd.click();
	    pwd.sendKeys("Pass@123");
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable 
	{
		WebElement login = d.findElement(By.xpath("//*[@id=\'loginPanel\']/form/div[3]/input"));
		login.click();
		
		String pgttl = d.getTitle();
		
		System.out.println(pgttl);
		
		WebElement logout = d.findElement(By.xpath("//*[@id=\'leftPanel\']/ul/li[8]/a"));
		logout.click();
	}

}
