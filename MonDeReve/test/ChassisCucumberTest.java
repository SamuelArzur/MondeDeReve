package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import src.main.Chassis;

import static org.junit.Assert.assertEquals;

public class ChassisCucumberTest {
    private Chassis chassis;

    @Given("le client crée un nouveau chassis sans spécifier son poids")
    public void leClientCreeUnNouveauChassisSansSpecifierSonPoids() {
        chassis = new Chassis();
    }

    @When("le client applique au chassis un (\\d+) positif")
    public void leClientAppliqueAuChassisUnPoidsPositif(int poids) {
        chassis.setPoids(poids);
    }

    @Then("le chassis est créé et son (\\d+) est celui indiqué en entrée")
    public void leChassisEstCreeEtSonPoidsEstCeluiIndiqueEnEntree(int poids) {
        assertEquals(poids, chassis.getPoids());
    }

    @When("le client applique au chassis un (\\d+) négatif")
    public void leClientAppliqueAuChassisUnPoidsNegatif(int poids) {
        chassis.setPoids(poids);
    }

    @Then("le chassis est créé et son poids est enregistré avec une valeur de (\\d+)")
    public void leChassisEstCreeEtSonPoidsEstEnregistreAvecUneValeurDeZero(int poids) {
        assertEquals(poids, chassis.getPoids());
    }
}
