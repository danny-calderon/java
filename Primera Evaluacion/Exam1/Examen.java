import java.util.Scanner;
public class Examen{
    public static void main (String[]args){
        String nombre;
        String sino;
        String si = "no";
        String no = "si";
        int años;
        Scanner sc = new Scanner (System.in);

        System.out.println("Como te llamas?");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        System.out.print("Sabes programar? ");
        si = sc.nextLine();
        
        System.out.print("Cuantos años llevas programando? ");
        años = sc.nextInt();
        if(años <=1){
        System.out.println("Loooser");
        }else if(años <=5){
        System.out.println("Experto!");
        }else if(años >5){
        System.out.println("Oh maestro, te adoramos!");
        }
    }
}
