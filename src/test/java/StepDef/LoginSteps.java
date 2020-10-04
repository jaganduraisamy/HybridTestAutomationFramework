package StepDef;

import POJO.User;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class LoginSteps {
	@Given("^I have launched FB login page$")
	public void iHaveLaunchedFBLoginPage() {
		System.out.println("----iHaveLaunchedFBLoginPage");
	}
	
	@When("^I enter invalid username$")
	public void iEnterInvalidUsername() {
		System.out.println("----iEnterInvalidUsername");
	}
	
	@And("^I enter invalid password$")
	public void iEnterInvalidPassword() {
		System.out.println("----iEnterInvalidPassword");
	}
	
	@And("^I click on login button$")
	public void iClickOnLoginButton() {
		System.out.println("----iClickOnLoginButton");
	}
	
	@Then("^I should see error message$")
	public void iShouldSeeErrorMessage() {
		System.out.println("----iShouldSeeErrorMessage");
	}
	
	@When("^I enter username is \"([^\"]*)\"$")
	public void iEnterUsernameIs(String username) throws Throwable {
		System.out.println("----iEnterUsernameIs => " + username);
	}
	
	@And("^I enter password is \"([^\"]*)\"$")
	public void iEnterPasswordIs(String password) throws Throwable {
		System.out.println("----iEnterPasswordIs => " + password);
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
