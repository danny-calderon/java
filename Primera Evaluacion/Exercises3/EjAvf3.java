import java.lang.Math;
import java.util.Scanner;
public class EjAvf3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // aquí le digo a la máquina que "voy a usar el teclado"
        double a, b, c, x;

        System.out.println("A = ");
        a = sc.nextDouble();
        System.out.println("B = ");
        b = sc.nextDouble();
        double elevado = Math.pow(b, 2); //b elevado a 2
        System.out.println("C = ");
        c = sc.nextDouble();
        double raiz = Math.sqrt(elevado - 4 * a * c);
        
        System.out.println("x  = " + ((-b + raiz) / (2 * a)));
        System.out.println("x  = " + ((-b - raiz) / (2 * a)));

    }
}