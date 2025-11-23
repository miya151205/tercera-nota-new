import java.util.Scanner;

public class Datos {
     public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = consola.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = consola.nextInt();
        System.out.print("Ingrese su altura: ");
        double altura = consola.nextDouble();
        System.out.println("Hola " + nombre + ". Tienes: " + edad + " años de edad. Tu altura es de: " + altura + " metros.");
        consola.close();
    }
}
