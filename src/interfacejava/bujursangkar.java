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
public class bujursangkar implements bentuk2D{
    private float sisi = 0f;
    
    public bujursangkar(float sisi) {
        this.sisi = sisi;
     }

    @Override
    public float getLuas() {
       return this.sisi * this.sisi; //tulis implements dahulu di public lalu tekan tanda eror
    }

    @Override
    public float getKeliling() {
       return 4f * this.sisi;
    }

    @Override
    public String getNamaBentuk() {
       return "bujur sangkar";
    }
    
    
    
}
