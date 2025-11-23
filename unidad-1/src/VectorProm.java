import java.util.Scanner;

public class VectorProm {
   public static void main(String[] args) {
        System.out.println("*** Bienvenido al promedio de un vector ***");
        Scanner consola = new Scanner(System.in); 
        double suma = 0; 
        double promedio = 0.0;
        final int CANTIDAD_DE_NUMEROS = 10;
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número de la posición " + i + ": ");
            numeros[i] = consola.nextInt();
            suma += numeros[i];
        };
        System.out.println();
        promedio = (suma/CANTIDAD_DE_NUMEROS);
        System.out.println("La suma de todos los números ingresados es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
        
        consola.close();
    } 
}
