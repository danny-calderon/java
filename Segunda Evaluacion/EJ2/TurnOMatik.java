//programa para gesitonar la cola de un supermercado

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class TurnOMatik {
        public static Queue<String> cola = new LinkedList<String>();

        public static int case1 (String nombrecliente) {
            cola.add(nombrecliente);
            return cola.size() - 1;
        }

        public static String case2() {
            return cola.poll();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Dime cual de estás opciones quieres hacer:");
        System.out.println("0. Salir del programa.                          \n" +
                           "1. Saber cuantos clientes tengo delante         \n" +
                           "2. Saber que cliente toca ser atendido          \n" +
                           "3. Listar los clientes que quedan y mi posición \n"
        );
        
        int op = sc.nextInt();

        switch(op) {
            case 0: {
                System.out.println("Hasta la próxima.");
                System.exit(0);
            }
            case 1: {
                System.out.println("Introduce tu nombre para añadirte a la cola:");
                String nombrecliente = sc.next();
                System.out.println("Tienes " + case1(nombrecliente) + " clientes delante.");
                sc.next();
            }
            case 2: {
                System.out.println("Le toca ser antendido a:" + case2());
                sc.next();
            }
            case 3: {
                for (String nombre : cola) {
                    System.out.println(nombre);
                }
                sc.next();
            }
            sc.close();
        }
    }
}
