/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipt_dot_matrix;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Immelman
 */
public class Db_Connection {
    private static Connection con;
    public static Connection koneksiDB() throws SQLException {
         try{
            String host = "jdbc:derby://localhost:1527/Barang",
            username = "sejahtera",
            pass = "sejahtera";
            con = (Connection) DriverManager.getConnection(host, username, pass);
            }
            catch (SQLException err){
                  System.out.println(err.getMessage());
            }
        return con;
    }
}
