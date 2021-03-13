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
public class benda2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lingkaran l = new lingkaran (9);
        persegipanjang p = new persegipanjang(100, 80);
        bujursangkar b = new bujursangkar(8);
        
        bentuk2D[] benda = {l, p, b};
        
        
        
        for (int i = 0; i <benda.length; i++){
           System.out.println("Nama Bentuk :" + benda[i].getNamaBentuk()+ ",luas :" + benda[i].getLuas()+ ",keliling :"+ benda[i].getKeliling());
    }
    }
    
}
