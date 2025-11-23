import java.util.Scanner;

public class Alfabeto {
       public static void main(String[] args) {
        System.out.println("*** Alfabeto sin vocales ***");
        Scanner consola = new Scanner(System.in);
        char[] alfabeto = new char[27];
        int tamanioAlfabeto = alfabeto.length;
        // Creacion de un ciclo for para almacenar las datos
        for (int i = 0; i < tamanioAlfabeto; i++) {
            System.out.print("Ingrese la letra " + (i + 1) + " del alfabeto: ");
            alfabeto[i] = consola.next().toLowerCase().charAt(0);
        }
        // Creación de un ciclo for para imprimir los datos
        System.out.println("Alfabeto sin las vocales");
        for (int i = 0; i < tamanioAlfabeto; i++) {
            if (alfabeto[i] == 'a' || alfabeto[i] == 'e' || alfabeto[i] == 'i' || alfabeto[i] == 'o' || alfabeto[i] == 'u' ) {
                continue;
            } else {
                System.out.print(alfabeto[i] + ", ");
            }
        }
        consola.close();
    }
}
