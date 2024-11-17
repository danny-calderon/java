import java.util.Scanner;
public class EjAvf5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int huevo;
        int cuantos;
        int minutos = 10;

        System.out.println(" Cuantos huevos tienes ");
        huevo = sc.nextInt();
        System.out.println(" Cuantos caben en la cazuela ");
        cuantos = sc.nextInt();
        

        System.out.println("Tengo " + huevo);
        System.out.println("Caben " + cuantos);
        System.out.println("Va a tardar " + (huevo/cuantos) * minutos + " minutos");
    }
}