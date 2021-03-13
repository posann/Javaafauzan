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
public class Santri extends Petik implements interfaceSantri {
    public String kamar ;
    public String asalDaerah;
    public String metode = "";
    public String belajar = "";
    
    public Santri(String nama, String kamar, String asalDaerah){
        super(nama);
        this.kamar = kamar;
        this.asalDaerah = asalDaerah;
    }

   String getKamar() {
        return kamar;
    }

   String getAsalDaerah() {
        return asalDaerah;
    }
    
    void info(){
        System.out.println("Nama :" +super.getNama());
        System.out.println("Kamar : "+ this.kamar);
        System.out.println("Asal Daerah : "+ this.asalDaerah);
    }
     @Override
    public String getMetodeMenghafal() {
        return "Sehari menghafal empat halaman";
    }
     @Override
    public String getCaraBelajar() {
        return "Berdoa dan Tawakkal";
    }
        
    }

