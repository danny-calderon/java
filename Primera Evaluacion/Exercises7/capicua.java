import libreria.FNumDaw;
import java.util.Scanner;

public class capicua {
    public static void main(String[] args) {
        int numero = 1000;
        int i;
        int cont = 0;

        do {
            numero++;
            i = FNumDaw.voltea(numero);

            if (i == numero) {
                cont++;
                System.out.println(numero);
            } 
            
        }while (numero <= 9999);
        System.out.println(cont);
    }
}