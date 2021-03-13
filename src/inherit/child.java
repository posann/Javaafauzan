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
public class child extends base{
    private int umur=0;
    
    public child(String nama, int umur){
        super(nama);
        this.umur = umur;
    }
    int getUmur(){
        return this.umur;
    }
    void info(){
        System.out.println("nama :" +super.getNama() + ",Usia : "+this.umur);
    }
    
    
}
