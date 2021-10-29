
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private static final String url = "jdbc:mysql://localhost:3306/estancias_exterior?serverTimezone=America/Argentina/Buenos_Aires";
    private static final String user = "root";
    private static final String pass = "root";

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
}
