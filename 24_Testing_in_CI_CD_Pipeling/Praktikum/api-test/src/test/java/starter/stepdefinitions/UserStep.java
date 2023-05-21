package starter.stepdefinitions;

import com.ibm.icu.impl.number.Endpoint;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;

public class UserStep {

    @Step
    Get  get;
    @Given("I set GET api endpoint")
    public void setGetApiEndpoint(){
    get.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
    get.sendGetHttpRequest
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse(){
    get.receiveValidHttpResponseCode200();
    }
    @And("I receive valid data for detail user")
    public void receiveValidDaraForDetailUser(){
    get.receivevaliddatafordetailuser();
    }

}
