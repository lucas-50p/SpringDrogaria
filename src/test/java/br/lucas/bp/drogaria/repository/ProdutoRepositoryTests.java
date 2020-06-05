package br.lucas.bp.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.lucas.bp.drogaria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	/*null: estou persistindo no banco no preciso da  chave primaria*/
	@Autowired//Gerenciar os obj, vai injetar uma instância nesse obj
	private ProdutoRepository ProdutoRepository;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(null, "Coca Cola", 
				Byte.valueOf("15"), 
				BigDecimal.valueOf(10.50),
				LocalDate.of(2011, 11, 23),
				null);
		Produto p2 = new Produto(null,
				"Skoll", Byte.valueOf("23"), 
				BigDecimal.valueOf(8.00),
				LocalDate.of(2022, 4, 1),
				null
				);
		
		ProdutoRepository.save(p1);
		ProdutoRepository.save(p2);
	}
}
