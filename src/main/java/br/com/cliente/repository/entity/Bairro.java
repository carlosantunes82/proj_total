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
@Table(name = "bairro")
@Data
public class Bairro  {

	@Id
	@GeneratedValue
	private Long id;
	
	private String bairro;
	
	@OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
	private List<Cidade> cidades;

}
