package br.com.cliente.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cliente.repository.entity.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{

//	List<Cliente> findAll();
}
