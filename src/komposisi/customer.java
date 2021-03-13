/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komposisi;

/**
 *
 * @author petik
 */
public class customer {
    private String nama = "";
    private String alamat = "";
    
    public customer(String nama, String alamat ) {
    this.nama = nama;
    this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    @Override
    public String toString() {
        return "Nama customer{" + "nama=" + nama + ", alamat=" + alamat + '}';
    }
    
            
            
    
}
