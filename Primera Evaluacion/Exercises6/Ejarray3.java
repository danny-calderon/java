import java.util.Scanner;
public class Ejarray3{
    public static void main(String []args){

        int[][] num = new int [4][4];
        boolean simetrico;

        Scanner numero = new Scanner(System.in);

        System.out.println("Dime los números a introducir ");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.println("["+i+"]"+"["+j+"]"+"=");
                num [i][j] = numero.nextInt();
            }
        }
        for (int i=0; i < num.length; i++) {
            System.out.println();
            for (int j=0; j < num.length; j++) {
                System.out.println(num[i][j] + " ");
            }
        }
        simetrico = true;
        int control = num.length -1;
        int i=0;
        while (i < control && simetrico == true) {
            int j=0;
            while (j < control && simetrico == true) {
                if (num [i][j] !=num[j][i]){
                    simetrico = true;
                }
                j++;
            }
            i++;
        }    
        if (simetrico){
            System.out.println("La tabla es simetrica");
        }
        else{
            System.out.println("La tabla no es simetrica");
        }
    }
}