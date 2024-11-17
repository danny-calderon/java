import java.util.Scanner;

public class PruebaFraccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Dime el numerador: ");
        int numerador = sc.nextInt();
        System.out.printf("Dime el denominador: ");
        int denominador = sc.nextInt();

        Fraccion fracc = new Fraccion();

        System.out.println("Metodo simplificar: ");
        fracc.simplificar(numerador, denominador);
        System.out.println("Numerador: " + fracc.getNumerador() + "Denominador: " + fracc.getDenominador());

        System.out.printf("Metodo invertir: ");
        fracc.invertir();
        System.out.println("Numerador: " + fracc.getNumerador() + "Denominador: " + fracc.getDenominador());

        System.out.printf("Metodo multiplicar: ");
        fracc.multiplicar(numerador, denominador, 3);
        System.out.println("Numerador: " + fracc.getNumerador() + "Denominador: " + fracc.getDenominador());

        System.out.printf("Metodo dividir: ");
        fracc.dividir(numerador, denominador, 3);
        System.out.println("Numerador: " + fracc.getNumerador() + "Denominador: " + fracc.getDenominador());

        sc.close();
    }
}