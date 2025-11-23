public class Optimizacion2 {
    public static void main(String[] args) {
       // int p1 = 15;
        // int p2 = 10;
      //  int p3 = 5;
        // int total1 = p1 * 2;
        // int total2 = p2 * 3;
        // int total3 = p3 * 4;
        //int totalSales = total1 + total2 + total3;

        // Creacion de las arrays para almacenar los datos
        int[] prices = {15, 10, 5};
        int[] cants = {2, 3, 4};
        int arraySize = prices.length;
        int[] totals = new int[prices.length];
        int totalSales = 0;
        int salesMax = 50;
        // Ciclo for para hallar los totales de los productos
        for (int i = 0; i < arraySize; i++) {
            totals[i] = prices[i] * cants[i];
            totalSales += totals[i];
        }
        if (totalSales > salesMax) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }   
}
