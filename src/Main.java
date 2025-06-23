import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Calculadora calc = new Calculadora(); // no se necesita cuando los metodos(sumar,restar) son estáticos
        //OperacionService service = new OperacionService(calc);
        OperacionService service = new OperacionService(); // usando clase estática


        /*int resta = calc.restar(4, 5);
        System.out.println("Resultado de la resta: " + resta);//-1*/

        int resultado = service.procesarOperacion(4, 5);
        System.out.println("Resultado de la operación: " + resultado);//18

        // lambda
        //  tienes una lista de números y quieres imprimirlos:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
        //numeros.forEach(n -> System.out.println(n)); // lambda
        // ó
        numeros.forEach(System.out::println); // metodo referencia

        //Aquí, n -> System.out.println(n) es una lambda que se pasa al métdo forEach.
    }

    // ejemplo lambda
    // (int a, int b) -> a + b
    //Esto representa una función que recibe dos enteros y devuelve su suma.
}
