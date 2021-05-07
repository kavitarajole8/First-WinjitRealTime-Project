package TestContext;

import org.openqa.selenium.WebDriver;

import Pages.LoginLogoutPage;
import Pages.ProductPage;

public class TestContextUI extends BaseClass{

	LoginLogoutPage loginLogoutPage;
	ProductPage productPage;
	
	public WebDriver getDriver() {
		return driver;
		
	}
	//constructor
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginLogoutPage getLoginLogout() {
		return loginLogoutPage;
		
	}
	public ProductPage getProductPage() {
		return productPage;
		
	}
	public void initializePageObjectClasses(WebDriver driver) {
		loginLogoutPage = new LoginLogoutPage(driver);
	//	productPage = new ProductPage(null);
	}
}
