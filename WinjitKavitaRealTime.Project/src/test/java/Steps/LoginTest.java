package Steps;

import java.util.concurrent.TimeUnit;

import ConfigReader.ConfigDataProvider;
import TestContext.BaseClass;
import TestContext.TestContextUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseClass{
	TestContextUI testContextUI;
	public ConfigDataProvider config;
	
	public LoginTest(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}

	
	
	@Given("User Launching the application")
	public void user_launching_the_application() {
	   config = new ConfigDataProvider();
	   driver.get(config.getStagingURL());
	   testContextUI.setDriver(driver);
	   testContextUI.initializePageObjectClasses(driver);
	   
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   
	}

	@When("User login the application")
	public void user_login_the_application() throws Exception {
	   
		testContextUI.getLoginLogout().LoginModule(config.getUsername(), config.getPassword());
		System.out.println("User Logged In");
		
	}

	@Then("User successfully on the home page")
	public void user_successfully_on_the_home_page() {
	   
		System.out.println("Home Page");
	}

	
	@Then("user logout the application")
	public void user_logout_the_application() throws Exception {
		
		testContextUI.getLoginLogout().SignOut();
		System.out.println("User Logged Out");
		
	    
	}

}
