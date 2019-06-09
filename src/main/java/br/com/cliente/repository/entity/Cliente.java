package br.com.cliente.repository.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente  {

	@Id
	@GeneratedValue
	private Long id;
	
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_PF", referencedColumnName = "id")
	private PessoaFisica idPf;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="ID_PJ", referencedColumnName = "id")
	private PessoaJuridica idPj;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Telefone> telefones;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	
	private List<Endereco> enderecos;
	
}
