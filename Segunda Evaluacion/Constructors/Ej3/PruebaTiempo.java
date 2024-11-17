import java.util.Arrays;
import java.util.Scanner;

public class PruebaTiempo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Tiempo tiempo = new Tiempo(3, 30, 40);
        Tiempo tiempo2 = new Tiempo(2, 30, 40);

        System.out.println("Método suma: ");
        tiempo.suma(tiempo);
        System.out.println(tiempo.toString());

        System.out.println("Método resta: ");
        tiempo.resta(tiempo2);
        System.out.println(tiempo2.toString());

        System.out.println("¿Cuántos tiempos desea ingresar?");
        int cantidadTiempos = scanner.nextInt();

        Tiempo[] tiempos = new Tiempo[cantidadTiempos];

        for (int i = 0; i < cantidadTiempos; i++) {
            System.out.println("Ingrese tiempo " + (i + 1) + " (horas minutos segundos): ");
            int horas = scanner.nextInt();
            int minutos = scanner.nextInt();
            int segundos = scanner.nextInt();
            tiempos[i] = new Tiempo(horas, minutos, segundos);
        }

        Arrays.sort(tiempos, (t1, t2) -> t2.compareTo(t1));

        System.out.println("Tiempos ordenados de mayor a menor:");
        for (Tiempo tiempoOrdenado : tiempos) {
            System.out.println(tiempoOrdenado.toString());
        }

        scanner.close();
    }
}