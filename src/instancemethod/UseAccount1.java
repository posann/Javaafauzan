/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancemethod;

/**
 *
 * @author petik
 */
public class UseAccount1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account1 akun1 = new Account1();
        akun1.setNoAccount1("101010");
        
        System.out.println("akun 1 no account : "+akun1.getNo_acc());
        System.out.println("akun 1 saldo awal : " + akun1.getSaldo());
        
        akun1.deposit(1000);
        System.out.println("akun 1 saldo akhir : "+akun1.getSaldo());
        
        akun1.withdraw(300);
        System.out.println("akun 1 saldo akhir : "+akun1.getSaldo());
        
        
        Account1 akun2=new Account1();
        akun2.setNoAccount1("101010");
        System.out.println("akun 2 no account : "+akun2.getNo_acc());
        System.out.println("akun 2 saldo awal : "+akun2.getSaldo());
        
        
        akun1.transfer(akun2,400);
        System.out.println("akun 1 saldo akhir : "+akun1.getSaldo());
        System.out.println("akun 2 saldo akhir : "+akun2.getSaldo());
        
        
    }
    
}
