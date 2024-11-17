import libreria.FNumDaw;
import java.util.Scanner;

public class a210 {
    public static void main(String [] args) {
        Scanner sc =  new Scanne(System.in);

        int casos;
        int total;
        String txt;

        casos = sc.nextInt();

        //Bucle de numeros
        for (int i = 1; i <= casos; i++) {
            texto = sc.nextLine();
            //Bucle de letras
            total = 0;
            for (int j = 0; j < txt.length; j++) {
                total = total + (int)(txt.charAt(j));
            }
            System.out.println(FNumDaw.anteriorPrimo(total));
        }
    }
}