package br.fuctura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCliente;
	@Column(name="nome", nullable=false, length=60 )
	private String nome;
	@Column(name="cpf", nullable=false, length=20 )
	private String cpf;
	@Column(name="sexo", nullable=false, length=10 )
	private String sexo;
	@Column(name="anoNascim", nullable=false, length=10 )
	private String anoNascim;
	
	
	
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getAnoNascim() {
		return anoNascim;
	}
	public void setAnoNascim(String anoNascim) {
		this.anoNascim = anoNascim;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", anoNascim="
				+ anoNascim + "]";
	}
	
	
	

}
