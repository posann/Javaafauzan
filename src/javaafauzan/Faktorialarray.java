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
public class Faktorialarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array [], angka, jumlah;
        array = new int[10000];
        double ratarata, total=0;
        Scanner ocang = new Scanner(System.in);
        
        // masukkan inputnya
        System.out.println("SELAMAT DATANG DIPERULANGAN AFAUZAN");
        System.out.println("Masukkan Banyaknya Angka yang akan kita jumlah : ");
        jumlah=ocang.nextInt();
         //mari kita buat faktorialnya
         
         for (angka = 1; angka <= jumlah; angka++){
             System.out.println("Nilai ke> "+angka+" : ");
             array[angka] = ocang.nextInt();
             total = total + array[angka];
         }
         
        ratarata = total/jumlah;
        System.out.println("Hasil Penjumlahan Adalah : "+total);
        System.out.println("Rata-ratanya Adalah : "+ratarata);
        
    }
    
}
