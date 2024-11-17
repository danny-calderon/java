import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class verficacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        String lectura;
        String usufichero;
        String contrafichero;

        System.out.println("Introduce el nombre del fichero en el que quieres buscar: ");
        String fichero = sc.nextLine();
        String documento = fichero + ".txt";
        System.out.println("Dime el usuario que quieres verificar: ");
        String usuario = sc.nextLine();

        System.out.println("Dime la contraseña que quieres verificar: ");
        String contraseña = sc.nextLine();
        
        //creo un bufferedReader y le digo que lea documento
        try (BufferedReader br = new BufferedReader(new FileReader(documento));){
            //
            for(; (lectura = br.readLine()) != null;) {
                //creo un string partido por los dos puntos
                String[] separar = lectura.split(":");
                //separo el usuario y la contraseña en la parte izquierda y la parte derecha
                if (separar.length == 2){
                    usufichero = separar[0];
                    contrafichero = separar[1];
                    //los mensajes correspondientes
                    if (usufichero.equals(usuario) && contrafichero.equals(contraseña)) {
                        System.out.println("El usuario exsite.");
                        System.out.println("La contraseña es la correcta.");
                    } else {
                        System.out.println("ERROR, los datos introducidos no son los correctos.");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Saliendo del programa...");
        }
        sc.close();
    }    
}