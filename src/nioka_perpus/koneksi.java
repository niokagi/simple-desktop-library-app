package nioka_perpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Adhim Niokagi
 * 
 */
public class koneksi {
    private Connection koneksi;
    
    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection Succesfully");
        } catch(ClassNotFoundException ex) {
            System.out.println("Connection Failed");
        }
        
        String url = "jdbc:mysql://localhost:3306/java_databases";
        
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            System.out.println("Failed to connect databases");
        }
        
        return koneksi;
    }
}
