
package Pojo;

/**
 *
 * @author Ramzi
 */
public class Promo {
    
     private String namaPromo;
    private int kodePromo;
    private int potonganPromo;
    private String lamaPromo,kategoriPromo;

    public Promo() {
    }

    public String getKategoriPromo() {
        return kategoriPromo;
    }

    public void setKategoriPromo(String kategoriPromo) {
        this.kategoriPromo = kategoriPromo;
    }
    
    

    public String getNamaPromo() {
        return namaPromo;
    }

    public void setNamaPromo(String namaPromo) {
        this.namaPromo = namaPromo;
    }

    public int getKodePromo() {
        return kodePromo;
    }

    public void setKodePromo(int kodePromo) {
        this.kodePromo = kodePromo;
    }

   

    public int getPotonganPromo() {
        return potonganPromo;
    }

    public void setPotonganPromo(int potonganPromo) {
        this.potonganPromo = potonganPromo;
    }

    public String getLamaPromo() {
        return lamaPromo;
    }

    public void setLamaPromo(String lamaPromo) {
        this.lamaPromo = lamaPromo;
    }
}
