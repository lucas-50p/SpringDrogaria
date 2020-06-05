package br.lucas.bp.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lucas.bp.drogaria.domain.Produto;

/*extends quando eu quero fazer herança
 * JpaRepository: Ele remete a persistencia generica que costuma codificar antigamente
 * Ele tem o buscar, buscarAll,findAllById: encontrar todos pela chave primaria, salvar......
 * Short: chave primaria do produto.Class*/
public interface ProdutoRepository extends JpaRepository<Produto, Short>{

}
