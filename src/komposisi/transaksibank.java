/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komposisi;

/**
 *
 * @author petik
 */
public class transaksibank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //buat customer baru Andika
        customer cust =new customer("Andika", "Jakarta Barat");
         
        //buat akun bank untuk Andika
        AccountBank ab =new AccountBank("005", cust, 750);//hitungan juta
        
        //buat customer baru bernama falah
        customer cust2 = new customer("falah", "Kalimantan");
        
        //acount falah
        AccountBank ab2 =new AccountBank("007", cust2, 850);
        
        System.out.println(ab);//ini diterjemahkan oleh tostring
        System.out.println(ab2);
        
        ab.transfer(ab2, 250);
       // ab2.transfer(ab, 350);
        
        System.out.println(ab);
        System.out.println(ab2);
    }
    
}
