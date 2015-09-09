package br.com.jove.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AliquotaICMSPK implements Serializable {

	private static final long serialVersionUID = -5831074642117248348L;

	@Column(name="uf_origem")
	private String ufOrigem;
	
	@Column(name="uf_destino")
	private String ufDestino;

	/**
	 * @return the ufOrigem
	 */
	public String getUfOrigem() {
		return ufOrigem;
	}

	/**
	 * @param ufOrigem the ufOrigem to set
	 */
	public void setUfOrigem(String ufOrigem) {
		this.ufOrigem = ufOrigem;
	}

	/**
	 * @return the ufDestino
	 */
	public String getUfDestino() {
		return ufDestino;
	}

	/**
	 * @param ufDestino the ufDestino to set
	 */
	public void setUfDestino(String ufDestino) {
		this.ufDestino = ufDestino;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ufDestino == null) ? 0 : ufDestino.hashCode());
		result = prime * result + ((ufOrigem == null) ? 0 : ufOrigem.hashCode());
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
		AliquotaICMSPK other = (AliquotaICMSPK) obj;
		if (ufDestino == null) {
			if (other.ufDestino != null)
				return false;
		} else if (!ufDestino.equals(other.ufDestino))
			return false;
		if (ufOrigem == null) {
			if (other.ufOrigem != null)
				return false;
		} else if (!ufOrigem.equals(other.ufOrigem))
			return false;
		return true;
	}
	
}
