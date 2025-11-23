import java.util.Scanner;

public class Animals {
   public static void main(String[] args) {
        System.out.println("*** Sistema de animales ***");
        Scanner consola = new Scanner(System.in);
        // Creación de las dos listas
        String[] animals = new String[5];
        String[] foods = new String[5];
        int tamanioArreglo = animals.length;
        // Ciclo for para almacenar los datos
        for (int i = 0; i < tamanioArreglo; i++) {
            System.out.print("Input name's animal " + (i + 1) + ": ");
            animals[i] = consola.nextLine();
            System.out.print("Input name's animal food " + (i + 1) + ": ");
            foods[i] = consola.nextLine();
        }
        // Ciclo para imprimir los datos
        System.out.println("---Lista de animales---");
        for (int i = 0; i < tamanioArreglo; i++) {
            System.out.println("The food of animal " + (i + 1) + "'" + animals[i] + "'" + " is: " + foods[i] );
        }
        consola.close();
    }  
}
