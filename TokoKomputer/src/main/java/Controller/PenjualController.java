/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.PenjualInterface;
import Pojo.Penjual;
import Swing.Dashboard;
import Utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Base64;

/**
 *
 * @author alzildan
 */
public class PenjualController implements PenjualInterface{
    private ConnectionManager conMan;
    private Connection conn;
    Statement state;
    ResultSet rs;
    Dashboard dashboard;
    

    @Override
    public Integer Login(String username, String password) {
        int result = 0;
        
        byte[] PasswordEncrypt = PasswordEncryptor(password);
        String EncryptedPassword = new String(PasswordEncrypt);
        
        String query = "SELECT * FROM tb_penjual  "
                + "WHERE username = '"+username+"' AND password = '"+EncryptedPassword+"'";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(query);
           
            while (rs.next()) {
                if (username.equals(rs.getString("username")) && EncryptedPassword.equals(rs.getString("password"))) {
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
        int result = 0;
        
        byte[] PasswordEncrypt = PasswordEncryptor(password);
        String EncryptedPassword = new String(PasswordEncrypt);
        
        String query = "INSERT INTO tb_penjual "
                + "(username, email, password, nama_depan, nama_belakang, alamat) "
                + "VALUES ('"+username+"','"+email+"','"+EncryptedPassword+"','"+namaDepan+"','"+namaBelakang+"','"+alamat+"')";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
                       
            state = conn.createStatement();
            state.executeUpdate(query);
            return result = 1;
        } catch (SQLException ex) {
            Logger.getLogger(PenjualController.class.getName())
                    .log(Level.SEVERE, null, ex);
          
        }
        
        return result = 0;
    }

    @Override
    public Integer updatePassword(String username, String Password) {
        int result = 0;
        
        byte[] PasswordEncrypt = PasswordEncryptor(Password);
        String EncryptedPassword = new String(PasswordEncrypt);
        
        String query = "UPDATE tb_penjual "
                + "SET password = '"+EncryptedPassword+"' WHERE username = '"+username+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            int n = state.executeUpdate(query);
            if (n == 1) {
                result = 1;
            } else{
                result = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PenjualController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        
        return result;
    }

    @Override
    public Integer cekUsername(String username) {
        int result = 0;
        String query = "SELECT * FROM tb_penjual "
                + "WHERE username = '"+username+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(query);
            
            while (rs.next()) {
                if (rs.getString("username").equals(username)) {
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
    
    private static byte[] PasswordEncryptor(String password){
        
        byte[] EncryptedPassword = Base64.getEncoder().encode(password.getBytes());
        
        return EncryptedPassword;
    }
    
    private static String passowrdDecryptor(byte[] encryptedPassword){
        byte[] decrypt = Base64.getDecoder().decode(encryptedPassword);
        String DecryptedPassword = new String(decrypt);
        
        return DecryptedPassword;
    }
    
    

 
}
