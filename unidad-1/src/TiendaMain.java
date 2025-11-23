public class TiendaMain {
     public static void main(String[] args) {
        double shirtPrice = 25.0;
        double pantPrice = 30.0;
        double discount = 0.15;
        double secondShirt = shirtPrice * (1 - discount);
        double totalWithSecondShirt = secondShirt + pantPrice;

        System.out.println("Precio de la segunda camiseta con 15% de descuento: $" + secondShirt);
        System.out.println("Total con dos camisetas y un pantalón: $" + totalWithSecondShirt);
    }
}
