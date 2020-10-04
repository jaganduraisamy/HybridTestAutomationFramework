package Steps;

import Base.BaseUtil;
import POJO.User;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class LoginSteps extends BaseUtil {
	
	private BaseUtil base;
	
	public LoginSteps(BaseUtil base){
		this.base = base;
	}
	
	@Given("^I have launched FB login page$")
	public void iHaveLaunchedFBLoginPage() throws InterruptedException {
		base.Driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	@And("^I click on login button$")
	public void iClickOnLoginButton() throws InterruptedException {
		base.Driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(2000);
	}
	
	@Then("^I should see error message$")
	public void iShouldSeeErrorMessage() {
		System.out.println("----iShouldSeeErrorMessage");
	}
	
	@When("^I enter username is \"([^\"]*)\"$")
	public void iEnterUsernameIs(String username) throws Throwable {
		base.Driver.findElement(By.id("email")).sendKeys(username);
	}
	
	@And("^I enter password is \"([^\"]*)\"$")
	public void iEnterPasswordIs(String password) throws Throwable {
		base.Driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@And("^I enter credentials$")
	public void iEnterCredentials(DataTable table) {
		System.out.println("----iEnterPasswordIs => " + table.raw());
		List<User> users = table.asList(User.class);
		System.out.println("----iEnterPasswordIs => POJO " );
		
		for (User user:users) {
			System.out.println("User -> username => " +user.username);
			System.out.println("User -> password => " +user.password);
		}
	}
	
	@When("^I enter username is ([^\"]*)$")
	public void iEnterUsernameIsUser(String username) {
		System.out.println("User -> username => " +username);
	}
	
	@And("^I enter password is ([^\"]*)$")
	public void iEnterPasswordIsPassword(String password) {
		System.out.println("User -> password => " +password);
	}
}
