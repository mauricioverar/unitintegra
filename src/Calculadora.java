
/*
clase ppal
* */
public class Calculadora {

    /*public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }*/

    // usando clases estáticas
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) { return a * b; }
     public static double dividir(int a, int b) {
         if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero");
         return (double) a / b;
     }

}
