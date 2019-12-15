/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMethod;

import Database.MahasiswaDb;
import Model.Mahasiswa;
import java.util.ArrayList;

/**
 *
 * @author greg
 */
public class TestCreateGroup {

    public static void main(String[] args) {
        MahasiswaDb createGroup = new MahasiswaDb();
        ArrayList<Mahasiswa> mhs = createGroup.getListMahasiswa();
        createGroup.createGroupKKN(mhs);
    }
}
