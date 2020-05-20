package src.main;

import src.main.Habitant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Décrivez votre classe Ville ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Ville
{
    private int superficie;
    private String nom;
    private ArrayList<Habitant> habitants;


    /**
     * Constructeur d'objets de classe Ville
     */
    public Ville()
    {
        // initialisation des variables d'instance
        this.habitants = new ArrayList<Habitant>();
    }

    public int getSuperficie(){
        return this.superficie;
    }
    
    public void setSuperficie(int superficie){
        this.superficie = superficie;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }

    public List<Habitant> getHabitants() {
        List<Habitant> unmodifiableList = Collections.unmodifiableList(this.habitants);
        return unmodifiableList;
    }

    public void setHabitants(ArrayList<Habitant> habitants) {
        for (Habitant h : this.habitants){
            h.setVille(null);
        }
        this.habitants = habitants;
        for (Habitant h : habitants) {
            if(h.getVille() != this){
                h.setVille(this);
            }
        }
    }


    public int nouvellesParcelles(int superficie){
        this.superficie += superficie;
        return this.superficie;
    }
    
    public String examenNinja(Habitant habitant){
        habitant.evoluer();
        return "Nouveau titre : "+habitant.getTitre();
    }

    public void ajouterHabitant(String nom, int age) throws Exception {
        if(age <0){
            throw new Exception("On ne peut pas ajouter un habitant avec un age négatif");
        }
        else {
            Habitant habitant = new Habitant(nom, age);
            habitant.setVille(this);
            if (!habitants.contains(habitant)) habitants.add(habitant);
        }
    }

    public void ajouterHabitant(Habitant h){
        if(h.getVille() != this)h.setVille(this);
        if(!habitants.contains(h)) habitants.add(h);
    }

    public int nbHabitants(){
        return habitants.size();
    }

    public void bataille(Ville adversaire){
        for (Habitant h:
             adversaire.getHabitants()) {
            this.ajouterHabitant(h);
        }
        this.setSuperficie(this.getSuperficie()+adversaire.getSuperficie());
        adversaire.viderVille();
    }

    public void viderVille(){
        this.setSuperficie(0);
        habitants.clear();
    }
}
