
package Pojo;

import java.util.List;

/**
 *
 * @author pesanan
 */

public class Pesanan {
    private int id_pesanan;
    private String username_pembeli;
    private String kode_Produk;
    private int jumlah_pesanan;


    public Pesanan() {
    }
    

    public int getId_pesanan() {
        return id_pesanan;
    }

    public void setId_pesanan(int id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    public String getUsername_pembeli() {
        return username_pembeli;
    }

    public void setUsername_pembeli(String username_pembeli) {
        this.username_pembeli = username_pembeli;
    }

    public String getKode_Produk() {
        return kode_Produk;
    }

    public void setKode_Produk(String kode_Produk) {
        this.kode_Produk = kode_Produk;
    }

    public int getJumlah_pesanan() {
        return jumlah_pesanan;
    }

    public void setJumlah_pesanan(int jumlah_pesanan) {
        this.jumlah_pesanan = jumlah_pesanan;
    }
}
