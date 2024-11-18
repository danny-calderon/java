// Pau Gradoli <3
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame una base: ");
        int base = sc.nextInt();
        System.out.print("Dame un exponente: ");
        int exponente = sc.nextInt();
        int fi=1;

        for (int i=1; i <= exponente; i++){
            fi=(fi*base);
        }
        System.out.println("La potencia es: " + fi);
    }
}

