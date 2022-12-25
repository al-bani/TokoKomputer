/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author User
 */
public class Produk {
    private String nama;
    private String deskripsi;
    private int stok;
    private double harga;
    private String pengiriman;
    private double berat;
    private String pembayaran;

    public Produk() {
        
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setPengiriman(String pengiriman) {
        this.pengiriman = pengiriman;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public String getPengiriman() {
        return pengiriman;
    }

    public double getBerat() {
        return berat;
    }
}
