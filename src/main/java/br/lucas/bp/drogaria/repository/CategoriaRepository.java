package br.lucas.bp.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lucas.bp.drogaria.domain.Categoria;

/*Id da categoria é Byte
 * CategoriaRepository  tem editar, salvar, excluir, listar, buscar ...*/
public interface CategoriaRepository extends JpaRepository<Categoria, Byte>{

}
