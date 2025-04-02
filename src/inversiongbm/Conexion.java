/*
 * INSERT INTO `interesGBM` (`id`, `interes`) VALUES (NULL, ''), (NULL, '6.50');
 */
package inversiongbm;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Salvador Lopez B. -- salvador@slcomputacion.com
 */
public class Conexion {
    //Conexion a Base de Datos con el interes Actual de GBM
    
        Connection conn = null;
    
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); //lee el driver de la conexión
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/varios","root","");
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
    
}
