package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	
	public BasePage(org.openqa.selenium.WebDriver _driver) {
		PageFactory.initElements(_driver, this);
		this.driver = _driver;
	}
	
	protected void waitForElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	protected void waitForElementVisible(WebElement element, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getCurrentUrl() {	return driver.getCurrentUrl(); }
}
