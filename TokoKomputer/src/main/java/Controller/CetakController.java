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
    public Integer hitungTotalPem() {
       int result = 0;
       String query = "SELECT COUNT(username_pembeli) AS totalPembeli FROM tb_pembeli";
       
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                 result = rs.getInt("totalPembeli");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
           
       return result;   
    }

    @Override
    public Integer hitungTotalProd() {
        int result = 0;
        String query = "SELECT COUNT(kode_produk) AS total_produk FROM tb_produk";
       
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                 result = rs.getInt("total_produk");
         
            }

        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
           
       return result;
    }

    @Override
    public Integer hitungTotalPes() {
        int result = 0;
        String query = "SELECT COUNT(id_pesanan) AS total_pesanan FROM tb_pesanan";
       
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                 result = rs.getInt("total_pesanan");
         
            }

        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
           
       return result;
    }

    @Override
    public Double hitungKeuntungan() {
        double totalHarga = hitungTotalHarga();
        int jumlahPesanan = hitungJumPes();
        double result = totalHarga*jumlahPesanan;
        
        return result;
    }

    @Override
    public Integer hitungJumPes() {
        int result = 0;
        String query = "SELECT SUM(jumlah_pesanan) AS total_jumlah_pesanan FROM tb_pesanan";
       
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                 result = rs.getInt("total_jumlah_pesanan");
         
            }

        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
           
       return result;
    }

    @Override
    public Double hitungTotalHarga() {
        double result = 0;
        String query = "SELECT SUM(harga_produk) AS total_harga FROM tb_produk prod "
                + "JOIN tb_pesanan pes ON prod.kode_produk = pes.kode_produk";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                result = rs.getDouble("total_harga");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CetakController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

}
