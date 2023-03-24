package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.Post;

public class PostSteps {
    @Steps
    Post post;

    @Given("I am on the home page")
    public void onTheHomePage(){
        post.onTheHomePage();
    }
    @When("I create a post")
    public void createAPost(){
        post.createAPost();
    }
    @And("I click post button")
    public void clickPostButton(){
        post.clickPostButton();
    }
    @Then("I am finish my post")
    public void finishMyPost(){
        post.finishMyPost();
    }
}
