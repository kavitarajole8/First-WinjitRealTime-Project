package Steps;

import ConfigReader.ConfigDataProvider;
import TestContext.BaseClass;
import TestContext.TestContextUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ProductTest extends  BaseClass {

	TestContextUI testContextUI;
	public ConfigDataProvider config;
	
	public ProductTest(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}
	
	@Given("Click on product")
	public void click_on_product() {
	   
	}

	@When("Opening the Add Product")
	public void opening_the_add_product() {
	    
	}

	@When("User filling the following information")
	public void user_filling_the_following_information(io.cucumber.datatable.DataTable dataTable) {
	   
	}

}
