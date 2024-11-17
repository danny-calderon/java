import java.util.Scanner;
import java.util.InputMismatchException;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primero;
        int segundo;
        // int res;

        try {
            System.out.println("Dime el primer número a dividir: ");
            primero = sc.nextInt();

            System.out.println("Dime el segundo: ");
            segundo = sc.nextInt();

            int res = primero / segundo;
            System.out.println(res);
        } catch (InputMismatchException e) {
            System.out.println("Dato no numérico.");
        } catch (ArithmeticException e) {
            System.out.println("El denominador es distinto de 0.");
        } catch (Exception e) {
            System.out.println("Problemas con la división.");
        }
        sc.close();
    }
}