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
public class Pajak {
    private double pendapatan,pajakUmum;
    private String provinsi;
    
    public Pajak(double pendapatan, String provinsi){
        this.provinsi = provinsi;
        this.pendapatan = pendapatan;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    
    public double hitungPajak(){
        if(pendapatan >= 10000000){
            pajakUmum = pendapatan/100*10;
        }
        else if(pendapatan >= 5000000 && pendapatan < 10000000 ){
            pajakUmum = pendapatan/100*7.5;
        }
        else if(pendapatan >= 2500000 && pendapatan < 5000000 ){
            pajakUmum = pendapatan/100*5;
        }
        else if(pendapatan >= 1000000 && pendapatan < 2500000 ){
            pajakUmum = pendapatan/100*2;
        }
        return pajakUmum;
    }
}
