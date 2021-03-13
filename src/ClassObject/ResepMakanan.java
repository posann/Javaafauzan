/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObject;

/**
 *
 * @author petik
 */
public class ResepMakanan {
    String bahan_utama;
    String bumbu1;
    String bumbu2;
    String bumbu3;
    String bumbu4;
    double garam;
    double gula;
    double air;
    
    public String sedap() {
      if (garam > 5) {
      return "Asin";
      } else if (garam <= 0) {
      return "Hambar";
      } else {
      return "Sedap";
      }
      
    }
}
   
    
