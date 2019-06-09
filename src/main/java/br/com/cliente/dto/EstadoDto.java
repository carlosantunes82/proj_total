package br.com.cliente.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class EstadoDto  {

	private Long id;
	
	private String descricao;
	
	@JsonIgnore
	private List<CidadeDto> cidades;
}
