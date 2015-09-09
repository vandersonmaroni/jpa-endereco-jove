package br.com.jove.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tend_regiao")
public class Regiao implements Serializable {

	private static final long serialVersionUID = -2742436665878830025L;

	@Id
	@Column(name="id_regiao")
	private int idRegiao;
	
	private String regiao;
	
	@ManyToOne
	@JoinColumn(name="uf")
	private Uf uf;

	/**
	 * @return the idRegiao
	 */
	public int getIdRegiao() {
		return idRegiao;
	}

	/**
	 * @param idRegiao the idRegiao to set
	 */
	public void setIdRegiao(int idRegiao) {
		this.idRegiao = idRegiao;
	}

	/**
	 * @return the regiao
	 */
	public String getRegiao() {
		return regiao;
	}

	/**
	 * @param regiao the regiao to set
	 */
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}



	/**
	 * @return the uf
	 */
	public Uf getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(Uf uf) {
		this.uf = uf;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRegiao;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Regiao other = (Regiao) obj;
		if (idRegiao != other.idRegiao)
			return false;
		return true;
	}
	
	
	
}
