/*
clase para prueba de integracion
* */
public class OperacionService {

    /*private final Calculadora calculadora;

    public OperacionService(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int procesarOperacion(int a, int b) {
        return calculadora.sumar(a, b) * 2;
    }*/

    // usando clases estáticas
    public int procesarOperacion(int a, int b) {
        return Calculadora.sumar(a, b) * 2;
    }

    public String realizarCalculoComplejo(int val1, int val2, int val3) {
         int suma = Calculadora.sumar(val1, val2);
         int producto = Calculadora.multiplicar(suma, val3);
         double division = Calculadora.dividir(producto, 2); // Divide el producto por 2
         return "Resultado complejo: " + division;
     }

}
