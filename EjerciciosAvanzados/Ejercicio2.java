import java.util.Scanner;
// Pau Gra <3
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Dime tu altura: ");
        double altura = sc.nextDouble();

        double calculo = (peso/(altura*altura));

        System.out.printf("Tu imc es %.2f", calculo, " ");
        System.out.println();
    }
}
