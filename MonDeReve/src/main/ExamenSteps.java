package src.main;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.beans.beancontext.BeanContextChild;
import static org.junit.Assert.*;

public class ExamenSteps {
    Ville ville;

    @Given("deux habitants de la ville (.*) sans titre (.*) titre (.*)")
    public void deux_habitants_de_la_ville_sans_titre_titre(String arg1, String arg2, String arg3) {
        ville = new Ville();
        Habitant h1 = new Habitant(arg1,12);
        Habitant h2 = new Habitant(arg2,24);

        h2.setTitre(arg3);
        ville.ajouterHabitant(h1);
        ville.ajouterHabitant(h2);
    }
    @When("les 2 habitants passent l'examen")
    public void les_2_habitants_passent_l_examen() {
        for (Habitant h :
             ville.getHabitants()) {
            ville.examenNinja(h);
        }
    }
    @Then("l'(.*) est devient (.*) et l'(.*) devient (.*)")
    public void l_est_devient_et_l_devient(String arg1, String arg2, String arg3, String arg4) {
        for (Habitant h :
                ville.getHabitants()) {
            if(h.getNom().equals(arg1)){
                assertEquals(arg2,h.getTitre());
            }
            else if(h.getNom().equals(arg3)){
                assertEquals(arg4,h.getTitre());
            }
        }
    }
}
