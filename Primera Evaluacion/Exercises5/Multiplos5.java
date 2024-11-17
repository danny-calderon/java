import java.util.Scanner;

public class Multiplos5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero; ");
        n = sc.nextInt();
        for (n = 5; n <=100; n++){
            if (n % 5 == 0){
                System.out.println(n);
            }
        }
    }
}