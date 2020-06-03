package test;

import org.junit.Before;
import org.junit.Test;
import src.main.Attaque;
import src.main.AttaqueForce;
import src.main.Ville;

import static org.junit.Assert.*;

public class AttaqueForceTest {

    private AttaqueForce atq;
    private Ville ville;

    @Before
    public void setUp() throws Exception {
        atq = new AttaqueForce();
        ville = new Ville();
        for(int i =0; i<4;i++){
            ville.ajouterHabitant("habitant"+i,i);
        }
    }

    @Test
    public void testEnvahir() throws Exception {
        assertTrue(atq.envahir(4,ville));
        for(int i =0; i<4;i++){
            ville.ajouterHabitant("habitant"+i,i);
        }
        assertTrue(atq.envahir(6,ville));
        for(int i =0; i<6;i++){
            ville.ajouterHabitant("habitant"+i,i);
        }
    }
}