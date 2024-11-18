//Pau Gra <3
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cupo;
        double huevos;
        double minutos;

        System.out.println("Dime cuantos huevos caben en una olla ");
        cupo = sc.nextDouble();

        System.out.println("Cuantos huevos quieres cocer? ");
        huevos = sc.nextDouble();

        double ollas=(huevos%cupo);
        if (ollas == 0){
            System.out.println("Los minutos que tardare en cocinar los huevos son ; "+ (ollas*10));
        }else{
            System.out.println("Los minutos que tardare en cocinar los huevos son ; "+(ollas ));
        }
           
    }
}
