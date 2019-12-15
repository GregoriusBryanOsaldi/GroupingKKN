/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import Database.KelompokDb;
import Database.MahasiswaDb;
import Database.UserDb;
import Model.Kelompok;
import Model.Mahasiswa;
import Model.User;
import Stream.HalamanUtama;
import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author greg
 */
@WebService(serviceName = "GroupingKKNWS")
public class GroupingKKNWS {

    //Tabel User
    /**
     * Web service operation
     */
    @WebMethod(operationName = "cekUser")
    public boolean cekUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        UserDb user = new UserDb();
        return user.cekUser(username, password);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addUser")
    @Oneway
    public void addUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        UserDb user = new UserDb();
        user.addUser(username, password);
    }

    //Tabel Mahasiswa
    /**
     * Web service operation
     */
    @WebMethod(operationName = "addDataMahasiswa")
    public void addDataMahasiswa(@WebParam(name = "mahasiswa") Mahasiswa mahasiswa) {
        //TODO write your implementation code here:
        MahasiswaDb mhs = new MahasiswaDb();
        mhs.addDataMahasiswa(mahasiswa);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteDataMahasiswa")
    @Oneway
    public void deleteDataMahasiswa(@WebParam(name = "nim") String nim) {
        MahasiswaDb mhs = new MahasiswaDb();
        mhs.deleteDataMahasiswa(nim);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editDataMahasiswa")
    public void editDataMahasiswa(@WebParam(name = "mahasiswa") Mahasiswa mahasiswa) {
        //TODO write your implementation code here:
        MahasiswaDb mhs = new MahasiswaDb();
        mhs.editDataMahasiswa(mahasiswa);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "createGroupKKN")
    @Oneway
    public void createGroupKKN(@WebParam(name = "listMahasiswa") ArrayList<Mahasiswa> listMahasiswa) {
        MahasiswaDb createGroup = new MahasiswaDb();
        createGroup.createGroupKKN(listMahasiswa);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getListMahasiswa")
    public ArrayList<Mahasiswa> getListMahasiswa() {
        //TODO write your implementation code here:
        MahasiswaDb mhs = new MahasiswaDb();
        return mhs.getListMahasiswa();
    }

    //Tabel Kelompok
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getListGroup")
    public ArrayList<Kelompok> getListGroup() {
        //TODO write your implementation code here:
        KelompokDb klp = new KelompokDb();
        return klp.getListGroup();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addDataGroup")
    @Oneway
    public void addDataGroup(@WebParam(name = "group") Kelompok group) {
        KelompokDb klp = new KelompokDb();
        klp.addDataGroup(group);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteDataGroup")
    @Oneway
    public void deleteDataGroup(@WebParam(name = "idKelompok") String idKelompok) {
        KelompokDb klp = new KelompokDb();
        klp.deleteDataGroup(idKelompok);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editDataGroup")
    @Oneway
    public void editDataGroup(@WebParam(name = "group") Kelompok group) {
        KelompokDb klp = new KelompokDb();
        klp.editDataGroup(group);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bacaInformasiKKN")
    public String bacaInformasiKKN() {
        //TODO write your implementation code here:
        HalamanUtama halamanUtama = new HalamanUtama();
        return halamanUtama.bacaInformasiKKN();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "simpanInformasiKKN")
    @Oneway
    public void simpanInformasiKKN(@WebParam(name = "data") String data) {
        HalamanUtama halamanUtama = new HalamanUtama();
        halamanUtama.simpanInformasiKKN(data);
    }

}
