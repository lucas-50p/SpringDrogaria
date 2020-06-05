package br.lucas.bp.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lucas.bp.drogaria.domain.Categoria;

/*Id da categoria é Byte
 * CategoriaRepository  tem editar, salvar, excluir, listar, buscar ...*/
/*Mudei Byte para Short, a geração da chave primaria auto incremento no está implementada para Byte
 * só implementada a partir do short motivo JPA*/
public interface CategoriaRepository extends JpaRepository<Categoria, Short>{

}
