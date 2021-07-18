package br.fuctura.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.fuctura.jpaUtil.JpaUtil;
import br.fuctura.model.Cliente;
import br.fuctura.model.Contato;
import br.fuctura.model.Endereco;


public class Main {

	public static void main(String[] args) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		
		tx.begin();
//		
		Cliente criaCliente = new Cliente();
//		criaCliente.setNome("Zé  da Bufa");
//		criaCliente.setCpf("0271-403");
//		criaCliente.setSexo("M");
//		criaCliente.setAnoNascim("1962");
//		criaCliente.setIdCliente(5l);
//		entityManager.merge(criaCliente);
//		criaCliente.setIdCliente(5l);
		Endereco criaEndereco = new Endereco();
//		criaEndereco.setCep("Sem Número");
//		criaEndereco.setRua("Rua das Pindaíbas");
//		criaEndereco.setNumero("101");
//		criaEndereco.setBairro("Jurubiraba");
//		criaEndereco.setCidade("Pombos");
//		criaEndereco.setEstado("PE");
		
//		criaEndereco.setCliente(criaCliente);
//		entityManager.persist(criaEndereco);
		
//		Contato criaContato = new Contato();
//		criaContato.setDdd("81");
//		criaContato.setNumero("9999-9155");
//		criaContato.setCliente(criaCliente);
//		
//		entityManager.persist(criaContato);
		
//		Query query = entityManager.createQuery("from Cliente c");
//		List<Cliente> listaCliente = query.getResultList();
//		
//		for(Cliente cliente:listaCliente) {
//			System.out.println(cliente);
			
			Query query = entityManager.createQuery("from Endereco e");
			List<Endereco> listaEndereco = query.getResultList();
			
			for(Endereco endereco:listaEndereco) {
				System.out.println(endereco);
		}
		
		tx.commit();
		entityManager.close();
		JpaUtil.close();
	}

}
