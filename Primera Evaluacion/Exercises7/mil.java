import libreria.FNumDaw;
import java.util.Scanner;

public class mil {
    public static void main(String[] args) {
        int numero;
        int numero2;
        int j;

        Scanner sc = new Scanner(System.in);

        for(j = 1; j < 1001; j = FNumDaw.siguientePrimo(j)) {
            j++;
            if (FNumDaw.siguientePrimo(j) > 1000) {
                System.out.println("Te voy a mostrar todos los numeros primos del 1 al 1000: ");
                System.exit(0);
            }
        }
        int resultado = FNumDaw.siguientePrimo(j);
        System.out.println(resultado);
    }
}