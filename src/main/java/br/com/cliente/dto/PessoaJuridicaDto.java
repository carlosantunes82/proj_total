package br.com.cliente.dto;

import lombok.Data;

@Data
public class PessoaJuridicaDto  {

	private Long id;
	
	private String razaoSocial;
	
	private Long cnpj;
	
	private String nomeFantasia;
	
}
