/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDIPAKE_CLASS_SIMULASI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author greg
 */
public class DbConnection {
    private String host = "172.23.9.185";
    private String username = "MHS175314111";
    private String password = "MHS175314111";
    private String port = "1521";
    private String dbName = "orcl";
    
    public Connection getConnection(){
        Connection conn = null;
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String host = this.host;
            String username = this.username;
            String password = this.password;
            String port = this.port;
            String dbName = this.dbName;
        
            String url = "jdbc:oracle:thin:@"+host+":"+port+":"+dbName;
            conn = DriverManager.getConnection(url,username,password);
            
        }  catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
}
