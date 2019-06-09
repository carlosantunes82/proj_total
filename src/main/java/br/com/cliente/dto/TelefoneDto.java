package br.com.cliente.dto;

import lombok.Data;

@Data
public class TelefoneDto  {

	private Long id;
	
	private int ddd;
	
	private long numero;
	
	private TipoTelefoneDto idTipoTelefone;
	
	private ClienteDto idCliente;


}
