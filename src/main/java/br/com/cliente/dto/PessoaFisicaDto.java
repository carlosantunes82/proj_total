package br.com.cliente.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PessoaFisicaDto  {

	private Long id;
	private String nome;
	private Long cpf;
	private Long rg;
	private Date dataNascimento;
	private String sexo;
}
