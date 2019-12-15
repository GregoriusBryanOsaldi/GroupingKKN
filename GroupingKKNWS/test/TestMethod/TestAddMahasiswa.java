/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMethod;

import Model.Mahasiswa;
import WebServices.GroupingKKNWS;

/**
 *
 * @author greg
 */
public class TestAddMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("190", "Klambi", "Perempuan", "2019-12-03", "TE", "FST", "Islam", "100",
                "greg@gmail.com", "1", "A", "180", "70", "Sukaraya", "085256071935", "");
        GroupingKKNWS ws = new GroupingKKNWS();
        ws.addDataMahasiswa(mahasiswa);
    }
}
