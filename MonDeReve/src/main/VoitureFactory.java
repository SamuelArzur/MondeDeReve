package src.main;

public class VoitureFactory {
    public VehiculeDestructeur createVoiture(String voitureType) {
        return new Voiture();
    }
}