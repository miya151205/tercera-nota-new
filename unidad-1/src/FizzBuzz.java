public class FizzBuzz {
     public static void main(String[] args) {
        // Analisis: Desarrollar un programa que imprima los numeros del 1 al 100, cambiando los que son multiplos
        // de 3 por la palabra fizz, los que son multiplos de 5 por la palabra buzz y los que son multiplos de ambos
        // digitos, por la palabra "fizzbuzz"

        // Diseño: Se usaran un ciclo for, estructuras condicionales y operadores logicos y aritmeticos para la realizarlo

        // Implementacion:
        int numeroMaximo = 100;
        int num1 = 3, num2 = 5;
        for (int i = 1; i <= numeroMaximo ; i++) {
            if ((i % num1 == 0) && ( i % num2 == 0)){
                System.out.println("fizzbuzz");
            } else if (i % num1 == 0) {
                System.out.println("fizz");
            } else if ( i % num2 == 0) {
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
