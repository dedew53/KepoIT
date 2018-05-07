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
public class Test1 implements Serializable {

    @OneToMany(mappedBy = "tes")
    private List<Pasien1> pasien1s;


    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tgl;
    private String jam;
    private String resep;
    private Date tglOrderTerakhir;
    private String bookingjadwal ;
    
    @ManyToOne
    private AhliKacamata ahliKacamata;
  
    
    @ManyToOne
    Outlet outlet;
    
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
        if (!(object instanceof Test1)) {
            return false;
        }
        Test1 other = (Test1) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Test1[ id=" + getId() + " ]";
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
     * @return the tgl
     */
    public Date getTgl() {
        return tgl;
    }

    /**
     * @param tgl the tgl to set
     */
    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    /**
     * @return the jam
     */
    public String getJam() {
        return jam;
    }

    /**
     * @param jam the jam to set
     */
    public void setJam(String jam) {
        this.jam = jam;
    }


 
    /**
     * @return the pasien1s
     */


    /**
     * @return the Jadwal
     */
    
    /**
     * @return the plusminus
     */
    public String getPlusminus() {
        return resep;
    }

    /**
     * @param plusminus the plusminus to set
     */
    public void setPlusminus(String resep) {
        this.resep = resep;
    }

    /**
     * @return the ahliKacamata
     */
    public AhliKacamata getAhliKacamata() {
        return ahliKacamata;
    }

    /**
     * @param ahliKacamata the ahliKacamata to set
     */
    public void setAhliKacamata(AhliKacamata ahliKacamata) {
        this.ahliKacamata = ahliKacamata;
    }

    /**
     * @return the pasien
     */
   
    
}
