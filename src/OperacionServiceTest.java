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

    @Test
    public void testRealizarCalculoComplejo_ValoresPositivos() {
        OperacionService service = new OperacionService(); // Usando clase estática

        // Supongamos que queremos probar con val1=2, val2=3, val3=4
        // Lógica interna esperada de realizarCalculoComplejo(2, 3, 4):
        // 1. suma = Calculadora.sumar(2, 3) --> 5
        // 2. producto = Calculadora.multiplicar(5, 4) --> 20
        // 3. division = Calculadora.dividir(20, 2) --> 10.0
        // 4. return "Resultado complejo: 10.0"

        String resultadoEsperado = "Resultado complejo: 10.0";
        String resultadoActual = service.realizarCalculoComplejo(2, 3, 4);

        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testRealizarCalculoComplejo_ConCeroParaEvitarDivisionPorCeroEnPasoIntermedio() {
        OperacionService service = new OperacionService();

        // Supongamos que val1=1, val2=-1, val3=5
        // Lógica interna esperada de realizarCalculoComplejo(1, -1, 5):
        // 1. suma = Calculadora.sumar(1, -1) --> 0
        // 2. producto = Calculadora.multiplicar(0, 5) --> 0
        // 3. division = Calculadora.dividir(0, 2) --> 0.0
        // 4. return "Resultado complejo: 0.0"
        String resultadoEsperado = "Resultado complejo: 0.0";
        String resultadoActual = service.realizarCalculoComplejo(1, -1, 5);
        assertEquals(resultadoEsperado, resultadoActual);
    }

    // Podrías añadir un test para la división por cero si `realizarCalculoComplejo`
    // pudiera llevar a que Calculadora.dividir() reciba un 0 como divisor.
    // Esto dependería de la lógica interna de `realizarCalculoComplejo`.
    // Por ejemplo, si el divisor en `Calculadora.dividir(producto, VALOR_DIVISOR)`
    // pudiera ser cero:
    /*
    @Test(expected = IllegalArgumentException.class)
    public void testRealizarCalculoComplejo_LlevaADivisionPorCero() {
        OperacionService service = new OperacionService();
        // Configura los valores de entrada para que la lógica interna de
        // service.realizarCalculoComplejo lleve a una división por cero
        // en la llamada a Calculadora.dividir().
        // Esto es un ejemplo y depende de cómo `realizarCalculoComplejo` use `Calculadora.dividir`.
        // Por ejemplo, si `realizarCalculoComplejo` fuera así:
        // public String realizarCalculoComplejo(int val1, int val2, int divisorDirecto) {
        //     int suma = Calculadora.sumar(val1, val2);
        //     double division = Calculadora.dividir(suma, divisorDirecto);
        //     return "Resultado: " + division;
        // }
        // service.realizarCalculoComplejo(5, 5, 0); // Esto lanzaría la excepción
    }
    */

}
