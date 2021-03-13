/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author petik
 */
public class base {
    private String nama ="";
    
    public base(String nama){
        this.nama =nama;
    }
    void info(){
        System.out.println("nama : "+this.nama);
    }
    String getNama(){
        return this.nama;
    }
    
}
