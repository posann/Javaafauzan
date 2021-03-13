/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhmadFauzan;

/**
 *
 * @author petik
 */
public class Mahasantri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      String nama = "Ahmad Fauzan";
      Santri b1 = new Santri(nama, "Integritas", "Makassar");
      b1.info();
      
      System.out.println("Cara Belajar : "+ b1.getCaraBelajar() );
      System.out.println("Metode Menghafal : "+ b1.getMetodeMenghafal());
        
      
    }
    
}

