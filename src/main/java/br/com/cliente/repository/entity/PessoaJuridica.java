package br.com.cliente.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "pessoa_juridica")
@Data
public class PessoaJuridica  {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "RAZAO_SOCIAL")
	private String razaoSocial;
	
	private Long cnpj;
	
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	
}
