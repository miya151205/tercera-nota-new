import java.util.Scanner;

public class EjemNotas {
     public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Bienvenido a Notabilisima***");
        // Creacion del array
        float[][] notas = new float[4][3];
        float[] suma = new float[4];
        float[] promedio = new float[4];
         int tamañoFilas = notas.length;
         int aprobados = 0;
        // Llenado del array
        for (int i = 0; i < tamañoFilas; i++) {
            System.out.println("Ingrese las notas del estudiante " + (i+1));
            suma[i] = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                notas[i][j] = consola.nextFloat();
                consola.nextLine();
                 suma[i] += notas[i][j];
            }
          promedio[i] = (suma[i] / 3);
        }
        System.out.println("________________________________________________");
        System.out.println("Reporte de notas");
        for (int i = 0; i < tamañoFilas; i++) {
            if (promedio[i] >= 3.0) {
                System.out.println("El estudiante " + (i + 1) + " ha aprobado el curso y su promedio es: " + promedio[i] );
                aprobados ++;
            } else{
                System.out.println("El estudiante " + (i + 1) + " ha reprobado el curso y su promedio es: " + promedio[i] );
            }
        
        }
        System.out.println("La cantidad de estudiantes que aprobaron es de: " + aprobados);




        consola.close();
    }
}
