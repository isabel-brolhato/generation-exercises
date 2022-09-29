package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {
	@GetMapping
	public String bsm() {
		return "As mentalidades são: <br>"
				+ "Responsabilidade Pessoal, <br>"
				+ "Mentalidade de Crescimento, <br>"
				+ "Mentalidade de Persistência, <br>"
				+ "Orientação ao futuro, <br>"
				+ "<br> As competências comportamentais são: <br>"
				+ "Comunicação, <br>"
				+ "Trabalho em equipe, <br>"
				+ "Proatividade, <br>"
				+ "Orientação ao detalhe. <br>";
			
	}
}
