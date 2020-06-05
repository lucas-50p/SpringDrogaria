package br.lucas.bp.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
	/*tipos primitivos em minusculo tem value padrao 0(não aceita valores nulos)
	 * banco tem valores nulos
	 * Wrappers class representam tipos
	 * BigDecimal: preço, altura, preço */
	
	private Short codigo;
	private String nome;
	private Byte quantidade;	
	private BigDecimal preco;
	private LocalDate dataDeValidade;
	
	
	
	
}
