import java.util.Scanner;
// Pau Gra <3
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numero 1: ");
        double num1 = sc.nextDouble();

        System.out.println("Introduce numero 2: ");
        double num2 = sc.nextDouble();

        double calculo = ((num1 + num2)/2);
        System.out.println("La media aritmetica es: "+calculo);
            
        }
    }


