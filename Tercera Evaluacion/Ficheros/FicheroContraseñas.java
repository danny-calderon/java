import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicheroContraseñas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String contra;
        String op;
        int temp = 0;

        System.out.println("Dime el nombre del archivo a crear: ");
        String nomb = sc.nextLine();

        try {
            FileWriter fw = new FileWriter(nomb + ".txt");
            System.out.println("Quieres continuar? (si/no) ");
            op = sc.nextLine();

            if (op.equals("no")) {
                System.exit(0);
            } else {

                System.out.println("Escribe los usuarios y contraseñas, si quieres salir escribe 'salir'");

                for (int i = 1; i > temp; i++) {
                    System.out.println("Dime el usuario: ");
                    nombre = sc.nextLine();
                    if (nombre.equals("salir")) {
                        System.exit(0);
                    }
                    System.out.println("Dime la contraseña (solo letras): ");
                    contra = sc.nextLine();
                    if (contra.equals("salir")) {
                        System.exit(0);
                    }
                    // si la contraseña no tiene solo letras, pinta un mensaje y vuelve al principio del bucle
                    if (!contra.matches("[a-zA-Z]+")) {
                        System.out.println("La contraseña solo debe contener letras.");
                        continue; // vuelvo al inicio del bucle
                    }
                    String contenido = (nombre + ":" + contra);
                    fw.write(contenido + "\n");
                    fw.flush();
                }
                fw.close();
            }
        } catch (IOException e) {
            System.out.println("Saliendo del programa...");
        }
        sc.close();
    }
}
