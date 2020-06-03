package test;

import org.junit.Before;
import org.junit.Test;
import src.main.AttaqueForce;
import src.main.Context;
import src.main.Ville;

import static org.junit.Assert.*;

public class ContextTest {
    Context context;
    Ville ville;

    @Before
    public void setUp() throws Exception {
        context = new Context(new AttaqueForce());
        ville = new Ville();
        for(int i =0; i<4;i++){
            ville.ajouterHabitant("habitant"+i,i);
        }
    }

    @Test
    public void testExecuteAttaque() throws Exception {
        assertTrue(context.executeAttaque(4,ville));
        for(int i =0; i<4;i++){
            ville.ajouterHabitant("habitant"+i,i);
        }
        assertTrue(context.executeAttaque(6,ville));
        for(int i =0; i<6;i++){
            ville.ajouterHabitant("habitant"+i,i);
        }
        assertFalse(context.executeAttaque(4,ville));
        assertEquals(6,ville.nbHabitants());
    }
}