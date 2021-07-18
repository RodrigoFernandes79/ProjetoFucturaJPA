package br.fuctura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Endereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idEndereco;
	@Column(name="cep", nullable=false, length=60)
	private String cep;
	@Column(name="rua", nullable=false, length=60)
	private String rua;
	@Column(name="numero", nullable=false, length=10)
	private String numero;
	@Column(name="bairro", nullable=false, length=20)
	private String bairro;
	@Column(name="cidade", nullable=false, length=20)
	private String cidade;
	@Column(name="estado", nullable=false, length=5)
	private String estado;
	@ManyToOne
	private Cliente cliente;
	
	public Long getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", cep=" + cep + ", rua=" + rua + ", numero=" + numero
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cliente=" + cliente + "]";
	}
	
	
	

}
