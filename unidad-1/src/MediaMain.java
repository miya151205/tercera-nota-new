import java.util.Scanner;

public class MediaMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        double num1= sc.nextDouble();

        System.out.println("ingrese el segundo numero");
        double num2= sc.nextDouble();

        System.out.println("ingrese el tercer numero");
        double num3= sc.nextDouble();

        double media=(num1+num2+num3)/3;

        System.out.println("La media de estos tres numeros es:"+media);

     sc.close();
    }
}
