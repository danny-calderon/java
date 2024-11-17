import java.util.Scanner;
public class Primos{
    public static void main(String[] args){
        
        int i = 1;
        int cont = 0;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un número: ");
        n = sc.nextInt();

        while (i <= n){
            if((n % i) == 0){
                cont++;
            }
            i++;
        }    
        if (cont <= 2){
            System.out.println("Es un número primo");
        }else{
            System.out.println("No es un número primo");
        }
    }
}