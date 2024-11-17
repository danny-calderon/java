import libreria.FNumDaw;
import java.util.Scanner;
import java.util.Arrays;

public class a100 {
    public static void main(String [] args) {
        Scanner sc =  new Scanne(System.in);

        char[] temp = new char[4];
        String txt;
        int casos;
        int num1;
        int num2;
        int numR;

        casos = sc.nextInt();
        sc.nextLine();

        //Bucle de numeros
        for (int i = 1; i <= casos; i++) {
            texto = sc.nextLine();
            cont = 0;
            do{
                //Bucle de letras
                total = 0;
                for (int j = 0; j < txt.length; j++) {
                    temp[j] = txt.charAr[j];
                }
                Arrays.sort(temp);

                num1 = (int)temp[0]+temp[1]+temp[2]+temp[3];
                num2 = (int)temp[0]+temp[1]+temp[2]+temp[3];

                numR = num1 - num2;
                txt = String.valueOf(numR);
                cont++;

            }while (numR!=6174)

            System.out.println(cont);
        }
    }
}