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
public class PajakApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String daerah;
        PajakSulsel sulsel1 = new PajakSulsel("Ahmad Fauzan", "Sulawesi Selatan", 1200000); //1,2 juta
        PajakSulsel sulsel2 = new PajakSulsel("Ahmad Fadil", "Kalimantan Timur", 7500000f); //7,5 juta
        PajakSulsel sulsel3 = new PajakSulsel("Ahmad Farhan", "Sumatera Barat", 5000000f); //5 juta
        
        System.out.println("Program Contoh Pewarisan Inheritance");
        System.out.println("Nama Anda: " + sulsel1.getNama());
        System.out.println("Pendapatan Anda: " + sulsel1.getPendapatan());
        System.out.println("Pajak Anda: " + sulsel1.hitungPajak());
        System.out.println("Kota Anda: " + sulsel1.getProvinsi());
        System.out.println("Pajak Anda dengan potongan: " + (sulsel1.getPendapatan()-sulsel1.hitungPajak()));
        System.out.println();
        
        System.out.println("Nama Anda: " + sulsel2.getNama());
        System.out.println("Pendapatan Anda: " + sulsel2.getPendapatan());
        System.out.println("Pajak Anda: " + sulsel2.hitungPajak());
        System.out.println("Kota Anda: " + sulsel2.getProvinsi());
        System.out.println("Pajak Anda dengan potongan: " + (sulsel2.getPendapatan()-sulsel2.hitungPajak()));
        System.out.println();
        
        System.out.println("Nama Anda: " + sulsel3.getNama());
        System.out.println("Pendapatan Anda: " + sulsel3.getPendapatan());
        System.out.println("Pajak Anda: " + sulsel3.hitungPajak());
        System.out.println("Kota Anda: " + sulsel3.getProvinsi());
        System.out.println("Pajak Anda dengan potongan: " + (sulsel3.getPendapatan()-sulsel3.hitungPajak()));
        
        
        
    }
    
}
