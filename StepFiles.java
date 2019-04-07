package FMStepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepFiles extends Hooks{
	
	@Given("^User is on site$")
	public void user_is_on_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\AUTOMATION TESTING\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");

	   
	}

	@Given("^enteres uername as \"([^\"]*)\"$")
	public void enteres_uername_as(String arg1) throws Throwable {
	}

	@Given("^enters username as \"([^\"]*)\"$")
	public void enters_username_as(String arg1) throws Throwable {
	    
	}

	@When("^user clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String arg1) throws Throwable {
	    
	}

	@Then("^user can see home page$")
	public void user_can_see_home_page() throws Throwable {
	    
	}


}
