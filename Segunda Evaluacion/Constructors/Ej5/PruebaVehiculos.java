import java.util.Scanner;

public class PruebaVehiculos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        int op;

        do {
            System.out.println("VEHÍCULOS                           \n" + //
                                "=========                          \n" + //
                                "1. Anda en bicicleta               \n" + //
                                "2. Anda en coche                   \n" + //
                                "3. Ver kilometraje de la bicicleta \n" + //
                                "4. Ver kilometraje del coche       \n" + //
                                "5. Ver kilometraje total           \n" + //
                                "6. Ver vehículos totales           \n" + //
                                "7. Salir                           \n" + //
                                "Elige una opción (1-7):");
                                
                                
             op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Dime la distancia a recorrer en bici: ");
                    int distanciaBicicleta = sc.nextInt();

                    bicicleta.andar(distanciaBicicleta);
                    System.out.println("Has recorrido " + distanciaBicicleta + " kilómetros en bicicleta.");
                    break;
                case 2:
                    System.out.print("Dime la distancia a recorrer en coche: ");
                    int distanciaCoche = sc.nextInt();

                    coche.andar(distanciaCoche);
                    System.out.println("Has recorrido " + distanciaCoche + " kilómetros en coche.");
                    break;
                case 3:
                    System.out.println("Kilometraje de la bicicleta: " + bicicleta.getKilometrosRecorridos() + " km");
                    break;
                case 4:
                    System.out.println("Kilometraje del coche: " + coche.getKilometrosRecorridos() + " km");
                    break;
                case 5:
                    System.out.println("Kilometraje total: " + Vehiculos.kilometrosTotales + " km");
                    break;
                case 6:
                    System.out.println("Vehículos totales: " + Vehiculos.vehiculosCreados);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (op != 7);

        sc.close();
    }
}