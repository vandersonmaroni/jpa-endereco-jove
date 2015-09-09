package br.com.maroni.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import br.com.jove.modelo.Endereco;

public class TestandoEndereco {

	@SuppressWarnings("unchecked")
	@Test
	public void buscandoEndereco() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPATestes");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("FROM Endereco");
		query.setMaxResults(20);

		List<Endereco> enderecos = query.getResultList();

		for (Endereco endereco : enderecos) {
			System.out.println(endereco.getCep() + " | " + endereco.getEndereco() + " | " + endereco.getBairro().getBairro() + " | " + endereco.getCidade().getCidade());
		}
	}

}
