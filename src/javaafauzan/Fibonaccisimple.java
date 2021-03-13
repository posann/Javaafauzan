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
public class Fibonaccisimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ahmad = 1;
        int fauzan = 1;
        int jumlah = ahmad+fauzan;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("||Bilangan Fibonacci afauzan||");
        System.out.println("==============================");
        System.out.print("Masukkan Deret : ");
        int deret = sc.nextInt();
        
        for (int i = 1; i <= deret; i++) {
        System.out.print(ahmad + ", ");
        ahmad = fauzan;
        fauzan = jumlah;
        jumlah = ahmad + fauzan;
        }
    }
    
}
