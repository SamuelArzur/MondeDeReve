package src.main;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class AbsorptionSteps {
    Ville ville1;
    Ville ville2;
    @Given("une (.*) de (\\d+) habitants et (\\d+) et une (.*) de (\\d+) habitants et (\\d+)")
    public void une_de_habitants_et_et_une_de_habitants_et(String arg1, int arg2,int arg3, String arg4, int arg5, int arg6) {
        ville1 = new Ville();
        ville1.setNom(arg1);
        ville1.setSuperficie(arg3);
        for(int i =0; i<arg2;i++){
            Habitant h = new Habitant();
            ville1.ajouterHabitant(h);
        }

        ville2 = new Ville();
        ville2.setNom(arg4);
        ville2.setSuperficie(arg6);
        for(int i =0; i<arg5;i++){
            Habitant h = new Habitant();
            ville2.ajouterHabitant(h);
        }
    }
    @When("une bataille eclate")
    public void une_bataille_eclate() {
        ville1.bataille(ville2);
    }
    @Then("la ville (.*) compte (\\d+) et (\\d+) et (.*) est vide")
    public void la_ville_compte_et_et_est_vide(String arg1, int arg2, int arg3, String arg4) {
        assertEquals(arg1,ville1.getNom());
        assertEquals(arg2,ville1.nbHabitants());
        assertEquals(arg3,ville1.getSuperficie());
        for (Habitant h:
                ville1.getHabitants()) {
            assertEquals(arg1,h.getVille().getNom());
        }

        assertEquals(arg4,ville2.getNom());
        assertEquals(0,ville2.nbHabitants());
        assertEquals(0,ville2.getSuperficie());
    }
}
