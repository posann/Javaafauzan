/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritPerpajakan;

/**
 *
 * @author HP
 */
public class PajakSulsel extends Pajak{
    private String nama;
    public PajakSulsel(String nama, String provinsi, double pendapatan) {
        super(pendapatan, provinsi);
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
