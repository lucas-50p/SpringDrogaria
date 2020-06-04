package br.lucas.bp.drogaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Class que vai gerar serviços
 * caminho Path()
 * quando for chamar esse serviço ("/drogaria")*/
@RestController("/drogaria")
public class DrogariaController {
	@RequestMapping("/Hello")//Transforma um metodo em serviço
	public String exibirMensagem() {
		return "Hello world!";
	}
}
