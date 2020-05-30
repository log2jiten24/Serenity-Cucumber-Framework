package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.Dashboard;
import pages.HomePage;

public class LoginToApplication {
	
	@Steps
	HomePage home;
	
	@Steps
	Dashboard dash;
	
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    home.openApplication();
	}

	@When("user enter admin as username")
	public void user_enter_admin_as_username() {
		home.enterUsername();
	}

	@When("user enter admin{int} as password")
	public void user_enter_admin_as_password(Integer int1) {
	   home.enterPassword();
	   home.clickOnLoginButton();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	   dash.verifyAdmin();
	}

	
	
}
