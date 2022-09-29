package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")


public class ObjetivosController {
	@GetMapping
	public String objetivos() {
		return "Os meus objetivos de aprendizagem dessa semana são: <br>"
				+ "Revisar conteúdo de SQL, <br>"
				+ "Estudar conteúdo de Spring. <br>";
	}
}
