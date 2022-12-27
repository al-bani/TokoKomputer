
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
    public Object create(Promo object) {
    int result = 0;
        String sql = "INSERT INTO tb_promo(kodePromo, namaPromo, potonganPromo, lamaPromo"
                + "VALUES('"+object.getKodePromo()+"', "
                + ""+object.getNamaPromo()+", "
                + ""+object.getPotonganPromo()+", "
                + "'"+object.getLamaPromo()+"')";
        
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
        String sql = "UPDATE promo SET namaPromo='"+object.getNamaPromo()+"', "
                + "potonganPromo="+object.getPotonganPromo()+", "
                + "lamaPromo="+object.getLamaPromo()+" from tb_promo "
                + "WHERE kodePromo="+object.getKodePromo()+"";
        
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
        String sql = "SELECT * FROM tb_promo WHERE kodePromo="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                promo= new Promo();
                 promo.setKodePromo(rs.getString("kodePromo"));
                promo.setNamaPromo(rs.getString("namaPromo"));
                promo.setPotonganPromo(rs.getInt("potonganPromo"));
                promo.setLamaPromo(rs.getString("lamaPromo"));
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
        String sql = "DELETE FROM tb_promo WHERE kodePromo="+id+"";
        
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
