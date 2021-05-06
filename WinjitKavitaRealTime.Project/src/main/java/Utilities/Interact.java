package Utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestContext.BaseClass;

public class Interact extends BaseClass{
	//Getter
	public WebDriver getDriver() {
		return driver;

	}
	//Setter
	public void setDriver(WebDriver d) {

		this.driver = d;

	}

	public void ClickOnElement(WebElement webelement) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webelement));
		element.click();
	}
	public WebElement setElement(WebElement webelement, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webelement));
		element.sendKeys(text);
		return element;
		
	}
	public void elementOverActions(WebElement webElement) {
		Actions builder = new Actions(driver);
//		Action mouseOverHome = builder.moveToElement(webElement).build();
//		mouseOverHome.perform();
		builder.moveToElement(webElement).build().perform();
		
	}
	public void elementClickActions(WebElement webelement) {
		Actions builder = new Actions(driver);
		builder.moveToElement(webelement).click().build().perform();
		
	}
	public static WebDriver SwitchToPopUp() {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> iterator = window.iterator();
		String ModalWindow = iterator.next();
		driver.switchTo().window(ModalWindow);
		return driver;
		
	}
	public static WebDriver SwitchBack() {
		driver.switchTo().defaultContent();
		return driver;
		
	}
}
