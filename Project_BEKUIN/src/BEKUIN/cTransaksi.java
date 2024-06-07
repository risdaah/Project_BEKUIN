/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BEKUIN;

/**
 *
 * @author asus
 */
public class cTransaksi {
    
    protected String kasir, tanggal; 
    protected int kode_transaksi;

    public void setKasir(String kasir){
        kasir = kasir;
    }
    
    public void setTanggal(String tanggal){
        tanggal = tanggal;
    }
    
    public void setKodeTransaksi(int kt){
        kode_transaksi = kt;
    }    
    
    public String getKasir(String kasir){
        return kasir;
    } 

    public String getTanggal(){
        return tanggal;
    }
    
    public int getKodeTransaksi(){
        return kode_transaksi;
    }    
    
}
