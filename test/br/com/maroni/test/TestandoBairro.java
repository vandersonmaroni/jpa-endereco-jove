package br.com.maroni.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import br.com.jove.modelo.Bairro;

public class TestandoBairro {

	@Test
	@SuppressWarnings("unchecked")
	public void buscandoBairro() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPATestes");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("FROM Bairro");
		query.setMaxResults(20);
		
		List<Bairro> bairros = query.getResultList();
		
		for (Bairro bairro : bairros) {
			System.out.println(bairro.getIdBairro()+" | "+bairro.getBairro()+" | "+bairro.getCidade().getIdCidade());
		}
	}
}
