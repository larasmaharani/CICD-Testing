package starter.stepdesfinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.product;

public class productsteps {

    @Steps
    product product;

    //  [Positive] Get all products
    @Given("I set a GET endpoints")
    public void setGetEndpoints() {
        product.setGetEndpoints();
    }
    @When("I send HTTP GET request")
    public void getHTTPrequest() {
        product.getHTTPrequest();
    }
    @Then("I receive a valid Get HTTP response code 200 OK")
    public void HTTPresponse200() {
        product.HTTPresponse200();
    }
    @And("I receive valid data for all product details")
    public void valiData() {
        product.valiData();
    }
}
