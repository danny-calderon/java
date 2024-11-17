import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class ImportarCSV {

    public static void main(String[] args) {
        try {
            // conectar a la base de datos
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:33006/exdaw", "root", "bdrootpass");

            // crea la tabla si no existe
            String createTableQuery ="CREATE TABLE exdaw.Empleados (" +
                    "`CodigoEmpleado` int NOT NULL," +
                    "`Nombre` varchar(50) NOT NULL," +
                    "`Apellido1` varchar(50) NOT NULL," +
                    "`Apellido2` varchar(50) DEFAULT NULL," +
                    "`Extension` varchar(10) NOT NULL,"+
                    "`Email` varchar(100) NOT NULL,"+
                    "`CodigoJefe` int DEFAULT NULL,"+
                    "`Puesto` varchar(50) DEFAULT NULL,"+
                    "PRIMARY KEY (`CodigoEmpleado`),"+
                    "KEY `Empleados_EmpleadosFK` (`CodigoJefe`)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(createTableQuery);

            // lee el csv y mete los datos en un arraylist
            String csvFile = "Empleados.csv";
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line;

            br.readLine(); // omito la primera linea del archivo porque son los parametros

            // mientras haya algo le asignamos valores a los parámetros de la tabla
            while ((line = br.readLine()) != null) {
                //lo parto por las comas y cada particion va a un array, del 0 al 7
                String[] values = line.split(",");
                int CodigoEmpleado = Integer.parseInt(values[0]);
                String Nombre = values[1];
                String Apellido1 = values[2];
                String Apellido2 = values[3];
                int Extension = Integer.parseInt(values[4]);
                String Email = values[5];
                int CodigoJefe = Integer.parseInt(values[6]);
                String Puesto = values[7];

                // preparamos la consulta para meter los datos
                String query = "INSERT INTO exdaw.Empleados (`CodigoEmpleado`,`Nombre`,`Apellido1`,`Apellido2`,`Extension`,`Email`,`CodigoJefe`,`Puesto`) VALUES ('4','Maria','Solis','Jerez','2847','msolis@jardineria.es',2,'Secretaria')";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                // metemos los datos en la tabla
                preparedStatement.setInt(1, CodigoEmpleado);
                preparedStatement.setString(2, Nombre);
                preparedStatement.setString(3, Apellido1);
                preparedStatement.setString(4, Apellido2);
                preparedStatement.setInt(5, Extension);
                preparedStatement.setString(6, Email);
                preparedStatement.setInt(7, CodigoJefe);
                preparedStatement.setString(8, Puesto);

                // ejecutamos la consulta
                preparedStatement.executeUpdate();
            }
            // cierre de conexion
            connection.close();

            System.out.println("Datos subidos correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al subir los datos: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }
}