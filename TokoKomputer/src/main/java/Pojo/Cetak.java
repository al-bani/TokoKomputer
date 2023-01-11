/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author User
 */
public class Cetak {
    private int id;
    private int jumlahProduk;
    private float totalPembelian;
    private int jumlahPembeli;

    public Cetak() {
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }

    public void setJumlahProduk(int jumlahProduk) {
        this.jumlahProduk = jumlahProduk;
    }

    public float getTotalPembelian() {
        return totalPembelian;
    }

    public void setTotalPembelian(float totalPembelian) {
        this.totalPembelian = totalPembelian;
    }

    public int getJumlahPembeli() {
        return jumlahPembeli;
    }

    public void setJumlahPembeli(int jumlahPembeli) {
        this.jumlahPembeli = jumlahPembeli;
    }
    
    
}
