package br.com.cliente.repository.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tipo_endereco")
@Data
public class TipoEndereco  {

	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;

	@OneToMany(mappedBy = "tipoEndereco", cascade = CascadeType.ALL)
	private List<Endereco> enderecos;
}
