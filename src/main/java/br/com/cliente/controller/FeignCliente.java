package br.com.cliente.controller;

import java.net.URI;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.cliente.dto.ClienteDto;

@FeignClient(url = "0", name = "feignCliente")
public interface FeignCliente {

	@GetMapping
	List<ClienteDto> listarClientes(URI url);
}
