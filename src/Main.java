public class Main {

    public static void main(String[] args) {

        //Calculadora calc = new Calculadora(); // no se necesita cuando los metodos(sumar,restar) son estáticos
        //OperacionService service = new OperacionService(calc);
        OperacionService service = new OperacionService(); // usando clase estática


        /*int resta = calc.restar(4, 5);
        System.out.println("Resultado de la resta: " + resta);//-1*/

        int resultado = service.procesarOperacion(4, 5);
        System.out.println("Resultado de la operación: " + resultado);//18
    }

}
