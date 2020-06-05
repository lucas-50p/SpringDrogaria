package br.lucas.bp.drogaria.domain;

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
@Entity
public class Categoria {
	
	/*Mudei Byte para Short, a geração da chave primaria auto incremento no está implementada para Byte
	 * só implementada a partir do short motivo JPA*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(length = 50, nullable = false, unique = true)
	private String nome;
}
