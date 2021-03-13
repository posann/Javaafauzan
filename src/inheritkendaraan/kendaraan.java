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
public class kendaraan {
    private int roda;
    private int penumpang;
    private String nama;

    public kendaraan(int roda, int penumpang, String nama) {
        this.roda = roda;
        this.penumpang = penumpang;
        this.nama = nama;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
 
    
}
