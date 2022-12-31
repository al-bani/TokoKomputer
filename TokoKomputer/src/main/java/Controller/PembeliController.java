/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.PembeliInterface;
import Pojo.Pembeli;
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
 * @author User
 */
public class PembeliController implements PembeliInterface {
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public List<Pembeli> findAll() {
        List<Pembeli> listPembeli = new ArrayList<>();
        String sql = "SELECT * FROM tb_pembeli";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                Pembeli pembeli = new Pembeli();
                pembeli.setUsernamePembeli(rs.getString("username_pembeli"));
                pembeli.setNamaPembeli(rs.getString("nama_pembeli"));
                pembeli.setAlamatPembeli(rs.getString("alamat_pembeli"));
                pembeli.setPasswordPembeli(rs.getString("password_pembeli"));
                
                listPembeli.add(pembeli);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PembeliController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listPembeli;
    }

    @Override
    public Integer create(Pembeli object) {
        int result = 0;
        String sql = "INSERT INTO tb_pembeli(username_pembeli, nama_pembeli, Alamat_pembeli, password_pembeli) "
                + "VALUES('"+object.getUsernamePembeli()+"', "
                + "'"+object.getNamaPembeli()+"', "
                + "'"+object.getAlamatPembeli()+"', "
                + "'"+object.getPasswordPembeli()+"')";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PembeliController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Pembeli object) {
        int result = 0;
        String sql = "UPDATE tb_pembeli SET nama_pembeli='"+object.getNamaPembeli()+"',"
                + " alamat_pembeli='"+object.getAlamatPembeli()+"',"
                + " Password_pembeli='"+object.getPasswordPembeli()+"'"
                + " WHERE username_pembeli='"+object.getUsernamePembeli()+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PembeliController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    
    public Pembeli findByUsername(String usernamePembeli) {
        Pembeli pembeli = null;
        String sql = "SELECT * FROM tb_pembeli WHERE username_pembeli="+usernamePembeli+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                pembeli = new Pembeli();
                pembeli.setUsernamePembeli(rs.getString("username_pembeli"));
                pembeli.setNamaPembeli(rs.getString("nama_pembeli"));
                pembeli.setAlamatPembeli(rs.getString("alamat_pembeli"));
                pembeli.setPasswordPembeli(rs.getString("password_pembeli"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PembeliController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return pembeli;
    }

    @Override
    public Integer delete(String usernamePembeli) {
        int result = 0;
        String sql = "DELETE FROM tb_pembeli WHERE username_pembeli="+usernamePembeli+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PembeliController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
