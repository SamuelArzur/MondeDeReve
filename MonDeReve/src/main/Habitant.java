package src.main;

/**
 * Décrivez votre classe Habitant ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Habitant
{
    private String nom;
    private String titre;
    private int age;
    private Ville ville;
    /**
     * Constructeur d'objets de classe Habitant
     */
    public Habitant()
    {
        // initialisation des variables d'instance
    }

    public Habitant(String nom, int age)
    {
        this.nom = nom;
        this.age = age;
    }

    public Habitant(String nom, int age, Ville ville)
    {
        this.nom = nom;
        this.age = age;
        setVille(ville);
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        if (ville != null) {
            this.ville = ville;
            if (!ville.getHabitants().contains(this)) this.ville.ajouterHabitant(this);
        }
        {
            this.ville = ville;
        }
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setTitre(String titre){
        this.titre = titre;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void evoluer(){
        if(this.titre == null)
        {
            this.titre = "Ninja";
        }
        else if(this.titre.equals("Ninja")) {
            this.titre = "Hokage";
        }
    }
}
