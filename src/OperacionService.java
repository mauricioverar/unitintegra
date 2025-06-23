/*
clase para prueba de integracion
* */
public class OperacionService {

    private final Calculadora calculadora;

    public OperacionService(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int procesarOperacion(int a, int b) {
        return calculadora.sumar(a, b) * 2;
    }

}
