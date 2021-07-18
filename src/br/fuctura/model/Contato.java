package br.fuctura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Contato")
public class Contato {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long idContato;
		@Column(name="ddd", nullable=false, length=5)
		private String ddd;
		@Column(name="numero", nullable=false, length=15)
		private String numero;
		@ManyToOne
		private Cliente cliente;
		
		public Long getIdContato() {
			return idContato;
		}
		public void setIdContato(Long idContato) {
			this.idContato = idContato;
		}
		public String getDdd() {
			return ddd;
		}
		public void setDdd(String ddd) {
			this.ddd = ddd;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		
		
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		@Override
		public String toString() {
			return "Contato [idContato=" + idContato + ", ddd=" + ddd + ", numero=" + numero + ", cliente=" + cliente
					+ "]";
		}
		
}
