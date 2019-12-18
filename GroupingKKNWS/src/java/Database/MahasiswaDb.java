/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Kelompok;
import Model.Mahasiswa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author greg
 */
public class MahasiswaDb {

    public void addDataMahasiswa(Mahasiswa mahasiswa) {
        Connection conn = null;
        Statement st = null;

        DbConnection dbConn = new DbConnection();
        conn = dbConn.getConnection();
        String sql = "INSERT INTO mahasiswa (nim, nama_mhs, jenis_kelamin_mhs, tanggal_lahir_mhs,"
                + " prodi, fakultas, agama_mhs, total_sks, email_mhs, tingkatan_penyakit, golongan_darah_mhs,"
                + " tinggi_badan_mhs, berat_badan_mhs, alamat_mhs, no_hp_mhs) VALUES ('"
                + mahasiswa.getNim() + "','"
                + mahasiswa.getNama() + "','"
                + mahasiswa.getJenis_kelamin() + "','"
                + mahasiswa.getTanggalLahir() + "','"
                + mahasiswa.getProdi() + "','"
                + mahasiswa.getFakultas() + "','"
                + mahasiswa.getAgama() + "','"
                + mahasiswa.getTotalSks() + "','"
                + mahasiswa.getEmail() + "','"
                + mahasiswa.getTingkatanPenyakit() + "','"
                + mahasiswa.getGolonganDarah() + "','"
                + mahasiswa.getTinggiBadan() + "','"
                + mahasiswa.getBeratBadan() + "','"
                + mahasiswa.getAlamat() + "','"
                + mahasiswa.getNoHP() + "')";
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

    public void editIdKelompokMahasiswa(Mahasiswa mahasiswa) {
        Connection conn = null;
        Statement st = null;

        DbConnection dbConn = new DbConnection();
        conn = dbConn.getConnection();

        String sql = "UPDATE `mahasiswa` SET `id_kelompok` = '" + mahasiswa.getIdKelompok() + "'\n"
                + "WHERE `nim` = '" + mahasiswa.getNim() + "'";
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

    public void editDataMahasiswa(Mahasiswa mahasiswa) {
        Connection conn = null;
        Statement st = null;

        DbConnection dbConn = new DbConnection();
        conn = dbConn.getConnection();

        String sql = "UPDATE `mahasiswa` SET `nama_mhs` = '" + mahasiswa.getNama() + "',"
                + " `jenis_kelamin_mhs` = '" + mahasiswa.getJenis_kelamin() + "',"
                + " `tanggal_lahir_mhs` = '" + mahasiswa.getTanggalLahir() + "',"
                + " `prodi` = '" + mahasiswa.getProdi() + "',"
                + " `fakultas` = '" + mahasiswa.getFakultas() + "',"
                + " `agama_mhs` = '" + mahasiswa.getAgama() + "',"
                + " `total_sks` = '" + mahasiswa.getTotalSks() + "',"
                + " `email_mhs` = '" + mahasiswa.getEmail() + "',"
                + " `tingkatan_penyakit` = '" + mahasiswa.getTingkatanPenyakit() + "',"
                + " `golongan_darah_mhs` = '" + mahasiswa.getGolonganDarah() + "',"
                + " `berat_badan_mhs` = '" + mahasiswa.getBeratBadan() + "',"
                + " `alamat_mhs` = '" + mahasiswa.getAlamat() + "',"
                + " `no_hp_mhs` = '" + mahasiswa.getNoHP() + "',"
                + " `id_kelompok` = '" + mahasiswa.getIdKelompok() + "' "
                + "WHERE `nim` = '" + mahasiswa.getNim() + "'";
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

    public void deleteDataMahasiswa(String nim) {
        Connection conn = null;
        Statement st = null;

        DbConnection dbConn = new DbConnection();
        conn = dbConn.getConnection();

        String sql = "DELETE from mahasiswa where nim='" + nim + "'";
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

    public void createGroupKKN(ArrayList<Mahasiswa> listMahasiswa) {
        ArrayList<Mahasiswa> lakilaki = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> perempuan = new ArrayList<Mahasiswa>();

        for (int i = 0; i < listMahasiswa.size(); i++) {
            if (listMahasiswa.get(i).getJenis_kelamin().equals("Laki-Laki")) {
                lakilaki.add(listMahasiswa.get(i));
            } else {
                perempuan.add(listMahasiswa.get(i));
            }
        }
        ArrayList<Mahasiswa> akutansiL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> ekonomiL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> manajemenL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> farmasiL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> bkL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pbsiL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pbiL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pbioL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pakL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> peL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pfisL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pgsdL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> ipakL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pkimL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pmatL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> psejL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> psiL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> infL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> matmurL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> teL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> tmL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> sasindoL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> sasingL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> sejarahL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> filsafatL = new ArrayList<Mahasiswa>();

        ArrayList<Mahasiswa> mahasiswaTemp = new ArrayList<Mahasiswa>();

        for (int i = 0; i < lakilaki.size(); i++) {
            if (lakilaki.get(i).getProdi().equals("Akutansi")) {
                akutansiL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Ekonomi")) {
                ekonomiL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Manajemen")) {
                manajemenL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Farmasi")) {
                farmasiL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Bimbingan dan Konseling")) {
                bkL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Bahasa dan Sastra Indonesia")) {
                pbsiL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Bahasa Inggris")) {
                pbiL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Biologi")) {
                pbioL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Ekonomi Bidang Keahlian Khusus Pendidikan Akuntansi")) {
                pakL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Ekonomi Bidang Keahlian Khusus Pendidikan Ekonomi")) {
                peL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Fisika")) {
                pfisL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Guru Sekolah Dasar")) {
                pgsdL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Keagamaan Katolik")) {
                ipakL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Kimia")) {
                pkimL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Matematika")) {
                pmatL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Pendidikan Sejarah")) {
                psejL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Psikologi")) {
                psiL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Informatika")) {
                infL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Matematika")) {
                matmurL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Teknik Elektro")) {
                teL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Teknik Mesin")) {
                tmL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Sastra Indonesia")) {
                sasindoL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Sastra Inggris")) {
                sasingL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Sejarah")) {
                sejarahL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("Filsafat Keilahian Program Sarjana")) {
                filsafatL.add(lakilaki.get(i));
            }
        }

        for (int i = 0; i < akutansiL.size(); i++) {
            mahasiswaTemp.add(akutansiL.get(i));
        }
        for (int i = 0; i < ekonomiL.size(); i++) {
            mahasiswaTemp.add(ekonomiL.get(i));
        }
        for (int i = 0; i < manajemenL.size(); i++) {
            mahasiswaTemp.add(manajemenL.get(i));
        }
        for (int i = 0; i < farmasiL.size(); i++) {
            mahasiswaTemp.add(farmasiL.get(i));
        }
        for (int i = 0; i < bkL.size(); i++) {
            mahasiswaTemp.add(bkL.get(i));
        }
        for (int i = 0; i < pbsiL.size(); i++) {
            mahasiswaTemp.add(pbsiL.get(i));
        }
        for (int i = 0; i < pbiL.size(); i++) {
            mahasiswaTemp.add(pbsiL.get(i));
        }
        for (int i = 0; i < pbioL.size(); i++) {
            mahasiswaTemp.add(pbioL.get(i));
        }
        for (int i = 0; i < pakL.size(); i++) {
            mahasiswaTemp.add(pakL.get(i));
        }
        for (int i = 0; i < peL.size(); i++) {
            mahasiswaTemp.add(peL.get(i));
        }
        for (int i = 0; i < pfisL.size(); i++) {
            mahasiswaTemp.add(pfisL.get(i));
        }
        for (int i = 0; i < pgsdL.size(); i++) {
            mahasiswaTemp.add(pgsdL.get(i));
        }
        for (int i = 0; i < ipakL.size(); i++) {
            mahasiswaTemp.add(ipakL.get(i));
        }
        for (int i = 0; i < pkimL.size(); i++) {
            mahasiswaTemp.add(pkimL.get(i));
        }
        for (int i = 0; i < pmatL.size(); i++) {
            mahasiswaTemp.add(pmatL.get(i));
        }
        for (int i = 0; i < psejL.size(); i++) {
            mahasiswaTemp.add(psejL.get(i));
        }
        for (int i = 0; i < psiL.size(); i++) {
            mahasiswaTemp.add(psiL.get(i));
        }
        for (int i = 0; i < infL.size(); i++) {
            mahasiswaTemp.add(infL.get(i));
        }
        for (int i = 0; i < matmurL.size(); i++) {
            mahasiswaTemp.add(matmurL.get(i));
        }
        for (int i = 0; i < teL.size(); i++) {
            mahasiswaTemp.add(teL.get(i));
        }
        for (int i = 0; i < tmL.size(); i++) {
            mahasiswaTemp.add(tmL.get(i));
        }
        for (int i = 0; i < sasindoL.size(); i++) {
            mahasiswaTemp.add(sasindoL.get(i));
        }
        for (int i = 0; i < sasingL.size(); i++) {
            mahasiswaTemp.add(sasingL.get(i));
        }
        for (int i = 0; i < sejarahL.size(); i++) {
            mahasiswaTemp.add(sejarahL.get(i));
        }
        for (int i = 0; i < filsafatL.size(); i++) {
            mahasiswaTemp.add(filsafatL.get(i));
        }

        ArrayList<Mahasiswa> akutansiP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> ekonomiP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> manajemenP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> farmasiP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> bkP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pbsiP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pbiP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pbioP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pakP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> peP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pfisP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pgsdP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> ipakP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pkimP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> pmatP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> psejP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> psiP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> infP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> matmurP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> teP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> tmP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> sasindoP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> sasingP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> sejarahP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> filsafatP = new ArrayList<Mahasiswa>();

        for (int i = 0; i < perempuan.size(); i++) {
            if (perempuan.get(i).getProdi().equals("Akutansi")) {
                akutansiP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Ekonomi")) {
                ekonomiP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Manajemen")) {
                manajemenP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Farmasi")) {
                farmasiP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Bimbingan dan Konseling")) {
                bkP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Bahasa dan Sastra Indonesia")) {
                pbsiP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Bahasa Inggris")) {
                pbiP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Biologi")) {
                pbioP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Ekonomi Bidang Keahlian Khusus Pendidikan Akuntansi")) {
                pakP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Ekonomi Bidang Keahlian Khusus Pendidikan Ekonomi")) {
                peP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Fisika")) {
                pfisP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Guru Sekolah Dasar")) {
                pgsdP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Keagamaan Katolik")) {
                ipakP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Kimia")) {
                pkimP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Matematika")) {
                pmatP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Pendidikan Sejarah")) {
                psejP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Psikologi")) {
                psiP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Informatika")) {
                infP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Matematika")) {
                matmurP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Teknik Elektro")) {
                teP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Teknik Mesin")) {
                tmP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Sastra Indonesia")) {
                sasindoP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Sastra Inggris")) {
                sasingP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Sejarah")) {
                sejarahP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("Filsafat Keilahian Program Sarjana")) {
                filsafatP.add(perempuan.get(i));
            }
        }

        for (int i = 0; i < akutansiP.size(); i++) {
            mahasiswaTemp.add(akutansiP.get(i));
        }
        for (int i = 0; i < ekonomiP.size(); i++) {
            mahasiswaTemp.add(ekonomiP.get(i));
        }
        for (int i = 0; i < manajemenP.size(); i++) {
            mahasiswaTemp.add(manajemenP.get(i));
        }
        for (int i = 0; i < farmasiP.size(); i++) {
            mahasiswaTemp.add(farmasiP.get(i));
        }
        for (int i = 0; i < bkP.size(); i++) {
            mahasiswaTemp.add(bkP.get(i));
        }
        for (int i = 0; i < pbsiP.size(); i++) {
            mahasiswaTemp.add(pbsiP.get(i));
        }
        for (int i = 0; i < pbiP.size(); i++) {
            mahasiswaTemp.add(pbiP.get(i));
        }
        for (int i = 0; i < pbioP.size(); i++) {
            mahasiswaTemp.add(pbioP.get(i));
        }
        for (int i = 0; i < pakP.size(); i++) {
            mahasiswaTemp.add(pakP.get(i));
        }
        for (int i = 0; i < peP.size(); i++) {
            mahasiswaTemp.add(peP.get(i));
        }
        for (int i = 0; i < pfisP.size(); i++) {
            mahasiswaTemp.add(pfisP.get(i));
        }
        for (int i = 0; i < pgsdP.size(); i++) {
            mahasiswaTemp.add(pgsdP.get(i));
        }
        for (int i = 0; i < ipakP.size(); i++) {
            mahasiswaTemp.add(ipakP.get(i));
        }
        for (int i = 0; i < pkimP.size(); i++) {
            mahasiswaTemp.add(pkimP.get(i));
        }
        for (int i = 0; i < pmatP.size(); i++) {
            mahasiswaTemp.add(pmatP.get(i));
        }
        for (int i = 0; i < psejP.size(); i++) {
            mahasiswaTemp.add(psejP.get(i));
        }
        for (int i = 0; i < psiP.size(); i++) {
            mahasiswaTemp.add(psiP.get(i));
        }
        for (int i = 0; i < infP.size(); i++) {
            mahasiswaTemp.add(infP.get(i));
        }
        for (int i = 0; i < matmurP.size(); i++) {
            mahasiswaTemp.add(matmurP.get(i));
        }
        for (int i = 0; i < teP.size(); i++) {
            mahasiswaTemp.add(teP.get(i));
        }
        for (int i = 0; i < tmP.size(); i++) {
            mahasiswaTemp.add(tmP.get(i));
        }
        for (int i = 0; i < sasindoP.size(); i++) {
            mahasiswaTemp.add(sasindoP.get(i));
        }
        for (int i = 0; i < sasingP.size(); i++) {
            mahasiswaTemp.add(sasingP.get(i));
        }
        for (int i = 0; i < sejarahP.size(); i++) {
            mahasiswaTemp.add(sejarahP.get(i));
        }
        for (int i = 0; i < filsafatP.size(); i++) {
            mahasiswaTemp.add(filsafatP.get(i));
        }

        ArrayList<Mahasiswa> sehat = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> sakit = new ArrayList<Mahasiswa>();
        for (int i = 0; i < mahasiswaTemp.size(); i++) {
            if (mahasiswaTemp.get(i).getTingkatanPenyakit().equals("0")) {
                sehat.add(mahasiswaTemp.get(i));
            } else {
                sakit.add(mahasiswaTemp.get(i));
            }
        }

        //Sorting penyakit
        ArrayList<Mahasiswa> tingkat1 = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> tingkat2 = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> tingkat3 = new ArrayList<Mahasiswa>();
        for (int i = 0; i < sakit.size(); i++) {
            if (sakit.get(i).getTingkatanPenyakit().equals("1")) {
                tingkat1.add(sakit.get(i));
            } else if (sakit.get(i).getTingkatanPenyakit().equals("2")) {
                tingkat2.add(sakit.get(i));
            } else if (sakit.get(i).getTingkatanPenyakit().equals("3")) {
                tingkat3.add(sakit.get(i));
            }
        }

        ArrayList<Mahasiswa> sakitTemp = new ArrayList<Mahasiswa>();
        for (int i = 0; i < tingkat1.size(); i++) {
            sakitTemp.add(tingkat1.get(i));
        }
        for (int i = 0; i < tingkat2.size(); i++) {
            sakitTemp.add(tingkat2.get(i));
        }
        for (int i = 0; i < tingkat3.size(); i++) {
            sakitTemp.add(tingkat3.get(i));
        }

        sakit = sakitTemp;

        //Pembagian Kelompok
        KelompokDb kelompok = new KelompokDb();
        ArrayList<Kelompok> klp = kelompok.getListGroup();

        ArrayList<Kelompok> kelompokTingkat1 = new ArrayList<Kelompok>();
        ArrayList<Kelompok> kelompokTingkat2 = new ArrayList<Kelompok>();
        ArrayList<Kelompok> kelompokTingkat3 = new ArrayList<Kelompok>();

        for (int i = 0; i < klp.size(); i++) {
            if (klp.get(i).getTingkatanDaerah().equals("1")) {
                kelompokTingkat1.add(klp.get(i));
            } else if (klp.get(i).getTingkatanDaerah().equals("2")) {
                kelompokTingkat2.add(klp.get(i));
            } else if (klp.get(i).getTingkatanDaerah().equals("3")) {
                kelompokTingkat3.add(klp.get(i));
            }
        }

        int indexKelompokTingkat1 = 0;
        int indexKelompokTingkat2 = 0;
        int indexKelompokTingkat3 = 0;
        for (int i = 0; i < sakit.size(); i++) {
            if (sakit.get(i).getTingkatanPenyakit().equals("1")) {
                sakit.get(i).setIdKelompok(kelompokTingkat1.get(indexKelompokTingkat1).getIdKelompok());
                indexKelompokTingkat1++;
                editIdKelompokMahasiswa(sakit.get(i));
            } else if (sakit.get(i).getTingkatanPenyakit().equals("2")) {
                sakit.get(i).setIdKelompok(kelompokTingkat2.get(indexKelompokTingkat2).getIdKelompok());
                indexKelompokTingkat2++;
                editIdKelompokMahasiswa(sakit.get(i));
            } else if (sakit.get(i).getTingkatanPenyakit().equals("3")) {
                sakit.get(i).setIdKelompok(kelompokTingkat3.get(indexKelompokTingkat3).getIdKelompok());
                indexKelompokTingkat3++;
                editIdKelompokMahasiswa(sakit.get(i));
            }

            if (indexKelompokTingkat1 == kelompokTingkat1.size()) {
                indexKelompokTingkat1 = 0;
            } else if (indexKelompokTingkat2 == kelompokTingkat2.size()) {
                indexKelompokTingkat2 = 0;
            } else if (indexKelompokTingkat3 == kelompokTingkat3.size()) {
                indexKelompokTingkat3 = 0;
            }
        }

        int indexKelompokSehat = 0;
        for (int i = 0; i < sehat.size(); i++) {
            sehat.get(i).setIdKelompok(klp.get(indexKelompokSehat).getIdKelompok());
            indexKelompokSehat++;
            editIdKelompokMahasiswa(sehat.get(i));

            if (indexKelompokSehat == klp.size()) {
                indexKelompokSehat = 0;
            }
        }
    }

    public ArrayList<Mahasiswa> getListMahasiswa() {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
        try {
            DbConnection dbConn = new DbConnection();
            Connection conn = dbConn.getConnection();

            Statement st = conn.createStatement();
            String sql = "select nim, nama_mhs, jenis_kelamin_mhs, tanggal_lahir_mhs,"
                + " prodi, fakultas, agama_mhs, total_sks, email_mhs, tingkatan_penyakit, golongan_darah_mhs,"
                + " tinggi_badan_mhs, berat_badan_mhs, alamat_mhs, no_hp_mhs, id_kelompok from mahasiswa";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String nim = rs.getString("nim");
                String nama = rs.getString("nama_mhs");
                String jenisKelamin = rs.getString("jenis_kelamin_mhs");
                String tanggallahir = rs.getString("tanggal_lahir_mhs");
                String prodi = rs.getString("prodi");
                String fakultas = rs.getString("fakultas");
                String agama = rs.getString("agama_mhs");
                String totalSks = rs.getString("total_SKS");
                String email = rs.getString("email_mhs");
                String tingkatanPenyakit = rs.getString("tingkatan_penyakit");
                String golonganDarah = rs.getString("golongan_darah_mhs");
                String tinggiBadan = rs.getString("tinggi_badan_mhs");
                String beratBadan = rs.getString("berat_badan_mhs");
                String alamat = rs.getString("alamat_mhs");
                String noHp = rs.getString("no_hp_mhs");
                String idKelompok = rs.getString("id_kelompok");

                Mahasiswa mhs = new Mahasiswa(nim, nama, jenisKelamin, tanggallahir, prodi, fakultas, agama,
                        totalSks, email, tingkatanPenyakit, golonganDarah, tinggiBadan, beratBadan, alamat, noHp, idKelompok);
                listMahasiswa.add(mhs);
            }
        } catch (SQLException ex) {
            System.out.println("Data gagal diambil");
        }
        return listMahasiswa;
    }
}
