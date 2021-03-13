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
public class LoopingFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, a1 , a2;
       
        for (a = 1 ; a <= 10 ; a++){
            for (b = a ; b > 0 ; b--) {
                System.out.print(b+",");
            }
              System.out.println("");
        }
          for (a1 = 10 ; a1 >= 1 ; a1--) {
              for (a2 = a1 ; a2 >= 1 ; a2--) {
                  System.out.print(a2+",");
              }
              System.out.println("");
          }
        
        
        
    }
}