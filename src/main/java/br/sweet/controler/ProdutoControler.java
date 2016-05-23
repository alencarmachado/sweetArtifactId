package br.sweet.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoControler {

	@RequestMapping("testeProduto")
	public String teste(){
		System.out.println("chamou controler ...");
		return "produto/produto";
	}
	
}
