package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.main.Habitant;
import src.main.Ville;

import static org.junit.Assert.*;

public class HabitantTest {

    Habitant naruto;
    Ville Konoha;
    Ville Suna;

    @Before
    public void setUp() throws Exception {
        Konoha = new Ville();
        Suna = new Ville();
        naruto = new Habitant("Naruto", 12, Konoha);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testContructeurVide() {
        naruto = new Habitant();
        assertNotEquals(null,naruto);
        assertEquals( null,naruto.getNom());
        assertEquals(0,naruto.getAge());
        assertEquals(null,naruto.getVille());
        assertEquals(null, naruto.getTitre());
    }

    @Test
    public void testContructeurNomAge() {
        naruto = new Habitant("Naruto",16);
        assertNotEquals(null,naruto);
        assertEquals( "Naruto",naruto.getNom());
        assertEquals(16,naruto.getAge());
        assertEquals(null,naruto.getVille());
        assertEquals(null, naruto.getTitre());
    }

    @Test
    public void testContructeurComplet() {
        naruto = new Habitant("Naruto",16,Konoha);
        assertNotEquals(null,naruto);
        assertEquals( "Naruto",naruto.getNom());
        assertEquals(16,naruto.getAge());
        assertEquals(Konoha,naruto.getVille());
        assertEquals(null, naruto.getTitre());
    }

    @Test
    public void testEvoluer() {
        naruto.evoluer();
        assertEquals("Ninja",naruto.getTitre());
        naruto.evoluer();
        assertEquals("Hokage",naruto.getTitre());
        naruto.evoluer();
        assertEquals("Hokage",naruto.getTitre());
    }

    /**
     * Tester l'association habitant -> ville
     */
    @Test
    public void testSetVille() {
        naruto.setVille(Suna);
        assertEquals(Suna,naruto.getVille());
        assertTrue(Suna.getHabitants().contains(naruto));
    }

    @Test
    public void testSetNom() {
        naruto.setNom("Gaara");
        assertEquals("Gaara", naruto.getNom());
    }

    @Test
    public void testSetTitre() {
        naruto.setTitre("Chunin");
        assertEquals("Chunin",naruto.getTitre());
    }

    @Test
    public void testSetAge() {
        naruto.setAge(13);
        assertEquals(13,naruto.getAge());
    }

    @Test
    public void testGetVille() {
        assertEquals(Konoha,naruto.getVille());
    }

    @Test
    public void testGetNom() {
        assertEquals("Naruto",naruto.getNom() );
    }

    @Test
    public void testGetTitre() {
        naruto.evoluer();
        assertEquals( "Ninja",naruto.getTitre());
    }

    @Test
    public void testGetAge() {
        assertEquals(12, naruto.getAge());
    }

}