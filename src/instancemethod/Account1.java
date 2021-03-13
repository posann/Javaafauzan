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
public class Account1 {
    private String no_acc ="";
    private double saldo = 0;

    public String getNo_acc() {
        return no_acc;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //atas panggilan (klik kanan insert code - getter)
    
    public  void setNoAccount1(String no_acc) {
        this.no_acc = no_acc;
    }
    
    public  void deposit(double uang) {
        this.saldo += uang;
//this.saldo = this.saldo + uang (saldo_akhir = saldo_saat ini + uang_masuk)
    }
    public void withdraw(double uang) {
        this.saldo -= uang;
//this.saldo = this.saldo - uang (saldo_akhir = saldo_saat ini - uang_keluar)
    }
    public void transfer(Account1 ac_tujuan,double uang) {
        ac_tujuan.deposit(uang);
        this.withdraw(uang);
    }
  }
