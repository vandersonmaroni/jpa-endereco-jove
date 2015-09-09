package br.com.maroni.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import br.com.jove.modelo.Cidade;

public class TestandoCidade {
	
	@SuppressWarnings("unchecked")
	@Test
	public void buscarCidade() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPATestes");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("FROM Cidade");
		query.setMaxResults(20);
		
		List<Cidade> cidades = query.getResultList();
		
		for (Cidade cidade : cidades) {
			
			System.out.println(cidade.getIdCidade()+" | "+cidade.getCidade()+" | "+cidade.getCodigoIBGE()+" | "+cidade.getRegiao().getIdRegiao()+" | "+cidade.getUf().getUf());
			
		}
	}

}
