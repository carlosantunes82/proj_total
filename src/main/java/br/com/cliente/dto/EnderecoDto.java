package br.com.cliente.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class EnderecoDto  {

	private Long id;
	
	private String rua;
	
	private int numero;
	
	private CidadeDto cidade;
	
	private BairroDto bairro;	
	
	private TipoEnderecoDto tipoEndereco;	
	
	private CepDto cep;
	
	@JsonIgnore
	private ClienteDto cliente;	
}
