package com.helloworld.hello.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellooo")
public class helloobjetos {
	@GetMapping()
	public String objetivos() {
		return "Essa semana meus objetivos são conseguir seguir minha rotina, não surtar, absorver o conteudo da melhor maneira possivel.";
	}
}