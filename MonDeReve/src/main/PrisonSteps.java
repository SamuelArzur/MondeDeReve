package src.main;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class PrisonSteps {
    Ville ville1;
    @Given("une ville (.*) avec ses habitants(\\d+)")
    public void une_ville_avec_ses_habitants(String arg1, int arg2) {
        throw new PendingException();
    }
    @When("un (.*) perd tous ces points")
    public void un_perd_tous_ces_points() {
        throw new PendingException();
    }

    @Then("l'(.*) est mis en prison (\\d+) puis regagne (\\d+)>")
    public void l_est_mis_en_prison_puis_regagne(String arg1, int arg2, int arg3) {
        throw new PendingException();
    }
}
