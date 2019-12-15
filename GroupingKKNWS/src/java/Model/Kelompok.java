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
public class Kelompok {

    private String idKelompok;
    private String tingkatanDaerah;
    private String pedukuhan;
    private String desa;
    private String kecamatan;
    private String kabupaten;
    private String provinsi;

    public Kelompok() {
    }

    public Kelompok(String idKelompok, String tingkatanDaerah, String pedukuhan, String desa, String kecamatan, String kabupaten, String provinsi) {
        this.idKelompok = idKelompok;
        this.tingkatanDaerah = tingkatanDaerah;
        this.pedukuhan = pedukuhan;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.provinsi = provinsi;
    }

    public String getIdKelompok() {
        return idKelompok;
    }

    public void setIdKelompok(String idKelompok) {
        this.idKelompok = idKelompok;
    }

    public String getTingkatanDaerah() {
        return tingkatanDaerah;
    }

    public void setTingkatanDaerah(String tingkatanDaerah) {
        this.tingkatanDaerah = tingkatanDaerah;
    }

    public String getPedukuhan() {
        return pedukuhan;
    }

    public void setPedukuhan(String pedukuhan) {
        this.pedukuhan = pedukuhan;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

}
