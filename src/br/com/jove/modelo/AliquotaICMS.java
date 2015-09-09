package br.com.jove.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tend_aliquota_icms")
public class AliquotaICMS implements Serializable {

	private static final long serialVersionUID = -2518430807696832293L;

	@EmbeddedId
	private AliquotaICMSPK id;
	
	
	@Column(name="aliquota_icms")
	private double aliquotaICMS;

	/**
	 * @return the aliquotaICMS
	 */
	public double getAliquotaICMS() {
		return aliquotaICMS;
	}

	/**
	 * @param aliquotaICMS the aliquotaICMS to set
	 */
	public void setAliquotaICMS(double aliquotaICMS) {
		this.aliquotaICMS = aliquotaICMS;
	}

	/**
	 * @return the id
	 */
	public AliquotaICMSPK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(AliquotaICMSPK id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		AliquotaICMS other = (AliquotaICMS) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
