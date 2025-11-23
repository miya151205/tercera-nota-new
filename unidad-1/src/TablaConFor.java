import java.util.Scanner;

public class TablaConFor {
    public static void main(String[] args) {
        // Tabla de multiplicar de los números ingresados por teclado
        System.out.println("*** Bienvenido a el programa de las tablas de multplicar ***");
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el número de la tabla de multiplicar");
        int num = consola.nextInt(); 
        int resultado = 0;
        for (int i = 0; i <= 10; i++) {
            resultado = num * i;
            System.err.println(num + " * " + i + " = " + resultado);
        };
        consola.close();
    }
}
