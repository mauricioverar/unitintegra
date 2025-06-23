public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        OperacionService service = new OperacionService(calc);

        int resultado = service.procesarOperacion(4, 5);
        System.out.println("Resultado de la operación: " + resultado);
    }

}
