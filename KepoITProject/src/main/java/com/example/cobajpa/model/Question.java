package com.example.cobajpa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;


@Entity
public class Question {
	  @OneToMany(mappedBy = "question")
	    private List<Answer> answers;

	  

	    private static long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    @Column(name = "Id_Question")
	    private Long id;
	    @Column(name = "Posting")
	    private String posting;
	    @Column(name = "Title")
	    private String title;
	    @Temporal(javax.persistence.TemporalType.DATE)
	    @Column(name = "tgl_question")
	    private Date tgl_question;
	    

		@Column(name = "ClapQuestion")
	    private int clapQuestion;
	    @ManyToOne
	    private Pengguna user;
	    
	    @PrePersist
	    public void tanggalkomen(){
	    	tgl_question= new Date();
	    }
	    

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
	     * @return the Posting
	     */
	    public String getPosting() {
	        return posting;
	    }
	    
	    public Date getTgl_question() {
			return tgl_question;
		}


		public void setTgl_question(Date tgl_question) {
			this.tgl_question = tgl_question;
		}

	    /**
	     * @param Posting the Posting to set
	     */
	    public void setPosting(String Posting) {
	        this.posting = Posting;
	    }

	    /**
	     * @return the Title
	     */
	    public String getTitle() {
	        return title;
	    }

	    /**
	     * @param Title the Title to set
	     */
	    public void setTitle(String Title) {
	        this.title = Title;
	    }

	   
	   
	    /**
	     * @return the ClapQuestion
	     */
	    public int getClapQuestion() {
	        return clapQuestion;
	    }

	    /**
	     * @param ClapQuestion the ClapQuestion to set
	     */
	    public void setClapQuestion(int ClapQuestion) {
	        this.clapQuestion = ClapQuestion;
	    }

	    /**
	     * @return the answers
	     */
	    public List<Answer> getAnswers() {
	        return answers;
	    }

	    /**
	     * @param answers the answers to set
	     */
	    public void setAnswers(List<Answer> answers) {
	        this.answers = answers;
	    }
}
