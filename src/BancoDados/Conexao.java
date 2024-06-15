
package BancoDados;

import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Marcelinho
 */
public class Conexao {
       public static void main(String[] args) {
        Connection conn = null;
        try {
            ConnectionFactory factory = new ConnectionFactory();
            conn = factory.conectar();
            if (conn != null) {
                System.out.println("Connected to the database!");
                // Optionally, you can perform further database operations here
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (Exception e) {
            System.err.println("Connection failed: " + e.getMessage());
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
