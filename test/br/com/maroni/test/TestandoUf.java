package br.com.maroni.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import br.com.jove.modelo.Uf;

public class TestandoUf {

	@SuppressWarnings("unchecked")
	@Test
	public void buscandoUf(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPATestes");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("FROM Uf");
		query.setMaxResults(20);
		
		List<Uf> ufs = query.getResultList();
		
		for (Uf uf : ufs) {
			System.out.println(uf.getUf()+ " | " +uf.getEstado()+" | "+uf.getCodigoIbge());
		}
	}
	
}
