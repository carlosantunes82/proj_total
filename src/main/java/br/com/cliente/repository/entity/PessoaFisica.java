package br.com.cliente.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "pessoa_fisica")
@Data
public class PessoaFisica  {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private Long cpf;
	private Long rg;
	
	@Column(name = "DT_NASCIMENTO")
	private Date dataNascimento;
	private String sexo;
}
