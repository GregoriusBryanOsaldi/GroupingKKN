/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author greg
 */
public class UserDb {
    public boolean cekUser(String username, String password) {
        ArrayList<User> daftarUser = new ArrayList<User>();
        try {
            DbConnection dbConn = new DbConnection();
            Connection conn = dbConn.getConnection();

            Statement st = conn.createStatement();
            String sql = "select username, password from user";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String usr = rs.getString("username");
                String psw = rs.getString("password");

                User user = new User(usr, psw);
                daftarUser.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDb.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < daftarUser.size(); i++) {
            if (username.equals(daftarUser.get(i).getUsername())) {
                if (password.equals(daftarUser.get(i).getPassword())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void addUser(String username, String password) {
        Connection conn = null;
        Statement st = null;

        DbConnection dbConn = new DbConnection();
        conn = dbConn.getConnection();

        String sql = "INSERT INTO user (username, password) VALUES ('"
                + username + "','"
                + password + "')";
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Data berhasil disimpan");
        } catch (SQLException ex) {
            System.out.println("Data gagal disimpan");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Data gagal disimpan");
            }
        }
    }
}
