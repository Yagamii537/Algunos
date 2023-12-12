
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pande
 */
public class Conexion {
    Connection con;
    public Conexion() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbimagen","root","");
            //con=DriverManager.getConnection("jdbc:mysql://www.govisasecu.com:3306/govisase_Xerfact?serverTimezone=UTC","govisase","aVO.h5;GSx71n6");
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }        
    }
    
    public Connection getConnection(){
        return con;
    }
    
    
    
}
