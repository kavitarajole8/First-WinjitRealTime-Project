package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Interact;

public class LoginLogoutPage extends Interact {

	private WebDriver driver;

	//Create constructor
	public LoginLogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@name='identity']") WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-flat']") WebElement LoginClick;

	public void LoginModule(String uname, String passwrd) throws Exception {
		username.clear();
		setElement(username, uname);

		password.clear();
		setElement(password, passwrd);
		Thread.sleep(2000);

		ClickOnElement(LoginClick);

	}
	
	@FindBy(xpath = "//span[@class='hidden-xs']") WebElement signOut;
	@FindBy(xpath = "//a[normalize-space()='Sign Out']") WebElement signOutClick;
	
	public void SignOut() throws Exception {
		
		ClickOnElement(signOut);
		ClickOnElement(signOutClick);
		
		
	}
	
}
