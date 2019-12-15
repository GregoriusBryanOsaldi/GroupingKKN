/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMethod;

import WebServices.GroupingKKNWS;

/**
 *
 * @author greg
 */
public class DeletDataGroup {
    public static void main(String[] args) {
        GroupingKKNWS ws = new GroupingKKNWS();
        ws.deleteDataGroup("2");
    }
}
