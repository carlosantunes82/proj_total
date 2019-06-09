package br.com.cliente.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cliente.dto.ClienteDto;
import br.com.cliente.service.impl.ClienteServiceImpl;

@RestController
@RequestMapping("cliente")
public class ClienteController {

	@Autowired
	public ClienteServiceImpl clienteService;
	
	@Autowired
	public FeignCliente feignCliente;

	@GetMapping(path = "v1/clientes")
	public List<ClienteDto> listarClientes(){
		List<ClienteDto> listaCliente = new ArrayList<ClienteDto>();
		listaCliente = clienteService.listarClientes();
		/*try {
			listaCliente = feignCliente.listarClientes(new URI("v1/clientes"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}*/
		return listaCliente;
	}
}
