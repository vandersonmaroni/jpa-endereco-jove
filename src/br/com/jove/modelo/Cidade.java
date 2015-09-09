package br.com.jove.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tend_cidade")
public class Cidade implements Serializable {

	private static final long serialVersionUID = -3204104410492869844L;

	@Id
	@Column(name="id_cidade")
	private int idCidade;
	
	private String cidade;
	
	@Column(name="codigo_ibge")
	private int codigoIBGE;
	
	@ManyToOne
	@JoinColumn(name="id_regiao")
	private Regiao regiao;
	
	@Column(name="somente_nfs")
	private boolean somenteNfs;
	
	@Column(name="aliquota_iss")
	private double aliquotaIss;
	
	@ManyToOne
	@JoinColumn(name="uf")
	private Uf uf;

	/**
	 * @return the idCidade
	 */
	public int getIdCidade() {
		return idCidade;
	}

	/**
	 * @param idCidade the idCidade to set
	 */
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the codigoIBGE
	 */
	public int getCodigoIBGE() {
		return codigoIBGE;
	}

	/**
	 * @param codigoIBGE the codigoIBGE to set
	 */
	public void setCodigoIBGE(int codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}

	/**
	 * @return the regiao
	 */
	public Regiao getRegiao() {
		return regiao;
	}

	/**
	 * @param regiao the regiao to set
	 */
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	/**
	 * @return the somenteNfs
	 */
	public boolean isSomenteNfs() {
		return somenteNfs;
	}

	/**
	 * @param somenteNfs the somenteNfs to set
	 */
	public void setSomenteNfs(boolean somenteNfs) {
		this.somenteNfs = somenteNfs;
	}

	/**
	 * @return the aliquotaIss
	 */
	public double getAliquotaIss() {
		return aliquotaIss;
	}

	/**
	 * @param aliquotaIss the aliquotaIss to set
	 */
	public void setAliquotaIss(double aliquotaIss) {
		this.aliquotaIss = aliquotaIss;
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

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCidade;
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
		Cidade other = (Cidade) obj;
		if (idCidade != other.idCidade)
			return false;
		return true;
	}
	
	
	
	
	
	
}
