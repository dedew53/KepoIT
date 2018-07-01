package com.example.cobajpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Pengguna {
	 	@OneToMany(mappedBy = "user")
		@JsonIgnore
	    private List<Answer> answers;

	    @OneToMany(mappedBy = "user")
		@JsonIgnore
	    private List<Question> questions;

	    /**
	     * @return the Email
	     */
	    public String getEmail() {
	        return email;
	    }

	    /**
	     * @param Email the Email to set
	     */
	    public void setEmail(String Email) {
	        this.email = Email;
	    }

	    private static long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    @Column(name = "User_id")
	    
	    private Long id;
	    @Column(name = "Nama")
	    private String nama;
	    @Column(name = "FotoProfil", nullable=true)
	    private String fotoProfil;
		@Column(name = "Username", unique = true)
	    private String username;
	    @Column(name = "Password")
	    private String password;
	    @Column(name = "Email", unique=true)
	    private String email;
	    @Column(name = "Rating", nullable=true)
	    private int rating;
		@Column(name = "Alamat")
	    private String Alamat;
		@Column(name = "NoHp")
		private String noHp;
//	    private String Status;
	    
//	    @PrePersist
//	    public void tanggalkomen(){
//	         StatusDAO sdao = new StatusDAOimpl();
//	       Status=tdao.getById(1);
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
	        if (!(object instanceof Pengguna)) {
	            return false;
	        }
	        Pengguna other = (Pengguna) object;
	        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Model.User[ id=" + getId() + " ]";
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
	     * @return the Nama
	     */
	    public String getNama() {
	        return nama;
	    }

	    /**
	     * @param Nama the Nama to set
	     */
	    public void setNama(String Nama) {
	        this.nama = Nama;
	    }
	    public String getFotoProfil() {
			return fotoProfil;
		}

		public void setFotoProfil(String fotoProfil) {
			this.fotoProfil = fotoProfil;
		}

	    /**
	     * @return the Username
	     */
	    public String getUsername() {
	        return username;
	    }

	    /**
	     * @param Username the Username to set
	     */
	    public void setUsername(String Username) {
	        this.username = Username;
	    }

	    /**
	     * @return the Password
	     */
	    public String getPassword() {
	        return password;
	    }

	    /**
	     * @param Password the Password to set
	     */
	    public void setPassword(String Password) {
	        this.password = Password;
	    }

	    /**
	     * @return the Rating
	     */
	    public int getRating() {
	        return rating;
	    }

	    /**
	     * @param Rating the Rating to set
	     */
	    public void setRating(int Rating) {
	        this.rating = Rating;
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

	    /**
	     * @return the questions
	     */
	    public List<Question> getQuestions() {
	        return questions;
	    }

	    /**
	     * @param questions the questions to set
	     */
	    public void setQuestions(List<Question> questions) {
	        this.questions = questions;
	    }

	public String getAlamat() {
		return Alamat;
	}

	public void setAlamat(String alamat) {
		Alamat = alamat;
	}

	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}
}
