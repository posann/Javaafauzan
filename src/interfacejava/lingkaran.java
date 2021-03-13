/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacejava;

/**
 *
 * @author petik
 */
public class lingkaran implements bentuk2D{
    private float jari = 0f;

    public lingkaran(float jari) { // (const) memberi nilai 
        this.jari = jari; 
    }

    @Override
    public float getLuas() { //tulis implements dahulu di public lalu tekan tanda eror
       return PHI * this.jari * this.jari;
    }

    @Override
    public float getKeliling() {
       return 2 * PHI * this.jari;
    }

    @Override
    public String getNamaBentuk() {
       return "lingkaran";
    }
    
    
    
}
