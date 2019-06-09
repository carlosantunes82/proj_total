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
@Table(name = "endereco")
@Data
public class Endereco  {

	@Id
	@GeneratedValue
	private Long id;
	
	private String rua;
	
	private int numero;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_CIDADE", referencedColumnName = "id")
	private Cidade cidade;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_BAIRRO", referencedColumnName = "id")
	private Bairro bairro;	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_TIPO_ENDERECO", referencedColumnName = "id")
	private TipoEndereco tipoEndereco;	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_CEP", referencedColumnName = "id")
	private Cep cep;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "id")
	private Cliente cliente;
}
