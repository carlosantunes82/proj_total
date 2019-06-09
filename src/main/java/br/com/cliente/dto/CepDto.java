package br.com.cliente.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class CepDto  {

	private Long id;
	
	private String cep;

	@JsonIgnore
	private List<EnderecoDto> enderecos;
}
