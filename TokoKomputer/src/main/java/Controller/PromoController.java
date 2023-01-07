
package Controller;


import Interface.PromoInterface;
import Pojo.Promo;
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
public class PromoController implements PromoInterface{

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public List<Promo> findAll() {
       List<Promo> listPromo = new ArrayList<>();
        String sql = "SELECT * FROM tb_promo";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                Promo promo = new Promo();
                promo.setKodePromo(rs.getInt("kode_Promo"));
                promo.setNamaPromo(rs.getString("nama_Promo"));
                promo.setPotonganPromo(rs.getInt("potongan_Promo"));
                promo.setLamaPromo(rs.getString("periode_Promo"));
                
                
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
    public Object create(Promo object) {
    int result = 0;
        String sql = "INSERT INTO tb_promo(kode_promo, nama_promo, periode_Promo, potongan_promo)"
                + "VALUES("+object.getKodePromo()+", "
                + "'"+object.getNamaPromo()+"', "
                + "'"+object.getLamaPromo()+"', "
                + ""+object.getPotonganPromo()+")";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PromoController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Object update(Promo object) {
    int result = 0;
        String sql = "UPDATE tb_promo SET nama_promo='"+object.getNamaPromo()+"', "
                + "potongan_promo = "+object.getPotonganPromo()+", "
                + "periode_promo = '"+object.getLamaPromo()+" '"
                + "WHERE kode_promo = "+object.getKodePromo()+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PromoController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Promo findById(int id) {
        Promo promo = null;
        String sql = "SELECT * FROM tb_promo WHERE kode_promo = "+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                promo= new Promo();
                 promo.setKodePromo(rs.getInt("kode_Promo"));
                promo.setNamaPromo(rs.getString("nama_Promo"));
                promo.setPotonganPromo(rs.getInt("potongan_Promo"));
                promo.setLamaPromo(rs.getString("periode_Promo"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PromoController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return promo;
    }

    @Override
    public Object delete(int id) {
        int result = 0;
        String sql = "DELETE FROM tb_promo WHERE kode_promo="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(PromoController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
