package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.main.Habitant;
import src.main.Ville;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Classe-test VilleTest.
 *
 * @author  Samuel
 * @version 1.0
 */
public class VilleTest
{
    private Ville Konoha;
    private Ville Suna;
    private Habitant gaara;
    private Habitant pikachu;



    /**
     * Constructeur de la classe-test VilleTest
     */
    public VilleTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        Konoha = new Ville();
        Suna = new Ville();
        gaara = new Habitant("Gaara", 14, Suna);
        pikachu = new Habitant("Pikachu", 6);
        Konoha.setSuperficie(1000);
        Konoha.setNom("Konoha");
        Suna.setSuperficie(500);

    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }


    @Test
    public void testConstructeurVide()
    {
        Konoha = new Ville();
        assertNotEquals(null,Konoha);
        assertEquals(null, Konoha.getNom());
        assertEquals(0,Konoha.getSuperficie());
        assertNotEquals(null,Konoha.getHabitants());
    }

    @Test
    public void testNouvellesParcelles()
    {
        assertEquals(2000, Konoha.nouvellesParcelles(1000));
    }

    @Test
    public void testNbHabitants()
    {
        assertEquals(0,Konoha.nbHabitants());
        try {
            Konoha.ajouterHabitant("Naruto", 12);
            Konoha.ajouterHabitant("Sasuke", 12);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(2, Konoha.nbHabitants());
    }


    @Test
    public void testGetSuperficie() {
        assertEquals(1000, Konoha.getSuperficie());
    }

    @Test
    public void testSetSuperficie() {
        Konoha.setSuperficie(1500);
        assertEquals(1500, Konoha.getSuperficie());
    }

    @Test
    public void testGetNom() {
        assertEquals("Konoha", Konoha.getNom());
    }

    @Test
    public void testSetNom() {
        Konoha.setNom("Village du vent");
        assertEquals("Village du vent", Konoha.getNom());
    }

    @Test(expected=UnsupportedOperationException.class)
    public void testGetHabitants() {
        Konoha.getHabitants().add(new Habitant());
    }

    /**
     * Tester l'association ville -> habitant
     */
    @Test
    public void testSetHabitants() {
        Habitant naruto = new Habitant("Naruto",12);
        Konoha.ajouterHabitant(naruto);
        ArrayList<Habitant> newList = new ArrayList<>();
        newList.add(gaara);
        newList.add(pikachu);

        Konoha.setHabitants(newList);
        for (Habitant h:
             Konoha.getHabitants()) {
            assertEquals(Konoha, h.getVille());
        }
        assertEquals(2,Konoha.nbHabitants());
        assertEquals(null,naruto.getVille());
    }

    @Test
    public void testExamenNinja()
    {
        try {
            Konoha.ajouterHabitant("Sasuke",12);
            Konoha.ajouterHabitant("Naruto",12);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Habitant h:
                Konoha.getHabitants() ) {
            assertEquals("Nouveau titre : Ninja", Konoha.examenNinja(h));
        }
    }

    @Test(expected=java.lang.Exception.class)
    public void testAjouterHabitantError() throws Exception{
            Konoha.ajouterHabitant("Sasuke",-3);
    }

    /**
     * Tester l'association ville -> habitant
     */
    @Test
    public void testAjouterHabitantParam() {
        try {
            Konoha.ajouterHabitant("Sasuke",12);
            Konoha.ajouterHabitant("Naruto",12);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(2,Konoha.nbHabitants());
        assertEquals("Sasuke",Konoha.getHabitants().get(0).getNom());
        assertEquals(12,Konoha.getHabitants().get(0).getAge());
        assertEquals("Naruto",Konoha.getHabitants().get(1).getNom());
        assertEquals(12, Konoha.getHabitants().get(1).getAge());

        assertEquals(Konoha,Konoha.getHabitants().get(0).getVille());
        assertEquals(Konoha,Konoha.getHabitants().get(1).getVille());
    }

    /**
     * Tester l'association ville -> habitant
     */
    @Test
    public void testAjouterHabitant() {
        Konoha.ajouterHabitant(gaara);
        assertEquals(1,Konoha.nbHabitants());
        assertEquals("Gaara", Konoha.getHabitants().get(Konoha.getHabitants().size()-1).getNom());
        assertEquals(Konoha ,Konoha.getHabitants().get(Konoha.getHabitants().size()-1).getVille());
        assertEquals(14,Konoha.getHabitants().get(Konoha.getHabitants().size()-1).getAge());
    }

    @Test
    public void testBataille() throws Exception {
        Konoha.ajouterHabitant("Naruto",12);
        Konoha.bataille(Suna);
        assertEquals(2,Konoha.nbHabitants());
        assertEquals(0,Suna.nbHabitants());
        assertEquals(1500,Konoha.getSuperficie());
        assertEquals(0,Suna.getSuperficie());
    }

    @Test
    public void testViderVille() throws Exception {
        Suna.viderVille();
        assertEquals(0,Suna.getSuperficie());
        assertEquals(0,Suna.nbHabitants());
    }

}






