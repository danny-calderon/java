import java.sql.*;
import java.util.Scanner;

public class Facturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el codigo del cliente");
        int codigoCliente = sc.nextInt();

        try {
            // Establecer conexión con la base de datos
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:33006/exdaw", "root", "bdrootpass");
            // Consulta SQL para obtener los datos del cliente
            String consulta = "SELECT nombreCliente, direccionCliente, ciudadCliente, codPostalCliente, paisCliente, telefonoCliente FROM clientes WHERE codigoCliente = ?";

            // Preparar la consulta
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, codigoCliente);

            // Ejecutar la consulta
            ResultSet resultado = statement.executeQuery();

            // Mostrar los datos del cliente
            if (resultado.next()) {
                String nombreCliente = resultado.getString("nombreCliente");
                String direccionCliente = resultado.getString("direccionCliente");
                String ciudadCliente = resultado.getString("ciudadCliente");
                String codPostalCliente = resultado.getString("codPostalCliente");
                String paisCliente = resultado.getString("paisCliente");
                String telefonoCliente = resultado.getString("telefonoCliente");

                System.out.println("Nombre del cliente: " + nombreCliente);
                System.out.println("Dirección: " + direccionCliente);
                System.out.println("Ciudad: " + ciudadCliente);
                System.out.println("Código Postal: " + codPostalCliente);
                System.out.println("País: " + paisCliente);
                System.out.println("Teléfono: " + telefonoCliente);
            } else {
                System.out.println("Cliente no encontrado");
            }

            // Cerrar la conexión y liberar recursos
            resultado.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}