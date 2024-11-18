//Pau Gra <3

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int insectos;
        int aracnidos;
        int crustaceos;
        int ciempies;
        int segmentos;

        System.out.println("Dime el numero de insectos: ");
        insectos = sc.nextInt();

        System.out.println("Dime el numero de aracnidos: ");
        aracnidos = sc.nextInt();

        System.out.println("Dime el numero de crustaceos: ");
        crustaceos = sc.nextInt();

        System.out.println("Dime el numero de ciempies: ");
        ciempies = sc.nextInt();

        System.out.println("Dime el numero de segmentos: ");
        segmentos = sc.nextInt();

        System.out.println("El numero de patas en total de los insectos es de: " + (insectos*6));
        System.out.println("El numero de patas en total de los aracnidos es de: " + (aracnidos*8));
        System.out.println("El numero de patas en total de los crustaceos es de: "+(crustaceos*10));
        System.out.println("El numero de patas en total de los ciempies es de: "+(ciempies*segmentos*2));
        System.out.println("El total es: "+ ((insectos*6)+(aracnidos*8)+(crustaceos*10)+(ciempies*segmentos*2)));
    }
}
