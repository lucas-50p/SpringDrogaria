package br.lucas.bp.drogaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.lucas.bp.drogaria.domain.Categoria;
import br.lucas.bp.drogaria.repository.CategoriaRepository;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
	
	/*findAll(): Ele recupera all registros da tabela*/
	
	@Autowired//Injetar a minha instancia
	private CategoriaRepository categoriaRepository;
	
	/*@GetMapping: Usado muito para consultas
	 * o lista tudo  só chamar getMapping*/
	@GetMapping//Ele é um requestMapping aonde o método de solitação requisição é get igual esse exemplo(@requestMapping(method = RequestMethod.get))
	public List<Categoria> listar(){
		List<Categoria>categorias = categoriaRepository.findAll();
		return categorias;
	}
}
