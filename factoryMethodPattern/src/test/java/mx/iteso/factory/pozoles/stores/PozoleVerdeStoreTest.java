package mx.iteso.factory.pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.stores.PozoleVerdeStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 14/10/2015.
 */
public class PozoleVerdeStoreTest {
    private PozoleVerdeStore pozoleVerdeStore;
    private Pozole pozole;

    @Before
    public void setUp() {
        pozoleVerdeStore = new PozoleVerdeStore();
    }

    @Test
    public void newPozoleVerdeCachteTest() {
        pozole = pozoleVerdeStore.orderPozole("cachete");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Verde con Cachete", pozole.getName());
    }

    @Test
    public void newPozoleVerdeOrejaTest() {
        pozole = pozoleVerdeStore.orderPozole("oreja");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Verde con Oreja", pozole.getName());
    }

    @Test
    public void newPozoleVerdePiernaTest() {
        pozole = pozoleVerdeStore.orderPozole("pierna");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Verde con Pierna", pozole.getName());
    }

    @Test
    public void newPozoleVerdePolloTest() {
        pozole = pozoleVerdeStore.orderPozole("pollo");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Verde con Pollo", pozole.getName());
    }

    @Test
    public void newPozoleVerdeSuaderoTest() {
        pozole = pozoleVerdeStore.orderPozole("suadero");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Verde con Suadero", pozole.getName());
    }

    @Test
    public void newPozoleVerdeTrompaTest() {
        pozole = pozoleVerdeStore.orderPozole("trompa");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Verde con Trompa", pozole.getName());
    }

    @Test(expected =java.lang.NullPointerException.class)
    public void newPozoleVerdeNullTest() throws NullPointerException{
        pozole = pozoleVerdeStore.orderPozole("don't care");
    }
}
