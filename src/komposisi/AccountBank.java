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
public class AccountBank extends Account1 {
    private customer cust = null;
    
    public AccountBank (String no, customer cust, double saldo_awal){
        super(no, saldo_awal);
        this.cust =cust;
     }
    
   @Override
     public String toString() {
        return super.toString() + ", pemilik " + this.cust.getNama();
    }
    
    public void transfer(AccountBank ac_tujuan,double uang){
        ac_tujuan.deposit(uang);
        withdraw(uang);
    }
    
    
    
    
}
