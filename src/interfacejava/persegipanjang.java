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
public class persegipanjang implements bentuk2D{

   private float panjang = 0f;
   private float lebar = 0f;
    
    public persegipanjang(float p, float l) { //constructor
        panjang = p;
        lebar = l;
    }

    @Override
    public float getLuas() { //tulis implements dahulu di public lalu tekan tanda eror
        return panjang * lebar;
    }

    @Override
    public float getKeliling() {
        return 2f * (panjang + lebar);
    }

    @Override
    public String getNamaBentuk() {
        return "persegi panjang";
    }
    
    
    
}
