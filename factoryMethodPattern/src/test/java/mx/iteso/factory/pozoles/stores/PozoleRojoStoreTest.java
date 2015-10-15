package mx.iteso.factory.pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.stores.PozoleRojoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 14/10/2015.
 */
public class PozoleRojoStoreTest {
    private PozoleRojoStore pozoleRojoStore;
    private Pozole pozole;

    @Before
    public void setUp() {
        pozoleRojoStore = new PozoleRojoStore();
    }

    @Test
    public void newPozoleRojoCachteTest() {
        pozole = pozoleRojoStore.orderPozole("cachete");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Rojo con Cachete", pozole.getName());
    }

    @Test
    public void newPozoleRojoOrejaTest() {
        pozole = pozoleRojoStore.orderPozole("oreja");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Rojo con Oreja", pozole.getName());
    }

    @Test
    public void newPozoleBlancoPiernaTest() {
        pozole = pozoleRojoStore.orderPozole("pierna");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Rojo con Pierna", pozole.getName());
    }

    @Test
    public void newPozoleRojoPolloTest() {
        pozole = pozoleRojoStore.orderPozole("pollo");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Rojo con Pollo", pozole.getName());
    }

    @Test
    public void newPozoleRojoSuaderoTest() {
        pozole = pozoleRojoStore.orderPozole("suadero");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Rojo con Suadero", pozole.getName());
    }

    @Test
    public void newPozoleRojoTrompaTest() {
        pozole = pozoleRojoStore.orderPozole("trompa");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Rojo con Trompa", pozole.getName());
    }

    @Test(expected =java.lang.NullPointerException.class)
    public void newPozoleRojoNullTest() throws NullPointerException{
        pozole = pozoleRojoStore.orderPozole("don't care");
    }
}
