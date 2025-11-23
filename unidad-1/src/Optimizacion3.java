public class Optimizacion3 {
      public static void main(String[] args) {
        // Mejorar variables
        double[] productsPrices = {100,200};
        double[] worthTaxs = {0.15, 0.10};
        double[] taxs = new double[2];
        int arraySize = taxs.length;
        double totalTax = 0;
        final int totalTaxsMax = 50;
        // Ciclo for para calcular los impuestos
        for (int i = 0; i < arraySize; i++) {
            taxs[i] = productsPrices[i] * worthTaxs[i];
            totalTax += taxs[i];
        }
        if (totalTax > totalTaxsMax) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }



       // double productPrice1 = 100;
        // double productPrice2 = 200;
        //double tax1 = productPrice1 * 0.15;
        //double tax2 = productPrice2 * 0.10;
       // double totalTax = tax1 + tax2;


    }
}
