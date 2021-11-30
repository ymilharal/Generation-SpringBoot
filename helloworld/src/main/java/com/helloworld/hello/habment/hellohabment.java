package com.helloworld.hello.habment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloo")
public class hellohabment {
	@GetMapping()
	public String habilidades() {
		return "\t\t\t\t\t===Habilidades e mentalidades==="
				+ "\n Utilizei a mentalidade de Persistencia pois eu me mantive positiva mesmo em meio "
				+ "aos erros do codigo e não desisti depois dos erros."
				+ "Utilizei a habilidade de atenção aos detalhes para perceber os erros de forma rapida, verifiquei e mantive o foco.";
	}
}