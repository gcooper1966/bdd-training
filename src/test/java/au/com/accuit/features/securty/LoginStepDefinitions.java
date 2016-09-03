package au.com.accuit.features.securty;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Graeme Cooper on September 3, 2016.
 * LoginStepDefinitions provides the test wrapper around
 * the steps contained in the login story.
 */
public class LoginStepDefinitions {

    @Given("I am a new user")
    public void aNewUser(){ }

    @When("I register")
    public void registerUser(){ }

    @When("I provide my credentials")
    public void addCredentials(){ }

    @When("I provide my name")
    public void addName() { }

    @Then("the system saves the user's details")
    public void checkDetails() { }

    @Then("the system saves the credentials")
    public void checkCredentials() { }

}
