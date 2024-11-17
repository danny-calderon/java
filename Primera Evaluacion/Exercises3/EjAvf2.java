import java.util.Scanner;

public class EjAvf2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double kilos;
        double metros;

        System.out.println("Introduce tu peso");
        kilos = sc.nextDouble();     
        System.out.println("Introduce tu altura");
        metros = sc.nextDouble();
        double elevado = Math.pow(metros,2);
        System.out.println("Tu IMC es " + (kilos / elevado));

            

    }
}