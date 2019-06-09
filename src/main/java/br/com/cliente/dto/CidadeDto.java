package br.com.cliente.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class CidadeDto  {

	private Long id;
	
	private String descricao;
	
	private EstadoDto estado;
	
	@JsonIgnore
	private List<EnderecoDto> enderecos;
}
