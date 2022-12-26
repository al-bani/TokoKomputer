
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
 * @author alzildan
 */
public class PesananController implements PesananInterface{
private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public List<Pesanan> findAll() {
        List<Pesanan> listPesanan = new ArrayList<>();
        String sql = "SELECT * FROM promo";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                Promo promo = new Promo();
                promo.setKodePromo(rs.getString("kodePromo"));
                promo.setNamaPromo(rs.getString("namaPromo"));
                promo.setPotonganPromo(rs.getInt("potonganPromo"));
                promo.setLamaPromo(rs.getString("lamaPromo"));
                
                
                listPromo.add(promo);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PromoController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listPromo;
    }

    @Override
    public Object create(Pesanan object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object update(Pesanan object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pesanan findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
