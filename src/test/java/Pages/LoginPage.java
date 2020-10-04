package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(how = How.ID, using = "pass")
	public WebElement txtPassword;
	
	@FindBy(how = How.ID, using = "email")
	public WebElement txtUsername;
	
	@FindBy(how = How.ID, using = "u_0_b")
	public WebElement btnLogin;
	
}
