package mx.iteso.factory.pozoles.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ALEX on 14/10/2015.
 */
public class CebollaTest {
    private Pozole pozole;

    @Before
    public void serUp(){
        pozole= mock(Pozole.class);
        when(pozole.getName()).thenReturn("Pozole");
    }

    @Test
    public void testAddCebolla(){
        pozole = new Cebolla(pozole);
        pozole.prepare();
        assertEquals("Pozole con cebolla", pozole.getName());
    }
}
