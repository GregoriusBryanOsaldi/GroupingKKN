/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author greg
 */
public class DbConnection {
    private String url = "jdbc:mysql://localhost:3306/gregorius";
    private String username = "Gregorius";
    private String password = "gregorius5";

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successfully");
        } catch (SQLException ex) {
             System.out.println("SQL Error");
        } catch (ClassNotFoundException ex) {
             System.out.println("Class Not Found");
        }
        return conn;
    }
}
