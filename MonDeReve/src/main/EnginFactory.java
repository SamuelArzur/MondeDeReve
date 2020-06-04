package src.main;

public class EnginFactory {
    public Engin createVoiture(String voitureType) {
        return new Voiture();
    }
}
