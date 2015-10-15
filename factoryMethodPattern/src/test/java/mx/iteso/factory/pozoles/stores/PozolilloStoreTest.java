package mx.iteso.factory.pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.stores.PozolilloStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 14/10/2015.
 */
public class PozolilloStoreTest {
    private PozolilloStore pozolilloStore;
    private Pozole pozole;
    @Before
    public void setUp(){
        pozolilloStore = new PozolilloStore();
    }

    @Test
    public void newPozolilloTest(){
        pozole= pozolilloStore.orderPozole("don't care");
        pozole.serve();
        pozole.prepare();
        assertEquals("Pozolillo",pozole.getName());
    }
}
