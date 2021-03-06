package br.com.cliente.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class BairroDto  {

	private Long id;
	
	private String bairro;
	
	@JsonIgnore
	private List<CidadeDto> cidades;

}
