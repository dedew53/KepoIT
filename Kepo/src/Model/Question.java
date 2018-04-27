/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Ishaq Fakhrozi
 */
@Entity
public class Question implements Serializable {

    @ManyToOne
    private User user;

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Question")
    private Long id;
    @Column(name = "Posting")
    private String Posting;
    @Column(name = "Title")
    private String Title;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "Tgl_Question")
    private Date tglQuestion;
    @Column(name = "ClapQuestion")
    private String ClapQuestion;
    

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
        if (!(object instanceof Question)) {
            return false;
        }
        Question other = (Question) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Question[ id=" + getId() + " ]";
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
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
     * @return the Posting
     */
    public String getPosting() {
        return Posting;
    }

    /**
     * @param Posting the Posting to set
     */
    public void setPosting(String Posting) {
        this.Posting = Posting;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the tglQuestion
     */
    public Date getTglQuestion() {
        return tglQuestion;
    }

    /**
     * @param tglQuestion the tglQuestion to set
     */
    public void setTglQuestion(Date tglQuestion) {
        this.tglQuestion = tglQuestion;
    }

    /**
     * @return the ClapQuestion
     */
    public String getClapQuestion() {
        return ClapQuestion;
    }

    /**
     * @param ClapQuestion the ClapQuestion to set
     */
    public void setClapQuestion(String ClapQuestion) {
        this.ClapQuestion = ClapQuestion;
    }
    
}
