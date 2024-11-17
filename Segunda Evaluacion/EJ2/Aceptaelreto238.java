import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aceptaelreto238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el número de billetes y de miembros a repartir: ");
        while(true) {
            int numbilletes = sc.nextInt();
            int numeromiembros = sc.nextInt();

            if (numbilletes == 0 && numeromiembros == 0) {
                break;
            }

            List<Integer> billetes = new ArrayList<>();

            for(int i = 0; i < numbilletes; i++) {
                billetes.add(sc.nextInt());
            }
            repartirbotin(numeromiembros, billetes)
        }
        sc.close();

        private static void repartirbotin (int numeromiembros, List<Integer> billetes) {
            Map<Integer, List<Integer>> reparto = new HashMap<>();

            for (int i = 0; i < numeromiembros; i++) {
                reparto.put(i, new ArrayList<>());
            }
            int index = 0;

            for (int billete : billetes) {
                reparto.get(index % numeromiembros).add(billete);
                index++;
            }
            for(int i = 0; i < numeromiembros; i++) {
                int dinerototal = 0;
                List<Integer> billetesdados = reparto.get(i);

                for (int billete : billetesdados) {
                    dinerototal += billete;
                }
                System.out.println(dinerototal + ": " + billetesdados.toString().replaceAll("[\\[\\],]", ""));
            }
            System.out.println("---");
        }
    }
}
