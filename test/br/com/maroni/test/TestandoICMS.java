package br.com.maroni.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import br.com.jove.modelo.AliquotaICMS;

public class TestandoICMS {

	@Test
	public void RunICMS(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPATestes");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("FROM AliquotaICMS");
		query.setMaxResults(20);
		@SuppressWarnings("unchecked")
		List<AliquotaICMS> listaAliquota = query.getResultList();
		
		
		for (AliquotaICMS aliquotaICMS : listaAliquota) {
			System.out.println(aliquotaICMS.getAliquotaICMS()+ " | " + aliquotaICMS.getId().getUfDestino()+ " | " + aliquotaICMS.getId().getUfOrigem());
		}
		
		
	}
	
}
