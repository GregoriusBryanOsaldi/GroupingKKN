/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author greg
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String jenis_kelamin;
    private String tanggalLahir;
    private String prodi;
    private String fakultas;
    private String agama;
    private String totalSks;
    private String email;
    private String tingkatanPenyakit;
    private String golonganDarah;
    private String tinggiBadan;
    private String beratBadan;
    private String alamat;
    private String noHP;
    private String idKelompok;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String jenis_kelamin, String tanggalLahir, String prodi, String fakultas, String agama, String totalSks, String email, String tingkatanPenyakit, String golonganDarah, String tinggiBadan, String beratBadan, String alamat, String noHP, String idKelompok) {
        this.nim = nim;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tanggalLahir = tanggalLahir;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.agama = agama;
        this.totalSks = totalSks;
        this.email = email;
        this.tingkatanPenyakit = tingkatanPenyakit;
        this.golonganDarah = golonganDarah;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        this.alamat = alamat;
        this.noHP = noHP;
        this.idKelompok = idKelompok;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
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

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getTotalSks() {
        return totalSks;
    }

    public void setTotalSks(String totalSks) {
        this.totalSks = totalSks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTingkatanPenyakit() {
        return tingkatanPenyakit;
    }

    public void setTingkatanPenyakit(String tingkatanPenyakit) {
        this.tingkatanPenyakit = tingkatanPenyakit;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(String tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public String getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(String beratBadan) {
        this.beratBadan = beratBadan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getIdKelompok() {
        return idKelompok;
    }

    public void setIdKelompok(String idKelompok) {
        this.idKelompok = idKelompok;
    }

}
