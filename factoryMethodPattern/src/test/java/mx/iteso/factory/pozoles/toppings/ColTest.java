package mx.iteso.factory.pozoles.toppings;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ALEX on 14/10/2015.
 */
public class ColTest {
    private Pozole pozole;

    @Before
    public void serUp(){
        pozole= mock(Pozole.class);
        when(pozole.getName()).thenReturn("Pozole");
    }

    @Test
    public void testAddCol(){
        pozole = new Col(pozole);
        pozole.prepare();
        assertEquals("Pozole con col", pozole.getName());
    }
}
