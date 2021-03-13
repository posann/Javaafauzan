/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaafauzan;

import java.util.Scanner;

/**
 *
 * @author petik
 */
public class Kalkulatorswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih, a1, a2; //Variabel kita zan
        double hasil;
        Scanner hitung = new Scanner(System.in); // untuk mengscan angka
        
        System.out.println("SELAMAT DATANG DIKALKULATOR AFAUZAN");
        System.out.println("Jenis Perhitungan :");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. perkkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("Masukkan Pilihan Anda : ");
        pilih=hitung.nextInt();
        System.out.println("Masukkan Angka Pertama : ");
        a1=hitung.nextInt();
        System.out.println("Masukkan Angka Kedua : ");
        a2=hitung.nextInt();
        
        switch(pilih){
            case 1:
                hasil=a1+a2;
                System.out.println("Hasilnya = "+ hasil);
                break;
            
            case 2:
            hasil=a1-a2;
                System.out.println("Hasilnya = "+hasil);
                break;
                
            case 3:
                hasil=a1*a2;
                System.out.println("Hasilnya = "+hasil);
                break;
                
            case 4:
                hasil=a1/a2;
                System.out.println("Hasilnya = "+hasil);
                break;
        }
        
        
    }
    
}
