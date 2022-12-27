/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.PenjualInterface;
import Pojo.Penjual;
import Utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alzildan
 */
public class PenjualController implements PenjualInterface{
    private ConnectionManager conMan;
    private Connection conn;
    Statement state;
    ResultSet rs;

    @Override
    public Integer Login(String username, String password) {
        int result = 0;
        String query = "SELECT * FROM tb_penjual "
                + "WHERE username = '"+username+"' AND password = '"+password+"'";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(query);
            
            while (rs.next()) {
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    result = 1;
                } else {
                    result = 0;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PenjualController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    @Override
    public Integer Register(String username, String password, String namaDepan, String namaBelakang, String alamat, String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer updatePassword(String email, String Password) {
        int result = 0;
        String query = "UPDATE tb_penjual "
                + "SET password '"+Password+"' WHERE email = '"+email+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            state.executeUpdate(query);
            while (rs.next()) {
                if (rs.getString("password") == Password) {
                    result = 1;
                } else {
                    result = 0;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PenjualController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        
        return result;
    }

    @Override
    public Integer cekEmail(String email) {
        int result = 0;
        String query = "SELECT * FROM tb_penjual "
                + "WHERE email = '"+email+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(query);
            
            while (rs.next()) {
                if (rs.getString("email").equals(email)) {
                    result = 1;
                } else {
                    result = 0;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PenjualController.class.getName())
                    .log(Level.SEVERE, null, ex);
            
        }
        
    
        return result;
    }




    
}
