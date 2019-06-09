package br.com.cliente.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "telefone")
@Data
public class Telefone  {

	@Id
	@GeneratedValue
	private Long id;
	
	private int ddd;
	
	private long numero;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_TIPO_TELEFONE", referencedColumnName = "id")
	private TipoTelefone tipoTelefone;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "id")
	private Cliente cliente;

}
