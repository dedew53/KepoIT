/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Ishaq Fakhrozi
 */
@Entity
public class Barang1 implements Serializable {

    @OneToMany(mappedBy = "barang")
    private List<DetailTransaksi> detailTransaksis;

   
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Nama;
    private String KodeBarang;
    private String Deskripsi;
    private String Tipe;
    String Harga;
    private int DP;
    private String Promo;
    
    @ManyToOne
    Pabrik pabrik;
   
    @ManyToOne
    Penyimpanan gudang;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang1)) {
            return false;
        }
        Barang1 other = (Barang1) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Barang1[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the KodeBarang
     */
    public String getKodeBarang() {
        return KodeBarang;
    }

    /**
     * @param KodeBarang the KodeBarang to set
     */
    public void setKodeBarang(String KodeBarang) {
        this.KodeBarang = KodeBarang;
    }

    /**
     * @return the Deskripsi
     */
    public String getDeskripsi() {
        return Deskripsi;
    }

    /**
     * @param Deskripsi the Deskripsi to set
     */
    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    /**
     * @return the Tipe
     */
    public String getTipe() {
        return Tipe;
    }

    /**
     * @param Tipe the Tipe to set
     */
    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    /**
     * @return the stock
     */


    /**
     * @return the detailTransaksis
     */
    public List<DetailTransaksi> getDetailTransaksis() {
        return detailTransaksis;
    }

    /**
     * @param detailTransaksis the detailTransaksis to set
     */
    public void setDetailTransaksis(List<DetailTransaksi> detailTransaksis) {
        this.detailTransaksis = detailTransaksis;
    }


    /**
     * @return the Status
     */
  

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the DP
     */
    public int getDP() {
        return DP;
    }

    /**
     * @param DP the DP to set
     */
    public void setDP(int DP) {
        this.DP = DP;
    }

    /**
     * @return the Promo
     */
    public String getPromo() {
        return Promo;
    }

    /**
     * @param Promo the Promo to set
     */
    public void setPromo(String Promo) {
        this.Promo = Promo;
    }

   
    /**
     * @return the pesanans
     */


    /**
     * @return the Frame
     */
  

   
    
}
