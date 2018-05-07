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
import javax.persistence.OneToOne;

/**
 *
 * @author Ishaq Fakhrozi
 */
@Entity
public class AhliKacamata implements Serializable {

    @OneToMany(mappedBy = "ahliKacamata")
    private List<Outlet> outlets;

   

    @OneToMany(mappedBy = "ahliKacamata")
    private List<Test1> test1s;

  

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String NamaAhli;
    private String Jadwal;
   
    
  
  
    
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
        if (!(object instanceof AhliKacamata)) {
            return false;
        }
        AhliKacamata other = (AhliKacamata) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.AhliKacamata[ id=" + getId() + " ]";
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
     * @return the NamaAhli
     */
    public String getNamaAhli() {
        return NamaAhli;
    }

    /**
     * @param NamaAhli the NamaAhli to set
     */
    public void setNamaAhli(String NamaAhli) {
        this.NamaAhli = NamaAhli;
    }

    /**
     * @return the Jadwal
     */
    public String getJadwal() {
        return Jadwal;
    }

    /**
     * @param Jadwal the Jadwal to set
     */
    public void setJadwal(String Jadwal) {
        this.Jadwal = Jadwal;
    }

    /**
     * @return the test1s
     */
    public List<Test1> getTest1s() {
        return test1s;
    }

    /**
     * @param test1s the test1s to set
     */
    public void setTest1s(List<Test1> test1s) {
        this.test1s = test1s;
    }

  

   
       
}
