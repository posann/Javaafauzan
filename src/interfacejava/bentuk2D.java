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
public interface bentuk2D {
    final float PHI = 3.14f;
    public float getLuas(); //ini masih abstrak harus dipanggil di class lain
    public float getKeliling();
    public String getNamaBentuk();
    
    
}
