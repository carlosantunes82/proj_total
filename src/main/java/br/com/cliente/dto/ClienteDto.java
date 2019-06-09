package br.com.cliente.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class ClienteDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String email;
	
	private PessoaFisicaDto idPf;

	private PessoaJuridicaDto idPj;
	
	private List<TelefoneDto> telefonesDto;
	
	private List<EnderecoDto> enderecosDto;
	
}
