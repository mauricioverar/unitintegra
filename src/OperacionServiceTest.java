import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
test de integración
* */

public class OperacionServiceTest {

    @Test
    public void testProcesarOperacion() {
        //Calculadora calc = new Calculadora(); // no se necesita cuando los metdos son estáticos
        //OperacionService service = new OperacionService(calc);
        OperacionService service = new OperacionService(); // usando clase estática
        assertEquals(10, service.procesarOperacion(2, 3));
    }

    @Test
    public void testRealizarCalculoComplejo_ValoresPositivos() {
        OperacionService service = new OperacionService(); // Usando clase estática

        String resultadoEsperado = "Resultado complejo: 10.0";
        String resultadoActual = service.realizarCalculoComplejo(2, 3, 4);

        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testRealizarCalculoComplejo_ConCeroParaEvitarDivisionPorCeroEnPasoIntermedio() {
        OperacionService service = new OperacionService();

        String resultadoEsperado = "Resultado complejo: 0.0";
        String resultadoActual = service.realizarCalculoComplejo(1, -1, 5);
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testRealizarCalculoComplejo() {
        // Preparación
        int val1 = 2;
        int val2 = 3;
        int val3 = 4;

        // Operación esperada:
        // suma = 2 + 3 = 5
        // producto = 5 * 4 = 20
        // división = 20 / 2 = 10.0
        String resultadoEsperado = "Resultado complejo: 10.0";

        // Ejecución
        OperacionService service = new OperacionService();
        String resultado = service.realizarCalculoComplejo(val1, val2, val3);

        // Verificación
        assertEquals(resultadoEsperado, resultado);
    }


}
