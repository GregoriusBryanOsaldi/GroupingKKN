/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDIPAKE_CLASS_SIMULASI;

/**
 *
 * @author greg
 */
public class Mahasiswa {

    private int nim;
    private String nama;
    private String jenis_kelamin;
    private String prodi;
    private String penyakit;

    public Mahasiswa() {
    }

    public Mahasiswa(int nim, String nama, String jenis_kelamin, String prodi, String penyakit) {
        this.nim = nim;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.prodi = prodi;
        this.penyakit = penyakit;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }
    
    
}
