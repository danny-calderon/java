package EjerciciosBasicos;
// Pau Gra <3

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String apellido1;
        String apellido2;
        String nombre;

        System.out.println("Dime tu nombre: ");
        String Name = sc.nextLine();    //Recolectamos nombre para separarlo y contarlo
        
        System.out.println("Buenos dias, mi nombre es " + Name );

        String[] result = Name.split(" ");
        nombre = result[0];
        apellido1 = result[1];
        apellido2 = result[2];
        


        System.out.println("Mi nombre es " + nombre + " Suma a " + nombre.length() + " El apellido por parte de mi padre es: " + apellido1 + " Suma a " + apellido1.length() + " El apellido de mi madre es: " + apellido2 + " Suma a " + apellido2.length() );
    }
}
