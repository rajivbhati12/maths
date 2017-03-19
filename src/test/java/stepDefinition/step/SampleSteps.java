package test.java.stepDefinition.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

/**
 * Created by rajivbhati on 3/18/17.
 */

@StepDefAnnotation
public class SampleSteps {
    @Given("^the sample state$")
    public void the_sample_state() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I do this$")
    public void i_do_this() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I will get that$")
    public void i_will_get_that() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
