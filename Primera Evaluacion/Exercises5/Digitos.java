import java.util.Scanner;
public class Digitos{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int cant = 0;
        int digitos;
        int i;

        System.out.print("Introduce un numero entero: ");
        digitos = sc.nextInt();

        
            while (digitos > 0){
            digitos = digitos /10;
            cant++;
            }
        
        System.out.print("El numero introducido tiene " + cant + " digitos ");
    }
}