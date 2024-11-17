import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;

public class Des { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        File archivo = new File("SAC.bin");

        //hashmap de la lista
        HashMap<String, Datos> lista = new HashMap<>();

        int op;
        
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            do {
                try {
                    boolean cp = true;

                    while (cp) { 
                        //pillo los datos y los meto en una variable nombre que luego meto en el hashmap
                        Datos meterdatos = (Datos)ois.readObject();
                        String nombre = meterdatos.getOBJECT();
                        lista.put(nombre, meterdatos);
                    }
                } catch (EOFException e) {
                    System.out.println("ERROR");
                }
                //limpio la pantalla gracias al Ginés, el dios supremo que me enseñó a hacerlo
                System.out.println("\033[H\033[2J");  
                System.out.println( "Bienvenido al menú Saguaro, elige lo que quieres hacer:    \n" +
                                    "1.Nombre del objeto                                        \n" +
                                    "2.Constelación                                             \n " + 
                                    "3.Magnitud                                                 \n " + 
                                    "4.Salir                                                    \n "
                );
                System.out.println("Dime un numero del 1 al 4, ambos números incluídos.");

                try {
                    String opcion = sc.nextLine();
                    op = Integer.parseInt(opcion);

                    switch (op) {
                        case 1:
                            //remplazo todos los espacios con comas
                            System.out.println("Introduce el nombre del objeto: ");
                            String nombreobjeto = sc.nextLine().replaceAll(" ", "");

                            for(Datos datos : lista.values()) {
                                //si el objeto es igual al nombre que hemos puesto, lo muestra
                                if(datos.getOBJECT().equals(nombreobjeto)){
                                    datos.printdatos();
                                }
                            }
                            continue;
        
                        case 2:
                            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
                            //lo mismo que el case 1 pero con los demás nombres y añadiendo un mensaje en caso de no encontrar nada////
                            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
                            System.out.println("Introduce el nombre de la constelación: ");
                            String constelacion = sc.nextLine();
                            boolean seguir = false;

                            for(Datos datos : lista.values()) {
                                if(datos.getCON().equals(constelacion)){
                                    datos.printdatos();
                                    seguir = true;
                                }
                            }
                            if (!seguir) {
                                System.out.println("No se ha encontado la constelacion" + constelacion);
                            }
                            continue;
        
                        case 3:
                            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
                            //lo mismo que el case 1 pero con los demás nombres y añadiendo un mensaje en caso de no encontrar nada////
                            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
                            Double magnitud;
                            System.out.println("¿Que magnitud buscas?");
                            magnitud = sc.nextDouble();

                            for(Datos datos : lista.values()) {
                                Double magnitud2 = Double.parseDouble(datos.getMAG());

                                if(magnitud2 <= magnitud){
                                    datos.printdatos();
                                }
                            }
                            sc.nextLine();
                            continue;
                        
                        case 4:
                            //saliendo del programa
                            System.out.println("Vas a salir del programa, ¡hasta la próxima!");
                            continue;
        
                        default:
                            System.out.println("Valor incorrecto, tiene que ser un número entre el 1 y el 4, ambos incluídos.");
                            continue;
                    }
                } catch (NumberFormatException ex) {
                        //en caso de poner cualquier otra cosa enseña un mensaje en lugar de la excepcións
                        System.out.println("Por favor, ingresa un número del 1 al 4.");
                    op = 0;
                }
                
            } while (op != 4);
            //si lo que elegimos no es igual a 4 cerramos los scanners y salimos del programa
            fis.close();
            ois.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        }
    }
}