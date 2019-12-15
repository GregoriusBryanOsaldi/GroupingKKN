/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Kelompok;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author greg
 */
public class KelompokDb {

    public ArrayList<Kelompok> getListGroup() {
        ArrayList<Kelompok> listKelompok = new ArrayList<Kelompok>();
        try {
            DbConnection dbConn = new DbConnection();
            Connection conn = dbConn.getConnection();

            Statement st = conn.createStatement();
            String sql = "SELECT * FROM kelompok";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String idKelompok = rs.getString("id_kelompok");
                String tingkatanDaerah = rs.getString("tingkatan_daerah");
                String pedukuhan = rs.getString("pedukuhan");
                String desa = rs.getString("desa");
                String kecamatan = rs.getString("kecamatan");
                String kabupaten = rs.getString("kabupaten");
                String provinsi = rs.getString("provinsi");

                Kelompok klp = new Kelompok(idKelompok, tingkatanDaerah, pedukuhan, desa, kecamatan, kabupaten, provinsi);
                listKelompok.add(klp);
            }
        } catch (SQLException ex) {
            System.out.println("Data gagal diambil");
        }
        return listKelompok;
    }

    public void addDataGroup(Kelompok kelompok) {
        Connection conn = null;
        Statement st = null;

        DbConnection dbConn = new DbConnection();
        conn = dbConn.getConnection();

        String sql = "INSERT INTO kelompok (id_kelompok, tingkatan_daerah, pedukuhan, desa,"
                + "kecamatan,kabupaten, provinsi) VALUES ('"
                + kelompok.getIdKelompok() + "','"
                + kelompok.getTingkatanDaerah() + "','"
                + kelompok.getPedukuhan() + "','"
                + kelompok.getDesa() + "','"
                + kelompok.getKecamatan() + "','"
                + kelompok.getKabupaten() + "','"
                + kelompok.getProvinsi() + "')";
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
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

    public void editDataGroup(Kelompok kelompok) {
        Connection conn = null;
        Statement st = null;

        DbConnection dbConn = new DbConnection();
        conn = dbConn.getConnection();

        String sql = "UPDATE `kelompok` SET `tingkatan_daerah` = '" + kelompok.getTingkatanDaerah() + "',"
                + " `pedukuhan` = '" + kelompok.getPedukuhan() + "',"
                + " `desa` = '" + kelompok.getDesa() + "',"
                + " `kecamatan` = '" + kelompok.getKecamatan() + "',"
                + " `kabupaten` = '" + kelompok.getKabupaten() + "',"
                + " `provinsi` = '" + kelompok.getProvinsi() + "' "
                + "WHERE `id_kelompok` = '" + kelompok.getIdKelompok() + "'";
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Data berhasil diupdate");
        } catch (SQLException ex) {
            System.out.println("Data gagal diupdate");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Data gagal diupdate");
            }
        }
    }

    public void deleteDataGroup(String idKelompok) {
        Connection conn = null;
        Statement st = null;

        DbConnection dbConn = new DbConnection();
        conn = dbConn.getConnection();

        String sql = "DELETE from kelompok where id_kelompok='" + idKelompok + "'";
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Data gagal dihapus");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Data gagal dihapus");
            }
        }
    }
}
