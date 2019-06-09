package br.com.cliente.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.LazyInitializationException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import br.com.cliente.dto.ClienteDto;
import br.com.cliente.dto.EnderecoDto;
import br.com.cliente.dto.TelefoneDto;
import br.com.cliente.repository.ClienteRepository;
import br.com.cliente.repository.EnderecoRepository;
import br.com.cliente.repository.entity.Cliente;
import br.com.cliente.repository.entity.Endereco;
import br.com.cliente.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	public ClienteRepository clienteRepository;
	
	@Autowired
	public EnderecoRepository enderecoRepository;

	public List<ClienteDto> listarClientes(){
		return parseClienteDto((List<Cliente>) clienteRepository.findAll());
	}
	
	public List<ClienteDto> parseClienteDto(List<Cliente> listaCliente) {
		List<ClienteDto> listaClienteDto = new ArrayList<>();
		
		listaCliente.stream().forEach(cliente -> {
			ClienteDto clienteDto = new ClienteDto();
			BeanUtils.copyProperties(cliente, clienteDto); 
			listaClienteDto.add(copyOthersProperties(cliente));
		});
		
		return listaClienteDto;
	}
	
	public ClienteDto copyOthersProperties(Cliente cliente){
		
		ModelMapper mapper = new ModelMapper();
//		ClienteDto clienteDto = mapper.map(cliente, ClienteDto.class);
		ClienteDto clienteDto = new ClienteDto();
		mapper.map(cliente, clienteDto);
		
		if(!CollectionUtils.isEmpty(cliente.getTelefones())) {
			List<TelefoneDto> telefonesDto = new ArrayList<>();
			cliente.getTelefones().stream().forEach(
					telefone -> {
						TelefoneDto telefoneDto = new TelefoneDto();	
						BeanUtils.copyProperties(telefone, telefoneDto);
//						telefoneDto = mapperTel.map(telefone, TelefoneDto.class);
						telefonesDto.add(telefoneDto);
					});
			clienteDto.setTelefonesDto(telefonesDto);
		}
		
		try {
			if(!CollectionUtils.isEmpty(cliente.getEnderecos())) {
				List<EnderecoDto> enderecosDto = new ArrayList<>();
				cliente.getEnderecos().stream().forEach(
						endereco -> {
							EnderecoDto enderecoDto = new EnderecoDto(); 
							mapper.map(endereco, enderecoDto);
							enderecosDto.add(enderecoDto);
							
						});
				clienteDto.setEnderecosDto(enderecosDto);
			}
		} catch (LazyInitializationException e) {
			cliente.setEnderecos((List<Endereco>) enderecoRepository.findAll());
			
			List<EnderecoDto> enderecosDto = new ArrayList<>();
			cliente.getEnderecos().stream().forEach(
					endereco -> {
						EnderecoDto enderecoDto = new EnderecoDto(); 
						mapper.map(endereco, enderecoDto);
						enderecosDto.add(enderecoDto);
						
					});
			clienteDto.setEnderecosDto(enderecosDto);
		}
		
		return clienteDto;
		
	}
}
