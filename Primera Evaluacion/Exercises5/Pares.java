import java.util.Scanner;
public class Pares{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //int cont1 = 1; 
        //int cont2 = 1; las defino más abajo
        int n;
        int resul;
        System.out.printf("Introduce un número:");
        n = sc.nextInt();

        for (int cont1 = 1; cont1 <= n; cont1++){
            for(int cont2 = 1; cont2 <= n; cont2++){
                resul = cont1 + cont2 + cont1 * cont2;
                System.out.println("Par ( " + cont1 + " , " + cont2 + " ): " + cont1 + " + " + cont2 + " + " + cont1 * cont2 + " vale " + resul );
            }
        }
    }
}