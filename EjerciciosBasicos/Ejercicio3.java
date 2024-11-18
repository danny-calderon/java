package EjerciciosBasicos;
// Pau Gra <3

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final double PI =3.141592;
        Scanner sc = new Scanner(System.in);
        double radio;
        double altura;

        System.out.println("Dime el radio: ");
        radio = sc.nextDouble();

        System.out.println("Dime la altura: ");
        altura = sc.nextDouble();

        double volumen=(PI*radio*radio*altura);

        System.out.println("El radio es: " + radio );
        System.out.println("La altura es: " + altura );
        System.out.println("El volumen del cilindro es " + volumen);
    }
}
