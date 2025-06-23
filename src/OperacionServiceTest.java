import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
test de integración
* */

public class OperacionServiceTest {

    @Test
    public void testProcesarOperacion() {
        Calculadora calc = new Calculadora();
        OperacionService service = new OperacionService(calc);
        assertEquals(10, service.procesarOperacion(2, 3));
    }

}
