/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.ProdukInterface;
import Pojo.Produk;
import Utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alzildan
 */
public class ProdukController implements ProdukInterface {
    private ConnectionManager conMan;
    private Connection conn;
    Statement state;
    ResultSet rs;

    @Override
    public List<Produk> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer create(Produk object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer update(Produk object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Produk findById(int id) {
       Produk prod = null;
        String sql = "SELECT * FROM obat WHERE id_obat="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            
            while (rs.next()) {
                prod = new Produk();
                prod.setKode(rs.getString("kode_produk"));
                prod.setNama(rs.getString("nama_produk"));
                prod.setPengiriman(rs.getString("pengiriman"));
                prod.setDeskripsi(rs.getString("deskripsi_produk"));
                prod.setPembayaran(rs.getString("metode_pembayaran"));
                prod.setHarga(rs.getDouble("harga_produk"));
                prod.setStok(rs.getInt("stok_produk"));
                prod.setBerat(rs.getInt("berat_produk"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prod;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String query = "";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            result = state.executeUpdate(query);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
}
