import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [][] nombres = new String[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingresa el nombre para la posición [" + i + "][" + j + "]:");
                nombres[i][j] = scanner.nextLine();
            }
        }
        System.out.println("*** Nombres ingresados ***");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Nombre en la posición [" + i + "][" + j + "]: " + nombres[i][j]);
            }
        }
        scanner.close();
    }
}
