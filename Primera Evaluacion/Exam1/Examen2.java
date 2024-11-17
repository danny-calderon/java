import java.util.Scanner;
public class Examen2{
    public static void main (String[] args){
        int apuestas;
        int random1 = (int) (Math.random()*50+1);
        int random2 = (int) (Math.random()*10+1);
        Scanner sc = new Scanner (System.in);

        System.out.println("Numero de apuestas?");
        apuestas = sc.nextInt();
        System.out.println(random1 + random1 + random1 + random1);


    }
}