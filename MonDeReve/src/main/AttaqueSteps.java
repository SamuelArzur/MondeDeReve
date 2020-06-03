package src.main;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AttaqueSteps {
    Ville ville1;
    List<Voiture> hordeVoitures;
    @Given("une (.*) de (\\d+) et une horde de voiture (\\d+)")
    public void une_de_et_une_horde_de_voiture(String arg1, int arg2,int arg3) throws Exception {
        ville1 = new Ville();
        ville1.setNom(arg1);
        for(int i =0; i<arg2;i++){
            ville1.ajouterHabitant("habitant"+i,i+10);
        }

        hordeVoitures = new ArrayList<Voiture>();
        for(int i = 0; i<arg3; i++){
            hordeVoitures.add(new Voiture());
        }
    }
    @When("(\\d+) attaque la ville de (\\d+)")
    public void attaque_la_ville_de(int arg1, int arg2) {
        Context context = new Context(new AttaqueForce());

        context.executeAttaque(hordeVoitures.size(),ville1);
    }
    @Then("les voitures gagnent la ville est vide et elle a (\\d+)")
    public void les_voitures_gagnent_la_ville_est_vide_et_elle_a(int arg1) {
        assertEquals(arg1, ville1.nbHabitants());
    }
}
