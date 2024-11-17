import java.util.Scanner;
public class Horas{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int primerahora;
        int primerdia;
        int segundahora;
        int segundodia;

        System.out.println("Introduce día de la semana ");
        primerdia = sc.nextInt();
        System.out.println("Introduce hora del primer dia");
        primerahora = sc.nextInt();

        System.out.println("introduce otro dia ");
        segundodia = sc.nextInt();
        System.out.println("Introduce otra hora");
        segundahora = sc.nextInt();

        int horastranscurridas = (segundodia - primerdia) * 24 + (segundahora - primerahora);
        System.out.println("Entre el primer dia y el segundo han transcurrido " + horastranscurridas);

    }
}
