package com.example.cobajpa.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Answer {
	  private static long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    @Column(name = "Id_Answer")
	    private Long id;
	    @Column(name = "PostKoment")
	    private String postKoment;
	    @Temporal(javax.persistence.TemporalType.DATE)
	    @Column(name = "tglAnswer")
	    private Date tglAnswer;
	    @Column(name = "ClapAnswer")
	    private int clapAnswer;
	    @ManyToOne
	    private Pengguna user;
	    @ManyToOne
	    private Question question;
	    
//	    @PrePersist
//	    public void tanggalkomen(){
//	       tglAnswer= new Date();
//	       
//	    }
	  

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
	        if (!(object instanceof Answer)) {
	            return false;
	        }
	        Answer other = (Answer) object;
	        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Model.Answer[ id=" + getId() + " ]";
	    }

	    /**
	     * @return the user
	     */
	    public Pengguna getUser() {
	        return user;
	    }

	    /**
	     * @param user the user to set
	     */
	    public void setUser(Pengguna user) {
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
	     * @return the PostKoment
	     */
	    public String getPostKoment() {
	        return postKoment;
	    }

	    /**
	     * @param PostKoment the PostKoment to set
	     */
	    public void setPostKoment(String PostKoment) {
	        this.postKoment = PostKoment;
	    }

	    /**
	     * @return the tglAnswer
	     */
	    public Date getTglAnswer() {
	        return tglAnswer;
	    }

	    /**
	     * @param tglAnswer the tglAnswer to set
	     */
	    public void setTglAnswer(Date tglAnswer) {
	        this.tglAnswer = tglAnswer;
	    }

	    /**
	     * @return the ClapAnswer
	     */
	    public int getClapAnswer() {
	        return clapAnswer;
	    }

	    /**
	     * @param ClapAnswer the ClapAnswer to set
	     */
	    public void setClapAnswer(int ClapAnswer) {
	        this.clapAnswer = ClapAnswer;
	    }

	    /**
	     * @return the question
	     */
	    public Question getQuestion() {
	        return question;
	    }

	    /**
	     * @param question the question to set
	     */
	    public void setQuestion(Question question) {
	        this.question = question;
	    }
}
