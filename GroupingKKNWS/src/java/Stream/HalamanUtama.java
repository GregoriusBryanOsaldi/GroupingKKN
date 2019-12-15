/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author greg
 */
public class HalamanUtama {
    public String bacaInformasiKKN() {
        FileInputStream fis = null;
        String hasil = "";
        int dataInt;
        try {
            fis = new FileInputStream("InformasiKKN_HalamanUtama.txt");
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasil = hasil + (char) dataInt;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HalamanUtama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HalamanUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    public void simpanInformasiKKN(String data) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("InformasiKKN_HalamanUtama.txt", false);
            fos.write(data.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HalamanUtama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HalamanUtama.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(HalamanUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
