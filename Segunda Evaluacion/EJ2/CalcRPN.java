import java.util.Scanner;
import java.util.Stack;

public class CalcRPN {

    public static void limpia() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean sigue = true;
        int columna = 4;
        String dato;
        Stack<Double> stack = new Stack<>();

        do {
            System.out.print("Filas: ");
            columna = sc.nextInt();
            sc.nextLine();
        } while (columna > 20 || columna < 0);

        while (sigue) {

            limpia();
            int temp = 1;
            for (Double valor : stack) {
                System.out.printf("%02d:%20f\n", temp++, valor);
            }

            System.out.print(": ");
            dato = sc.nextLine();

            if (dato.equals("+")) {
                double operador1 = stack.pop();
                double operador2 = stack.pop();
                stack.push(operador1 + operador2);

            } else if (dato.equals("-")) {
                double operador1 = stack.pop();
                double operador2 = stack.pop();
                stack.push(operador2 - operador1);

            } else if (dato.equals("*")) {
                double operador1 = stack.pop();
                double operador2 = stack.pop();
                stack.push(operador1 * operador2);

            } else if (dato.equals("/")) {
                double operador1 = stack.pop();
                double operador2 = stack.pop();
                stack.push(operador2 / operador1);

            } else if (dato.equals("q")) {
                limpia();
                sigue = false;
                
            } else {
                stack.push(Double.valueOf(dato));
            }
        }
        sc.close();
    }
}
