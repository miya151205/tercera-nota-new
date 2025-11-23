import java.util.Scanner;

public class Productos {
      public static void main(String[] args) {
      Scanner consola = new Scanner(System.in);
       // Creación de la lista 
       String[] nombreColonia = new String[5]; 
       //Ciclo for para pedir productos 
       for ( int i = 1; i < 5; i ++){
        System.out.println("Ingresa el nombre de la colonia " + i + ": ");
        nombreColonia[i] = consola.nextLine();
       }
       // Ciclo for para imprimir los productos
        System.out.println("Lista de colonias en el orden ingresado");
        for(int i = 1 ; i < 5; i++){
            System.out.println("Colonia " + i + ": " + nombreColonia[i]);
        }
        consola.close();
    }
}
