package test;

import org.junit.Before;
import org.junit.Test;
import src.main.Engin;
import src.main.Voiture;
import src.main.EnginFactory;
import static org.junit.Assert.assertEquals;

public class EnginFactoryTest {
    private EnginFactory enginFactory;

    @Before
    public void setUp() {
        enginFactory = new EnginFactory();
    }

    @Test
    public void testCreateVoiture() {
        Engin v = enginFactory.createVoiture("TRANSFORMERS");
        assertEquals(Voiture.class, v.getClass());
    }
}
