package br.com.cliente.service;

import java.util.List;

import br.com.cliente.dto.ClienteDto;

public interface ClienteService{

	List<ClienteDto> listarClientes();
}
