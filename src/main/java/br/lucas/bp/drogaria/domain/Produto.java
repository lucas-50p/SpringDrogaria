package br.lucas.bp.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity//Representa uma Tabela
public class Produto {
	/*tipos primitivos em minusculo tem value padrao 0(não aceita valores nulos)
	 * banco tem valores nulos
	 * Wrappers class representam tipos
	 * BigDecimal: preço, altura, preço
	 * nullable = false : Campo é Obrigatorio 
	 * unique = true: no pode repetir ex: nome, cpf....
	 * Precision: é ototal de dígitos do número considerando antes e depois da virgula
	 * Scale: total de dígitos depois da virgula*/
	
	@Id//Chave primaria manual,eu vou fornecer os valores
	@GeneratedValue(strategy = GenerationType.IDENTITY)//(automatica)Qual tipo da geração da chave primaria
	private Short codigo;
	
	@Column(length = 50, nullable = false, unique = true)//Tamanho 50 caracteres
	private String nome;
	
	@Column(nullable = false)
	private Byte quantidade;
	
	@Column(nullable = false, precision = 5, scale = 2)//5,2 representam até R$ 999,99
	private BigDecimal preco;
	
	@Column(nullable = true)//Não obrigatorio
	private LocalDate dataDeValidade;
	
	
	
	
}
