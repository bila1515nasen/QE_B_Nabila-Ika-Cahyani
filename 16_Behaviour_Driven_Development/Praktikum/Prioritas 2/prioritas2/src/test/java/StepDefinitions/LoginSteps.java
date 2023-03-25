package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("I am on the login page");
    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("Enter username and password");
    }
    @When("I click login button")
    public void i_click_login_button() {
        System.out.println("Click login button");
    }
    @Then("I am logged in successfully")
    public void i_am_logged_in_successfully() {
        System.out.println("logged in successfully");
    }
}
