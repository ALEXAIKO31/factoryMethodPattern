package mx.iteso.factory.pozoles.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 14/10/2015.
 */
public class MenudoStoreTest {
    private MenudoStore menudoStore;
    private Pozole pozole;
    @Before
    public void setUp(){
        menudoStore= new MenudoStore();
    }

    @Test
    public void newMenudoTest(){
        pozole= menudoStore.orderPozole("don't care");
        pozole.serve();
        pozole.prepare();
        assertEquals("Menudo",pozole.getName());
    }

}
