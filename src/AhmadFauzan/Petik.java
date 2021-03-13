/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhmadFauzan;

/**
 *
 * @author petik
 */
public class Petik {
    private String nama ="";
    
    public Petik(String nama){
        this.nama =nama;
    }
    void info(){
        System.out.println("nama : "+this.nama);
    }
    String getNama(){
        return this.nama;
    }
    
}

    
