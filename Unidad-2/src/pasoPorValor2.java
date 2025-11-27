public class pasoPorValor2 {
    // Creamos el método donde aumentamos el valor de x en 1.
    public static int incrementar(int a) {
        a += 1;
        System.out.println("Dentro del método: x = " + a);
        return a;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Antes de llamar al método: x = " + x); // Muestra 10
        x = incrementar(x);  // Necesitamos asignar el valor retornado (asignamos el valor que tiene 'a' dentro del método a 'x')
        System.out.println("Después de llamar al método: x = " + x); // Muestra 11
    }
}
