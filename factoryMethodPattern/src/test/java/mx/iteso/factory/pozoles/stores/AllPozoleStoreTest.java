package mx.iteso.factory.pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.stores.AllPozoleStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 14/10/2015.
 */
public class AllPozoleStoreTest {
    private AllPozoleStore allPozoleStore;
    private Pozole pozole;

    @Before
    public void setUp(){
        allPozoleStore=new AllPozoleStore();
    }

    @Test
    public void newPozoleBlancoTest(){
        allPozoleStore.setType("blanco");
        pozole= allPozoleStore.orderPozole("pollo");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Blanco con Pollo", pozole.getName());
    }

    @Test
    public void newPozoleRojoTest(){
        allPozoleStore.setType("rojo");
        pozole= allPozoleStore.orderPozole("pollo");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Rojo con Pollo", pozole.getName());
    }

    @Test
    public void newPozoleVerdeTest(){
        allPozoleStore.setType("verde");
        pozole= allPozoleStore.orderPozole("pollo");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozole Verde con Pollo", pozole.getName());
    }

    @Test
    public void newPozolilloTest(){
        allPozoleStore.setType("pozolillo");
        pozole= allPozoleStore.orderPozole("don't care");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozolillo", pozole.getName());
    }

    @Test
    public void newMenudoTest() {
        allPozoleStore.setType("menudo");
        pozole = allPozoleStore.orderPozole("don't care");
        pozole.serve();
        pozole.prepare();
        assertEquals("Menudo", pozole.getName());
    }

    @Test (expected = java.lang.NullPointerException.class)
    public void newNullTest()throws NullPointerException{
        pozole = allPozoleStore.orderPozole("pollo");
    }
}
