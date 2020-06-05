package br.lucas.bp.drogaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Class que vai gerar serviços
 * caminho Path()
 * quando for chamar esse serviço ("/drogaria")
 * DevTolls: Ferramenta de auto-carregamento, precisa add com botão direito no project procurar spring edit starters
 * application.properties:Update--- inserir(incluir algo new) um novo atributo para entidade, inseriu uma chave estrangeira
 * application.properties:Validate--- (remover, editar)trocou o tamanho do campo, trocou a chave estrangeira, atualizou uma prapriedade da entidade*/
@RestController//Controlador
@RequestMapping("/drogaria")//Caminho do controlador
public class DrogariaController {
	@RequestMapping("/hello")//Transforma um metodo em serviço
	public String exibirMensagem() {
		return "Olá mundo!!!";
	}
}
