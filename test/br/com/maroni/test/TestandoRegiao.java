package br.com.maroni.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import br.com.jove.modelo.Regiao;

public class TestandoRegiao {

	@SuppressWarnings("unchecked")
	@Test
	public void buscandoRegiao(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPATestes");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("FROM Regiao");
		query.setMaxResults(20);
		
		List<Regiao> regioes = query.getResultList();
		
		for (Regiao regiao : regioes) {
			System.out.println(regiao.getIdRegiao()+" | "+regiao.getRegiao()+" | "+regiao.getUf().getUf());
		}
		
	}
	
}
