import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Rellenar rellenar = new Rellenar();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1.- Crear pedido");
            System.out.println("2.- Crear devolución");
            System.out.println("3.- Crear reclamación");
            System.out.println("4.- Cerrar reclamación");
            System.out.println("5.- Imprimir formulario por ID");
            System.out.println("6.- Imprimir todas las reclamaciones");
            System.out.println("7.- Imprimir todos los formularios");
            System.out.println("0.- Salir");

            int opcion = sc.nextInt();
            sc.nextLine();  

            // SWITCH - CASE PARA EL MENÚ

            switch (opcion) {
                case 0:
                    return;
                case 1:
                    System.out.print("Nombre del cliente:");
                    String cliente = sc.nextLine();

                    System.out.print("Producto:");
                    String producto = sc.nextLine();

                    System.out.print("Precio:");
                    double precio = sc.nextDouble();

                    rellenar.crearPedido(cliente, producto, precio);
                    break;
                case 2:
                    System.out.print("Nombre del cliente:");
                    String cliente1 = sc.nextLine();

                    System.out.print("Producto:");
                    String producto1 = sc.nextLine();

                    System.out.print("Precio:");
                    double precio1 = sc.nextDouble();

                    rellenar.crearDevolucion(cliente1, producto1, precio1);
                    break;
                case 3:
                    System.out.print("Nombre del cliente:");
                    String cliente2 = sc.nextLine();

                    System.out.print("Motivo de la reclamacion:");
                    String motivo = sc.nextLine();

                    rellenar.crearReclamacion(cliente2, motivo);
                    break;
                case 4:
                    System.out.print("ID para cerrar:");
                    String idRecl = sc.nextLine();

                    rellenar.cerrarReclamacion(idRecl);
                    break;
                case 5:
                    System.out.print("ID del formulario a imprimir:");
                    String idFormulario = sc.nextLine();

                    rellenar.imprimirFormularioPorId(idFormulario);
                    break;
                case 6:
                    rellenar.imprimirTodasLasReclamaciones();
                    break;
                case 7:
                    rellenar.imprimirTodosLosFormularios();
                    break;
            }
        }
    }
}

