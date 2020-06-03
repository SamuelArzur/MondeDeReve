package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import src.main.Roue;
import src.main.Voiture;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RoueCucumberTest {
    private Voiture voitureTransformers;
    List<Roue> list = new ArrayList<>();

    @Given("le client crée (\\d+) roues et souhaite les associer à une voiture existante")
    public void leClientCreeDesRoues(int nbRoues) {
        voitureTransformers = new Voiture("Mercedes", "Rouge");
        for (int i = 0; i < nbRoues; i++) {
            list.add(new Roue());
        }
    }

    @When("le client applique les roues à la voiture")
    public void leClientAppliqueLesRouesALaVoiture() {
        for (Roue roue : list) {
            voitureTransformers.addRoue(roue);
        }
    }

    @Then("La voiture possède (\\d+) roues")
    public void laVoiturePossedeDesRoues(int nbRoue) {
        assertEquals(nbRoue, voitureTransformers.getRoues().size());
    }
}