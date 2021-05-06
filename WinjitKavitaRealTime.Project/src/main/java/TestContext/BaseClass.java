package TestContext;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public  static WebDriver driver;

	public static WebDriver BrowserFactory(String BrowserName) {

		if (BrowserName.equals("Chrome")) {

			//Capability provider
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--lang=en");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}

		else if(BrowserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}

		else {
			System.out.println("Driver not supported.");
		}

		return driver;
	}

	public static WebDriver TakeScreenShot(Scenario scenario) {

		try {
			String screenshotname = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("This is my failure message");
				TakesScreenshot ts = (TakesScreenshot) driver;
				//collect ss
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotname);
			}
		}

		catch(Exception exception) {
			exception.printStackTrace();
		}
		return driver;


	}

	public static WebDriver tearDown() {

		if (driver !=null) {
			driver.close();
		}
		return driver;

	}



}
