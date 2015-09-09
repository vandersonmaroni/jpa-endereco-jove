package br.com.jove.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tend_bairro")
public class Bairro {

	@Id
	@Column(name="id_bairro")
	private int idBairro;
	
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name="id_cidade")
	private Cidade cidade;

	/**
	 * @return the idBairro
	 */
	public int getIdBairro() {
		return idBairro;
	}

	/**
	 * @param idBairro the idBairro to set
	 */
	public void setIdBairro(int idBairro) {
		this.idBairro = idBairro;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	
	/**
	 * @return the cidade
	 */
	public Cidade getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idBairro;
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
		Bairro other = (Bairro) obj;
		if (idBairro != other.idBairro)
			return false;
		return true;
	}
	
	
	
}
