/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaafauzan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author petik
 */
public class Batuguntingkertas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO Auto-generated method stub
  String[] tangan = {"batu","gunting","kertas"};
  int batas, tangan_pem, tangan_mus;
  int main = 1;
  int score_pem = 0;
  int score_mus = 0;
  int putaran = 0;
  String pilih;
  
  Scanner scan = new Scanner(System.in);
  Random rand = new Random();
  
  do{
   System.out.print("mau main kagak? main(m) / gak(g): ");
   pilih = scan.nextLine();
   
   if (pilih.equalsIgnoreCase("m")){
    System.out.print("mau main berapa kali? Gak boleh > 7 : ");
    batas = scan.nextInt();
    
    while (putaran < batas && batas < 8 && batas !=0){
     System.out.print("\nketik\n1 => batu\n2 => gunting\n3 => kertas\npilhanmu: ");
     tangan_pem = scan.nextInt() - 1;
     tangan_mus = rand.nextInt(3);
     
     switch(tangan_pem){
      case 0:
      if (tangan_mus == 1){
       score_pem++;
      }else if (tangan_mus == 2){
       score_mus++;
      } 
      break;
      
      case 1:
      if (tangan_mus == 2){
       score_pem++;
      }else if (tangan_mus == 0){
       score_mus++;
      }
      break;
      
      case 2:
      if (tangan_mus == 0){
       score_pem++;
      }else if (tangan_mus == 1){
       score_mus++;
      }
      break;
     }
     System.out.println("anda memilih: " + tangan[tangan_pem] + " musuh: " + tangan[tangan_mus]);
     System.out.println("score sementara(pemain / musuh): " + score_pem + "-" + score_mus);
     putaran++;
    }
    System.out.println("\nScore Akhir: " + score_pem + "-" + score_mus);
    System.out.println("----------------------------------------------------------------------------");
   }else if (pilih.equalsIgnoreCase("g")){
    main = 0;
   }
  }while(main == 1);
  
  System.out.println("Bye...!!!");
            
        
        }
    }
    

