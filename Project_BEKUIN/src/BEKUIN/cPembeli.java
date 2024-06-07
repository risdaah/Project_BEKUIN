/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BEKUIN;

/**
 *
 * @author asus
 */
public class cPembeli extends cTransaksi{
    protected String nama_pembeli, level_pembeli, kasir;  
    
    //setter
    public void setNamaPembeli(String n){
       nama_pembeli = n;
    }
    
    public void setLevel(String lvl){
        level_pembeli = lvl;
    }
    
    
    //getter
    public String getNamaPembeli(String n){
        return nama_pembeli;
    }
    
    public String getLevel(String lvl){
        return level_pembeli;
    }    
    
}
