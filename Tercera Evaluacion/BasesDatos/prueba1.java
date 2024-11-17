import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class prueba1 {
    public static void main(String[] args) {
        try{
            //Conexión con la BD
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33006/CARALIBRO", "root", "dbrootpass");
            // Creamos un objeto para enviar sentencias SQL a la BD
            Statement st = con.createStatement();
            // Ejecutamos la consulta SQL y obtenemos el resultado en ResultSet
            ResultSet rs = st.executeQuery("SELECT * FROM roles");
            // Recorremos los resultados obtenidos y mostramos sus campos
            while (rs.next()) {
                String descripcion = rs.getString("descripcion");
                int idrol = rs.getInt("idrol");
                
                System.out.println(idrol + ": " + descripcion);
            }
            st.executeUpdate("INSERT INTO ")
            // Cerramos la conexión
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }
}