package src.main;

public class AttaqueForce implements Attaque{

    @Override
    public boolean envahir(int nbVoiture, Ville ville) {
        ville.viderVille();
        return nbVoiture>=ville.nbHabitants();
    }
}
