package br.com.cliente.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class TipoEnderecoDto  {

	private Long id;
	
	private String descricao;

	@JsonIgnore
	private List<EnderecoDto> enderecos;
}
