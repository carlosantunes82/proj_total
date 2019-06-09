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
@Table(name = "tipo_telefone")
@Data
public class TipoTelefone  {

	@Id
	@GeneratedValue
	private Long id;
	
	private String tipo;
	
	@OneToMany(mappedBy = "tipoTelefone", cascade = CascadeType.ALL)
	private List<Telefone> telefones;
}
