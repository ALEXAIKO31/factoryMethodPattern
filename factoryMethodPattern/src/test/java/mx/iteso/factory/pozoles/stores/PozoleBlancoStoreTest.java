package mx.iteso.factory.pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.stores.PozoleBlancoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by ALEX on 14/10/2015.
 */
public class PozoleBlancoStoreTest {
    private PozoleBlancoStore pozoleBlancoStore;
    private Pozole pozole;

    @Before
    public void setUp() {
        pozoleBlancoStore = new PozoleBlancoStore();
    }

    @Test
    public void newPozoleBlancoCachteTest() {
        pozole = pozoleBlancoStore.orderPozole("cachete");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Blanco con Cachete", pozole.getName());
    }

    @Test
    public void newPozoleBlancoOrejaTest() {
        pozole = pozoleBlancoStore.orderPozole("oreja");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Blanco con Oreja", pozole.getName());
    }

    @Test
    public void newPozoleBlancoPiernaTest() {
        pozole = pozoleBlancoStore.orderPozole("pierna");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Blanco con Pierna", pozole.getName());
    }

    @Test
    public void newPozoleBlancoPolloTest() {
        pozole = pozoleBlancoStore.orderPozole("pollo");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Blanco con Pollo", pozole.getName());
    }

    @Test
    public void newPozoleBlancoSuaderoTest() {
        pozole = pozoleBlancoStore.orderPozole("suadero");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Blanco con Suadero", pozole.getName());
    }

    @Test
    public void newPozoleBlancoTrompaTest() {
        pozole = pozoleBlancoStore.orderPozole("trompa");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Blanco con Trompa", pozole.getName());
    }

    @Test(expected =java.lang.NullPointerException.class)
    public void newPozoleBlancoNullTest() throws NullPointerException{
        pozole = pozoleBlancoStore.orderPozole("don't care");
    }
}
