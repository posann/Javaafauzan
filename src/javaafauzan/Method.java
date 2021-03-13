/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaafauzan;

/**
 *
 * @author petik
 */
public class Method {
    
    private static void salam() {
        System.out.println("Assalamu'Alaikum ");
    }
    
    private static void salam(String nama) {
        System.out.println("Assalamu'Alaikum " +nama);
    }
   
    private static void salam(String namaDepan, String namaBelakang) {
        System.out.println("Assalamu'Alaikum " +namaDepan+" "+namaBelakang);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        salam();
        salam("Afauzan");
        salam("Ahmad", "Fauzan");
        
    }

    
    
    
}
