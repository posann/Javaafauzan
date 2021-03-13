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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci : ");
        int n = show.nextInt();
        int fauzan[] = new int[n];
        fauzan[0] = 1;
        fauzan[1] = 1;
        for(int i = 2; i < n; i++) {
            fauzan[i] = fauzan[i-1] + fauzan[i-2];
        }
         
        for (int i = 0; i < n; i++) {
        System.out.print(fauzan[i] +  " ");
    }
    
}
}