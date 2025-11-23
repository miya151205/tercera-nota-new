import java.util.Scanner;

public class TestFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colonias = new String[5];
        //se crea un for para pedir las colonias
        for (int i = 0; i < 5; i++) {
            System.out.println("ingresa el nombre de la colonia " + (i + 1) + ":");
            colonias[i] = scanner.nextLine();
        }
        //se crea otro for para la lista
        System.out.println("*** Lista de colonias ingresadas *** ");
        for (String colonia : colonias) {
            System.out.println("colonia: " + colonia);
        }
        scanner.close();

    }
}
