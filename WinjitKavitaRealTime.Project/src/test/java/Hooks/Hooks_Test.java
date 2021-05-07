package Hooks;

import org.testng.annotations.Test;

import ConfigReader.ConfigDataProvider;
import TestContext.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks_Test{
	
	public ConfigDataProvider config;

	@Before("@Test")
	public  void setDriver() {
		config = new ConfigDataProvider();
		BaseClass.BrowserFactory(config.getBrowser());
	}
	@After("@Test")
	public void tearDownDriver(Scenario scenario) {
	
		BaseClass.TakeScreenShot(scenario);
	}
}
