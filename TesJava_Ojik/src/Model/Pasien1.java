/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Ishaq Fakhrozi
 */
@Entity
public class Pasien1 implements Serializable {

    @OneToMany(mappedBy = "pasien1")
    private List<Outlet> outlets;

    @OneToMany(mappedBy = "pasien")
    private List<Login> logins;
  

    @OneToMany(mappedBy = "pasien")
    private List<DetailTransaksi> detailTransaksis;

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int idPasien;
    private String Nama;
    private String tglLahir;
    private String alamat;
    private String noHp;
    private String kodePasien;
    private String Notifikasi;
    
    @ManyToOne
    Test1 tes;
    
  

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
        if (!(object instanceof Pasien1)) {
            return false;
        }
        Pasien1 other = (Pasien1) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Pasien1[ id=" + getId() + " ]";
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
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the noHp
     */
    public String getNoHp() {
        return noHp;
    }

    /**
     * @param noHp the noHp to set
     */
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

  

  

    /**
     * @return the kodePasien
     */
    public String getKodePasien() {
        return kodePasien;
    }

    /**
     * @param kodePasien the kodePasien to set
     */
    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

 
 

    /**
     * @return the test
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
     * @return the tglLahir
     */
    public String getTglLahir() {
        return tglLahir;
    }

    /**
     * @param tglLahir the tglLahir to set
     */
    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    /**
     * @return the Jadwal
     */
  

    /**
     * @return the Reminder
     */
  

    /**
     * @return the Notifikasi
     */
    public String getNotifikasi() {
        return Notifikasi;
    }

    /**
     * @param Notifikasi the Notifikasi to set
     */
    public void setNotifikasi(String Notifikasi) {
        this.Notifikasi = Notifikasi;
    }

    /**
     * @return the test1s
     */

    
}
