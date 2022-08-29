package br.com.andre.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.andre.loja.modelo.Produto;

public class CadastroProdutos {

	public static void main(String[] args) {
		
		Produto celular = new Produto();
		celular.setNome("Xiaomi");
		celular.setDescricao("Verde");
		celular.setPreco(new BigDecimal("800"));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
	}

}
