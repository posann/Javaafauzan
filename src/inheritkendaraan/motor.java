/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritkendaraan;

/**
 *
 * @author petik
 */
public class motor extends kendaraan {
    private String merk;
    private String tipe;

    public motor(String merk, String tipe, int roda, int penumpang, String nama) {
        super(roda, penumpang, nama);
        this.merk = merk;
        this.tipe = tipe;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    
}
