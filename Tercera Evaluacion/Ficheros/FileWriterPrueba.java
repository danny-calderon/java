// Crea un programa que permita introducir texto por teclado y lo irá guardando en un fichero

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPrueba {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String contenido;
        
        try {
            System.out.println("Introduce el nombre del fichero que quieras crear: ");
            nombre = sc.nextLine();

            FileWriter fw = new FileWriter(nombre + ".txt");
            
            System.out.println("Archivo creado correctamente.");
            System.out.println("Ahora escribe lo que quieras añadir al fichero: ");
            contenido = sc.nextLine();
            
            fw.write(contenido);
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
        sc.close();
    }
}