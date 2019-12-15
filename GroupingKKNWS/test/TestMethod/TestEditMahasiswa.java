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
public class TestEditMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("175314086", "Jion", "Laki-Laki", "2019-12-02", "TI", "FTT", "Isam", "10",
                "greg@gmai.com", "2", "B", "80", "20", "Sukraya", "085156071935", "2");
        GroupingKKNWS ws = new GroupingKKNWS();
        ws.editDataMahasiswa(mahasiswa);
    }
}
