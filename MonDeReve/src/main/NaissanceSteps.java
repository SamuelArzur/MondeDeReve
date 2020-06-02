package src.main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class NaissanceSteps {
    Ville ville;

    @Given("le nom de la (.*) qui contient (\\d+) habitants")
    public void le_nom_de_la_qui_contient_habitants(String arg1, int arg2) {
        ville = new Ville();
        ville.setNom(arg1);

        for (int i = 0;i<arg2;i++){
            Habitant h = new Habitant();
            ville.ajouterHabitant(h);
        }
        assertEquals(arg2,ville.nbHabitants());
    }
    @When("les 3 habitants sont ajoutés les 3 (.*) (.*) (.*) de Ninja")
    public void les_3_habitants_sont_ajoutes(String arg1, String arg2, String arg3) throws Exception {
        ville.ajouterHabitant(arg1,0);
        ville.ajouterHabitant(arg2,0);
        ville.ajouterHabitant(arg2,0);
    }
    @Then("Le village compte (\\d+) habitants et leur ville (.*) est bien attribué automatiquement")
    public void le_village_compte_7_habitants_et_leur_est_bien_attribue_automatiquement(int arg1,String arg2) {
        assertEquals(arg1,ville.nbHabitants());
        for (Habitant h:
             ville.getHabitants()) {
            assertEquals(arg2,h.getVille().getNom());
        }
    }
}
