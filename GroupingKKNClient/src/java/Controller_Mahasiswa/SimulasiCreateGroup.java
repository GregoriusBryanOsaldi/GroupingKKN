/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Mahasiswa;

import DatabaseDIPAKE_CLASS_SIMULASI.Mahasiswa;
import java.util.ArrayList;

/**
 *
 * @author greg
 */
public class SimulasiCreateGroup {

    public static void main(String[] args) {
        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

        Mahasiswa mhs1 = new Mahasiswa(1, "Greg", "L", "TI", "flu");
        Mahasiswa mhs2 = new Mahasiswa(2, "Holly", "P", "TM", "batuk");
        Mahasiswa mhs3 = new Mahasiswa(3, "Syelen", "P", "TE", "tbc");
        Mahasiswa mhs4 = new Mahasiswa(4, "Martin", "L", "TE", "tbc");
        Mahasiswa mhs5 = new Mahasiswa(5, "Abram", "L", "TI", "tbc");
        Mahasiswa mhs6 = new Mahasiswa(6, "Tejo", "P", "TI", "");
        Mahasiswa mhs7 = new Mahasiswa(7, "Kiwil", "L", "TM", "flu");
        Mahasiswa mhs8 = new Mahasiswa(8, "Rendi", "L", "TE", "");
        Mahasiswa mhs9 = new Mahasiswa(9, "Katrin", "P", "TE", "");
        Mahasiswa mhs10 = new Mahasiswa(10, "Elen", "P", "TI", "batuk");
        Mahasiswa mhs11 = new Mahasiswa(11, "Karel", "L", "TE", "");
        Mahasiswa mhs12 = new Mahasiswa(12, "Rosa", "P", "TE", "");
        Mahasiswa mhs13 = new Mahasiswa(13, "Rico", "P", "TM", "tbc");
        Mahasiswa mhs14 = new Mahasiswa(14, "Damar", "L", "TI", "");
        Mahasiswa mhs15 = new Mahasiswa(15, "Rendi", "L", "TI", "");

        mhs.add(mhs1);
        mhs.add(mhs2);
        mhs.add(mhs3);
        mhs.add(mhs4);
        mhs.add(mhs5);
        mhs.add(mhs6);
        mhs.add(mhs7);
        mhs.add(mhs8);
        mhs.add(mhs9);
        mhs.add(mhs10);
        mhs.add(mhs11);
        mhs.add(mhs12);
        mhs.add(mhs13);
        mhs.add(mhs14);
        mhs.add(mhs15);

        ArrayList<Mahasiswa> lakilaki = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> perempuan = new ArrayList<Mahasiswa>();

        for (int i = 0; i < mhs.size(); i++) {
            if (mhs.get(i).getJenis_kelamin().equals("L")) {
                lakilaki.add(mhs.get(i));
            }
            if (mhs.get(i).getJenis_kelamin().equals("P")) {
                perempuan.add(mhs.get(i));
            }
        }

        ArrayList<Mahasiswa> TIL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> TML = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> TEL = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> TIP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> TMP = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> TEP = new ArrayList<Mahasiswa>();

        ArrayList<Mahasiswa> mahasiswaTemp = new ArrayList<Mahasiswa>();

        for (int i = 0; i < lakilaki.size(); i++) {
            if (lakilaki.get(i).getProdi().equals("TI")) {
                TIL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("TE")) {
                TEL.add(lakilaki.get(i));
            } else if (lakilaki.get(i).getProdi().equals("TM")) {
                TML.add(lakilaki.get(i));
            }
        }

        for (int i = 0; i < TIL.size(); i++) {
            mahasiswaTemp.add(TIL.get(i));
        }
        for (int i = 0; i < TEL.size(); i++) {
            mahasiswaTemp.add(TEL.get(i));
        }
        for (int i = 0; i < TML.size(); i++) {
            mahasiswaTemp.add(TML.get(i));
        }

        for (int i = 0; i < perempuan.size(); i++) {
            if (perempuan.get(i).getProdi().equals("TI")) {
                TIP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("TE")) {
                TEP.add(perempuan.get(i));
            } else if (perempuan.get(i).getProdi().equals("TM")) {
                TMP.add(perempuan.get(i));
            }
        }

        for (int i = 0; i < TIP.size(); i++) {
            mahasiswaTemp.add(TIP.get(i));
        }
        for (int i = 0; i < TEP.size(); i++) {
            mahasiswaTemp.add(TEP.get(i));
        }
        for (int i = 0; i < TMP.size(); i++) {
            mahasiswaTemp.add(TMP.get(i));
        }

        ArrayList<Mahasiswa> sehat = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> sakit = new ArrayList<Mahasiswa>();
        for (int i = 0; i < mahasiswaTemp.size(); i++) {
            if (mahasiswaTemp.get(i).getPenyakit().equalsIgnoreCase("")) {
                sehat.add(mahasiswaTemp.get(i));
            } else {
                sakit.add(mahasiswaTemp.get(i));
            }

        }

        //Sorting penyakit
        ArrayList<Mahasiswa> tbc = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> batuk = new ArrayList<Mahasiswa>();
        ArrayList<Mahasiswa> flu = new ArrayList<Mahasiswa>();
        for (int i = 0; i < sakit.size(); i++) {
            if (sakit.get(i).getPenyakit().equalsIgnoreCase("tbc")) {
                tbc.add(sakit.get(i));
            } else if (sakit.get(i).getPenyakit().equalsIgnoreCase("batuk")) {
                batuk.add(sakit.get(i));
            } else if (sakit.get(i).getPenyakit().equalsIgnoreCase("flu")) {
                flu.add(sakit.get(i));
            }
        }
        ArrayList<Mahasiswa> sakitTemp = new ArrayList<Mahasiswa>();
        for (int i = 0; i < tbc.size(); i++) {
            sakitTemp.add(tbc.get(i));
        }
        for (int i = 0; i < batuk.size(); i++) {
            sakitTemp.add(batuk.get(i));
        }
        for (int i = 0; i < flu.size(); i++) {
            sakitTemp.add(flu.get(i));
        }

        sakit = sakitTemp;
        Mahasiswa[] klp1 = new Mahasiswa[5];
        Mahasiswa[] klp2 = new Mahasiswa[5];
        Mahasiswa[] klp3 = new Mahasiswa[5];
        int indexklp1 = 0;
        int indexklp2 = 0;
        int indexklp3 = 0;
        int j = 0;
        for (int i = 0; i < sakit.size(); i++) {
            if (sakit.get(i).getPenyakit().equalsIgnoreCase("tbc")) {
                while (j < 3) {
                    if (j == 0) {
                        klp1[indexklp1] = sakit.get(i);
                        indexklp1++;
                        j++;
                        break;
                    } else if (j == 1) {
                        klp2[indexklp2] = sakit.get(i);
                        indexklp2++;
                        j++;
                        break;
                    } else if (j == 2) {
                        klp3[indexklp3] = sakit.get(i);
                        indexklp3++;
                        j = 0;
                        break;
                    }
                }
            } else if (sakit.get(i).getPenyakit().equalsIgnoreCase("batuk")) {
                while (j < 3) {
                    if (j == 0) {
                        klp1[indexklp1] = sakit.get(i);
                        indexklp1++;
                        j++;
                        break;
                    } else if (j == 1) {
                        klp2[indexklp2] = sakit.get(i);
                        indexklp2++;
                        j++;
                        break;
                    } else if (j == 2) {
                        klp3[indexklp3] = sakit.get(i);
                        indexklp3++;
                        j = 0;
                        break;
                    }
                }
            } else if (sakit.get(i).getPenyakit().equalsIgnoreCase("flu")) {
                while (j < 3) {
                    if (j == 0) {
                        klp1[indexklp1] = sakit.get(i);
                        indexklp1++;
                        j++;
                        break;
                    } else if (j == 1) {
                        klp2[indexklp2] = sakit.get(i);
                        indexklp2++;
                        j++;
                        break;
                    } else if (j == 2) {
                        klp3[indexklp3] = sakit.get(i);
                        indexklp3++;
                        j = 0;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < sehat.size(); i++) {
            while (j < 3) {
                if (j == 0) {
                    klp1[indexklp1] = sehat.get(i);
                    indexklp1++;
                    j++;
                    break;
                } else if (j == 1) {
                    klp2[indexklp2] = sehat.get(i);
                    indexklp2++;
                    j++;
                    break;
                } else if (j == 2) {
                    klp3[indexklp3] = sehat.get(i);
                    indexklp3++;
                    j = 0;
                    break;
                }
            }

        }
        System.out.println("Kelompok 1");
        for (int i = 0; i < klp1.length; i++) {
            System.out.print((i + 1) + ". " + klp1[i].getNama() + "  ===>  " + klp1[i].getPenyakit() + "\n");
        }
        System.out.println("");
        System.out.println("Kelompok 2");
        for (int i = 0; i < klp2.length; i++) {
            System.out.print((i + 1) + " " + klp2[i].getNama() + "  ===>  " + klp2[i].getPenyakit() + "\n");
        }
        System.out.println("");
        System.out.println("Kelompok 3");
        for (int i = 0; i < klp3.length; i++) {
            System.out.print((i + 1) + " " + klp3[i].getNama() + "  ===>  " + klp3[i].getPenyakit() + "\n");
        }
    }
}
