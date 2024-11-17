import java.util.Scanner;

public class inOK {

    private static Scanner sc = new Scanner(System.in);

    private static void LeeInt() {

        System.out.println("Dime un número entero: ");
        try {
            int num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("NO ES UN NÚMERO ENTERO.");
            sc.nextLine();
        }
    }
    private static void LeeIntPos() {

        System.out.println("Dime un número sólo positivo: ");
        try {
            int numpos = sc.nextInt();
            if (numpos < 0) throw new Exception("NO ES POSITIVO.");
        } catch (Exception e) {
            System.out.println("NO ES UN ENTERO.");
            System.out.println(e.getMessage());
            sc.nextLine();
        }
    }
    private static void LeeIntRango() {
        
        int min = 0;
        int max = 100;
        System.out.println("Dime un número pera ver si está en el rango que he especificado: ");
        int num = sc.nextInt();
        try {
            if (num < min || num > max) throw new Exception("Numero dentro del rango");
        } catch (Exception e) {
            System.out.println("NO ESTÁ EN EL RANGO.");
            sc.nextLine();
        }
    }
    private static void LeeDou() {

        System.out.println("Dime un número real: ");
        try {
            double num = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("NO ES UN NÚMERO REAL.");
            sc.nextLine();
        }
    }
    private static void LeeDouRango() {
        
        double min = 0;
        double max = 100;
        System.out.println("Dime un número real pera ver si está en el rango que he especificado: ");
        double num = sc.nextDouble();
        try {
            if (num < min || num > max) throw new Exception("Numero dentro del rango");
            else {
                System.out.println("Número dentro del rango");
            }
        } catch (Exception e) {
            System.out.println("NO ESTÁ EN EL RANGO.");
            sc.nextLine();
        }
    }
    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler", "Bartok"};

    private static void LeeString() {
        System.out.println("Dime un compositor: ");
        String compositor = sc.next();
        int indice = encontrarCompositor(compositor);
        if (indice != -1) {
            System.out.println("El compositor se encuentra en la posición: " + indice);
        } else {
            System.out.println("Compositor no encontrado en la lista.");
        }
    }

    private static int encontrarCompositor(String compositor) {
        for (int i = 0; i < COMPOSITORES.length; i++) {
            if (COMPOSITORES[i].equalsIgnoreCase(compositor)) {
                return i +1; // Se encontró el compositor, devolver la posición
            }
        }
        return -1; // Devolver -1 si el compositor no se encuentra
    }
    public static void main(String[] args) throws Exception {
        LeeInt();
        LeeIntPos();
        LeeIntRango();
        LeeDou();
        LeeDouRango();
        LeeString();
    }
}
