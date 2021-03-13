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
public class Makanan {

    /**
     * @param args the command line arguments
     */
    public static void sayurBayam(String[] args) {
        // TODO code application logic here
        ResepMakanan sayurBayam = new ResepMakanan();
        sayurBayam.bahan_utama = "Bayam";
        sayurBayam.bumbu1 = "Bawang Putih";
        sayurBayam.bumbu2 = "Masako/Royko";
        sayurBayam.bumbu3 = "Daging Sapi";
        sayurBayam.bumbu4 = "Saori Saus Tiram";
        sayurBayam.garam = 2;
        sayurBayam.gula = 1;
        sayurBayam.air = 1.3;
        
        System.out.println("Resep Sayur Bayam");
        System.out.println("===================");
        System.out.println("1. "+sayurBayam.bahan_utama);
        System.out.println("2. "+sayurBayam.bumbu1);
        System.out.println("3. "+sayurBayam.bumbu2);
        System.out.println("4. "+sayurBayam.bumbu3);
        System.out.println("5. "+sayurBayam.bumbu4);
        System.out.println("6. Garam "+sayurBayam.garam+" sdt");
        System.out.println("7. Gula "+sayurBayam.gula+" sdt");
        System.out.println("8. Air "+sayurBayam.air+" liter");
        System.out.println("Rasanya : "+sayurBayam.sedap());
        System.out.println("");
        System.out.println("");
        
    }
    public static void nasiuduk(String[] args) {
        ResepMakanan nasiuduk = new ResepMakanan();
        nasiuduk.bahan_utama = "daging";
        nasiuduk.bumbu1 = "tempe";
        nasiuduk.bumbu2 = "telur";
        nasiuduk.bumbu3 = "bihun";
        nasiuduk.bumbu4 = "kerupuk";
        nasiuduk.garam = 3;
        nasiuduk.gula = 1;
        
        
        
        System.out.println("Resep Nasi Uduk");
        System.out.println("===================");
        System.out.println("1. "+nasiuduk.bahan_utama);
        System.out.println("2. "+nasiuduk.bumbu1);
        System.out.println("3. "+nasiuduk.bumbu2);
        System.out.println("4. "+nasiuduk.bumbu3);
        System.out.println("5. "+nasiuduk.bumbu4);
        System.out.println("6. Garam "+nasiuduk.garam+" sdt");
        System.out.println("7. Gula "+nasiuduk.gula+" sdt");
        System.out.println("Rasanya : "+nasiuduk.sedap());
        
        
        
    }
    
}
