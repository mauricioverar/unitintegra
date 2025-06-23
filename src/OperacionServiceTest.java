import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
test de integración
* */

public class OperacionServiceTest {

    @Test
    public void testProcesarOperacion() {
        //Calculadora calc = new Calculadora(); // no se necesita cuando los metodos(sumar,restar) son estáticos
        //OperacionService service = new OperacionService(calc);
        OperacionService service = new OperacionService(); // usando clase estática
        assertEquals(10, service.procesarOperacion(2, 3));
    }

}
