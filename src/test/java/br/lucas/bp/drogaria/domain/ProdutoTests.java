package br.lucas.bp.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*Produtotests testa o produto*/
@SpringBootTest
public class ProdutoTests {
	@Test
	public void criar() {
		Produto p = new Produto(
			Short.valueOf("1"),
			"Coca Cola",
			Byte.valueOf("15"),
			BigDecimal.valueOf(10.50),
			LocalDate.of(2011, 11, 23),
			null
		);
		
	}
}
