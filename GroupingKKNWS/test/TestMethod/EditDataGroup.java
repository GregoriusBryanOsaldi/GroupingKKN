/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMethod;

import Model.Kelompok;
import WebServices.GroupingKKNWS;

/**
 *
 * @author greg
 */
public class EditDataGroup {

    public static void main(String[] args) {
        Kelompok kelompok=new Kelompok("1", "2", "sdas", "dfds", "asada", "dasda", "wesdc");
        GroupingKKNWS ws = new GroupingKKNWS();
        ws.editDataGroup(kelompok);
    }
}
