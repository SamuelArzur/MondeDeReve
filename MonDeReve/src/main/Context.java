package src.main;

public class Context {
    Attaque atq;

    public Context(Attaque atq){
        this.atq = atq;
    }
    public boolean executeAttaque(int nbVoiture, Ville ville){
        boolean ret = false;
        if(nbVoiture>=ville.nbHabitants()){
            atq = new AttaqueForce();
            ret = atq.envahir(nbVoiture,ville);
        }
        else{
            //code d'abandon
        }
        return ret;
    }
}
