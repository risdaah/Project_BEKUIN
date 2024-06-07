/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BEKUIN;

/**
 *
 * @author asus
 */
public class cBarang extends cPembeli {
    protected String nama_barang, tanggal;
    protected int harga_barang, jumlah_barang, total_harga;
      
    
    //setter
    public void setNama_Barang(String nb){
        this.nama_barang = nb;
    }
    
    public void setHarga_Barang(int hb){
        this.harga_barang = hb;
    }
    
    public void setJumlah_Barang(int jb){
        this.jumlah_barang = jb;
    }
    
    public void setTotal_Harga(int th){
        this.total_harga = th;
    }
    
    
    //getter
    public String getNama_Barang(){
        return nama_barang;
    }  
    
    public double getHarga_Barang(){
        return harga_barang;
    }

    public int getJumlah_Barang(){
        return jumlah_barang;
    }
    
    public int getTotal_Harga(){
        return total_harga;
    }
    


}
