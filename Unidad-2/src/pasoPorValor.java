public class pasoPorValor {
     public static void main(String[] args) {
        int numero = 20;
        cambiarNumero(numero);
        System.out.println("Despues de cambiarle el valor a número: " + numero); 
        // En realidad no se le cambia el valor a numero ya que el metodo recibe como argumento es 
        // una copia del valor de numero, mas no el valor de numero en si
    }
    public static void cambiarNumero(int numero) {
        numero = 25;
        System.out.println("Dentro del metodo (cambiarNumero), la variable numero es: " + numero);
    }
}
