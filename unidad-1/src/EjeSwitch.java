import java.util.Scanner;

public class EjeSwitch {
     public static void main(String[] args) {
        // Menú dinamico con switch
        Scanner consola = new Scanner(System.in);
        boolean salir = false;
        float resultado = 0;
        int num1 = 0;
        int num2 = 0;
        System.out.println("Bienvenido a la calculadora de operaciones básicas");
        while (!salir) {
            // Creación del menú
            System.out.print("""
                 \n
                  \s Menú
                       Operaciones que se pueden realizar:
                        1. Sumar 
                        2. Restar 
                        3. Multiplicar 
                        4. Dividir
                        5. Salir
                  \s Seleccione una opción por favor
                    """);
            // Lectura de opcion
            int opcion = consola.nextInt();
            // Selección de casos posibles
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = consola.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = consola.nextInt();
                    resultado = num1 + num2 ;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2: 
                    System.out.print("Ingrese el primer número: ");
                    num1 = consola.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = consola.nextInt();
                    resultado = num1 - num2 ;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3: 
                    System.out.print("Ingrese el primer número: ");
                    num1 = consola.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = consola.nextInt();
                    resultado = num1 * num2 ;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = consola.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = consola.nextInt();
                    if (num2 != 0) {
                         resultado = num1 / num2 ;
                         System.out.println("El resultado de la división es: " + resultado);
                    } else
                        System.out.println("No se puede realizar una división entre 0");
                    break;
                case 5: 
                    System.out.println("Saliendo de la calculadora...");
                    salir = true;
                    break;
                default:
                    System.out.println("La opción seleccionada no es valida. Ingrese otra opción");
                    break;
            }
        }
        consola.close();
    }
}
