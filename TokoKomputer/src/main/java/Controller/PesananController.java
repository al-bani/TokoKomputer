
package Controller;

import Interface.PesananInterface;
import Pojo.Pesanan;
import Utilities.ConnectionManager;
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
 * @author Ramzi
 */

public class PesananController implements PesananInterface{
    
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    
    @Override
    public List<Pesanan> findAll() {
        List<Pesanan> listPesanan = new ArrayList<>();
        String sql = "SELECT * FROM tb_Pesanan";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                Pesanan pesanan = new Pesanan();
                pesanan.setId_pesanan(rs.getInt("id_Pesanan"));
                pesanan.setUsername_pembeli(rs.getString("username_Pembeli"));
                pesanan.setKode_Produk(rs.getString("kode_Produk"));
                pesanan.setJumlah_pesanan(rs.getInt("jumlah_Pesanan"));
                
                
                listPesanan.add(pesanan);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PesananController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listPesanan;
    }

    @Override
    public Object create(Pesanan object) {
        int result = 0;
        String sql = "INSERT INTO tb_pesanan(id_pesanan, username_pembeli, kode_produk, jumlah_pesanan) "
                + "VALUES("+object.getId_pesanan()+", "
                + "'"+object.getUsername_pembeli()+"', "
                + "'"+object.getKode_Produk()+"', "
                + ""+object.getJumlah_pesanan()+" )";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PesananController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Object update(Pesanan object) {
        int result = 0;
        String sql = "UPDATE tb_pesanan SET username_pembeli = '"+object.getUsername_pembeli()+"', "
                + "kode_produk = '"+object.getKode_Produk()+"', "
                + "jumlah_pesanan = "+object.getJumlah_pesanan()+" "
                + "WHERE id_pesanan =  "+object.getId_pesanan()+" ";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PesananController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Pesanan findById(int id) {
        Pesanan pesanan = null;
        String sql = "SELECT * FROM tb_pesanan WHERE id_pesanan="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                pesanan = new Pesanan();
                pesanan.setId_pesanan(rs.getInt("id_Pesanan"));
                pesanan.setUsername_pembeli(rs.getString("username_Pembeli"));
                pesanan.setKode_Produk(rs.getString("kode_produk"));
                pesanan.setJumlah_pesanan(rs.getInt("jumlah_Pesanan"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PesananController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pesanan;
    }

    @Override
    public Object delete(int id_pesanan) {
        int result = 0;
        String query = "DELETE FROM tb_pesanan WHERE id_pesanan = "+id_pesanan+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PesananController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    
}
