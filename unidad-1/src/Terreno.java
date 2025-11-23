import java.util.Scanner;

public class Terreno {
     public static void main(String[] args) {
        System.out.println("*** Sistema para calcular las areas de terrenos ***");
        Scanner consola = new Scanner(System.in);
        // Creacion de un array 3*2 donde las filas van a ser los terrenos
        // y las columnas de los terrenos sus datos en si
        double[][] datosTerrenos = new double[3][2];
        double[] areas = new double[3];
        int tamanioArray = datosTerrenos.length;
        // Pedir datos por teclado
        for (int i = 0; i < tamanioArray ; i++) {
            System.out.println();
            for (int j = 0; j < datosTerrenos[i].length; j++) {
                // Almacenar la base y la altura
                if (j == 0){
                    System.out.print("Ingrese la base del terreno " + (i + 1) + ": ");
                } else {
                    System.out.print("Ingrese la altura del terreno " + (i + 1) + ": ");
                }
                datosTerrenos[i][j] = consola.nextDouble();
                areas[i] = datosTerrenos[i][j] * datosTerrenos[i][j];
            }
        }
        System.out.println("\nAreas de los terrenos");
        double areaMayor = 0;
        int terrenoMayor = 0;
        for (int i = 0; i < tamanioArray; i++) {
            System.out.println("El area del terreno " + (i + 1) + " es: " + areas[i]);
            if (areas[i] > areaMayor){
                areaMayor = areas[i];
                terrenoMayor = i++;
            }
        }
        System.out.printf("El area mayor es %.2f y es del terreno %d", areaMayor, terrenoMayor);
        consola.close();
    }
}
