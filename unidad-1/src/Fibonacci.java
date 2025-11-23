public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("*** Sucesión de Fibonacci ***");
        int limiteSucession = 50;
        int num1 = 0;
        int num2 = 1;
        int ultimoNumero = 0;
        for (int i = 0; i < limiteSucession; i++) {
            System.out.print("Fib(" + i +"): " + num1 + ", ");
            ultimoNumero = num1 + num2;
            num1 = num2;
            num2 = ultimoNumero;
        }
    }
}
