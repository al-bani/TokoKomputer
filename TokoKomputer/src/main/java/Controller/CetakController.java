/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utilities.ConnectionManager;
import Interface.CetakInterface;
import Pojo.Cetak;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CetakController implements CetakInterface {
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public List<Cetak> findAll() {
        List<Cetak> listCetak = new ArrayList<>();
        String sql = "SELECT * FROM cetak";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                Cetak cetak = new Cetak();
                
                cetak.setId(rs.getInt("ID"));
                cetak.setJumlahProduk(rs.getInt("jumlah_produk"));
                cetak.setTotalPembelian(rs.getFloat("total_pembelian"));
                cetak.setJumlahPembeli(rs.getInt("jumlah_pembeli"));
                
                listCetak.add(cetak);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listCetak;
    }

    @Override
    public Integer create(Cetak object) {
        int result = 0;
        String sql = "INSERT INTO cetak(ID,jumlah_produk, total_pembelian, jumlah_pembeli) "
                + "VALUES('"+object.getId()+"', "
                + "'"+object.getJumlahProduk()+"', "
                + "'"+object.getTotalPembelian()+"', "
                + ""+object.getJumlahPembeli()+"') ";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Cetak object) {
        int result = 0;
        String sql = "UPDATE cetak SET Jumlah_produk='"+object.getJumlahProduk()+"',"
                + " total_pembelian='"+object.getTotalPembelian()+"',"
                + " jumlah_pembelian="+object.getJumlahPembeli()+"'"
                + " WHERE ID="+object.getId()+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Cetak findById(int id) {
        Cetak cetak = null;
        String sql = "SELECT * FROM cetak WHERE ID="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                cetak = new Cetak();
                cetak.setId(rs.getInt("ID"));
                cetak.setJumlahProduk(rs.getInt("jumlah_produk"));
                cetak.setTotalPembelian(rs.getFloat("total_pembelian"));
                cetak.setJumlahPembeli(rs.getInt("jumlah_pembeli"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return cetak;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM cetak WHERE id="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

   
    
}
